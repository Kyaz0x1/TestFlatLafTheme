package net.kyaz0x1.testflatlaftheme.events;

import net.kyaz0x1.testflatlaftheme.auth.AuthCredentials;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonLoginClickEvent implements ActionListener {

    private final JTextField txtUser;
    private final JTextField txtPassword;

    public ButtonLoginClickEvent(JTextField txtUser, JTextField txtPassword){
        this.txtUser = txtUser;
        this.txtPassword = txtPassword;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final String user = txtUser.getText();
        final String password = txtPassword.getText();

        if(user.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente!", "TestFlatLafTheme", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(!user.equals(AuthCredentials.USER)){
            txtUser.putClientProperty("JComponent.outline", "error");
            txtUser.requestFocus();
            JOptionPane.showMessageDialog(null, "O usuário informado é inválido!", "TestFlatLafTheme", JOptionPane.ERROR_MESSAGE);
            return;
        }

        txtUser.putClientProperty("JComponent.outline", null);
        txtUser.requestFocus();

        if(!password.equals(AuthCredentials.PASSWORD)){
            txtPassword.putClientProperty("JComponent.outline", "error");
            txtPassword.requestFocus();
            JOptionPane.showMessageDialog(null, "A senha informada é inválida!", "TestFlatLafTheme", JOptionPane.ERROR_MESSAGE);
            return;
        }

        txtPassword.putClientProperty("JComponent.outline", null);
        txtPassword.requestFocus();

        JOptionPane.showMessageDialog(null, "Logado com sucesso!");
    }

}