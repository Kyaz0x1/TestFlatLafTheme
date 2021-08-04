package net.kyaz0x1.testflatlaftheme.view;

import com.formdev.flatlaf.FlatLightLaf;
import net.kyaz0x1.testflatlaftheme.events.ButtonLoginClickEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;

public class HomeView extends JFrame {

    private final JLabel lblTitle;

    private final JLabel lblUser;
    private final JTextField txtUser;

    private final JLabel lblPassword;
    private final JPasswordField txtPassword;

    private final JCheckBox cbShowPassword;

    private final JButton btnLogin;

    public HomeView(){
        super("TestFlatLafTheme");
        setSize(285, 210);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        FlatLightLaf.setup();

        this.lblTitle = new JLabel("Login");
        lblTitle.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        lblTitle.setBounds(100, 5, 65, 35);

        add(lblTitle);

        this.lblUser = new JLabel("Usuário:");
        lblUser.setBounds(20, 40, 50, 20);

        add(lblUser);

        this.txtUser = new JTextField();
        txtUser.putClientProperty("JTextField.placeholderText", "Informe o usuário...");
        txtUser.setBounds(20, 60, 220, 20);

        add(txtUser);

        this.lblPassword = new JLabel("Senha:");
        lblPassword.setBounds(20, 85, 50, 20);

        add(lblPassword);

        this.txtPassword = new JPasswordField();
        txtPassword.putClientProperty("JTextField.placeholderText", "Informe a senha...");
        txtPassword.setBounds(20, 105, 220, 20);

        add(txtPassword);

        this.cbShowPassword = new JCheckBox("Mostrar senha");
        cbShowPassword.setBounds(140, 125, 110, 20);
        cbShowPassword.addActionListener((e) -> txtPassword.setEchoChar(cbShowPassword.isSelected() ? 0 : '*'));

        add(cbShowPassword);

        this.btnLogin = new JButton("Logar");
        btnLogin.setBounds(20, 130, 70, 20);
        btnLogin.addActionListener(new ButtonLoginClickEvent(txtUser, txtPassword));

        add(btnLogin);
    }

}