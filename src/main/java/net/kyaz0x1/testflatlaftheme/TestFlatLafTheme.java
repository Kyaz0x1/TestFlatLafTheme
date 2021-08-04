package net.kyaz0x1.testflatlaftheme;

import net.kyaz0x1.testflatlaftheme.view.HomeView;

import javax.swing.SwingUtilities;

public class TestFlatLafTheme {

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new HomeView().setVisible(true));
    }

}