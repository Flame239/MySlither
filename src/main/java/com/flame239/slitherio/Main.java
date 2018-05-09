package com.flame239.slitherio;

import javax.swing.UIManager;
import java.awt.*;

public final class Main {

    public static void main(String[] args) throws Exception {
        System.setProperty("sun.java2d.opengl", "false");

        // hack for Linux
        Font check = UIManager.getFont("Label.font");
        UIManager.setLookAndFeel("com.bulenkov.darcula.DarculaLaf");

        new MySlitherJFrame().setVisible(true);
    }
}
