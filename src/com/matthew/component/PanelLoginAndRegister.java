/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.matthew.component;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JPasswordField;
import net.miginfocom.swing.MigLayout;
import com.formdev.flatlaf.extras.FlatSVGIcon;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {
    
    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
        
    }
    
    private void initRegister() {
        //== TITE==
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(57, 167, 165));
        register.add(label);
        // == User Account ==
        JTextField txtUser = new JTextField();
        txtUser.setFont(new Font("SansSerif", Font.PLAIN, 14));
        txtUser.putClientProperty("JTextField.placeholderText", "Username");
        JLabel iconLabel = new JLabel(new FlatSVGIcon("images/user.svg", 20, 20));
        iconLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 8));
        txtUser.putClientProperty("JTextField.leadingComponent", iconLabel);
        txtUser.setPreferredSize(new Dimension(320, 40));
        register.add(txtUser, "w 60%, h 40!");
        // == Email Account ==
        JTextField txtEmail = new JTextField();
        txtEmail.setFont(new Font("SansSerif", Font.PLAIN, 14));
        txtEmail.putClientProperty("JTextField.placeholderText", "Email");
        JLabel emailIconLabel = new JLabel(new FlatSVGIcon("images/envelope.svg", 20, 20));
        emailIconLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 8));
        txtEmail.putClientProperty("JTextField.leadingComponent", emailIconLabel);
        register.add(txtEmail, "w 60%, h 40!");
        // == Password Account ==
        JTextField txtPassword = new JTextField();
        txtPassword.setFont(new Font("SansSerif", Font.PLAIN, 14));
        txtPassword.putClientProperty("JTextField.placeholderText", "Password");
        JLabel passIconLabel = new JLabel(new FlatSVGIcon("images/lock.svg", 20, 20));
        passIconLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 8));
        txtPassword.putClientProperty("JTextField.leadingComponent", passIconLabel);
        register.add(txtPassword, "w 60%, h 40!");
        
        JButton cmd = new JButton();
        cmd.setFont(new Font("SansSerif", Font.PLAIN, 12));
        cmd.setBackground(new Color(57, 167, 165));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("SIGN UP");
        cmd.setFocusPainted(false);
        cmd.setBorderPainted(false);  
        cmd.setContentAreaFilled(true);
        cmd.putClientProperty("JButton.buttonType", "roundRect");

        Color originalColor = new Color(57, 167, 165);
        Color hoverColor = new Color(194, 240, 240);
        Color pressedColor = new Color(48, 227, 227);

        cmd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmd.setBackground(hoverColor);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmd.setBackground(originalColor);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmd.setBackground(pressedColor);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmd.setBackground(hoverColor);
            }
        });

        register.add(cmd, "w 40%, h 35!");
    }
    
    private void initLogin() {
        // == TITLE ==
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Sign In Account");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(57, 167, 165));
        login.add(label);
        // == Email Account ==
        JTextField txtEmail = new JTextField();
        txtEmail.setFont(new Font("SansSerif", Font.PLAIN, 14));
        txtEmail.putClientProperty("JTextField.placeholderText", "Username");
        JLabel emailIconLabel = new JLabel(new FlatSVGIcon("images/user.svg", 20, 20));
        emailIconLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 8));
        txtEmail.putClientProperty("JTextField.leadingComponent", emailIconLabel);
        login.add(txtEmail, "w 60%, h 40!");
        // == Password Account ==
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("SansSerif", Font.PLAIN, 14));
        txtPassword.putClientProperty("JTextField.placeholderText", "Password");
        JLabel passIconLabel = new JLabel(new FlatSVGIcon("images/lock.svg", 20, 20));
        passIconLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 8));
        txtPassword.putClientProperty("JTextField.leadingComponent", passIconLabel);
        login.add(txtPassword, "w 60%, h 40!");
        // == Forgot Password ==
        JButton cmdForget = new JButton("Forgot your password?");
        cmdForget.setForeground(new Color(57, 167, 165));
        cmdForget.setFont(new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdForget.setBorderPainted(false);

        Color originalColor = new Color(57, 167, 165);
        Color pressedColor = new Color(48, 227, 227);

        cmdForget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent e) {
                cmdForget.setForeground(pressedColor);
            }
            public void mouseReleased(java.awt.event.MouseEvent e) {
                cmdForget.setForeground(originalColor);
            }
        });
        login.add(cmdForget);
        // == SIGN IN ==
            JButton cmd = new JButton();
            cmd.setFont(new Font("SansSerif", Font.PLAIN, 12));
            cmd.setBackground(new Color(57, 167, 165));
            cmd.setForeground(new Color(250, 250, 250));
            cmd.setText("SIGN IN");
            cmd.setFocusPainted(false);
            cmd.setBorderPainted(false);  
            cmd.setContentAreaFilled(true);
            cmd.putClientProperty("JButton.buttonType", "roundRect");
            
            Color originalColor2 = new Color(57, 167, 165);
            Color hoverColor2 = new Color(194, 240, 240);
            Color pressedColor2 = new Color(48, 227, 227);

            cmd.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    cmd.setBackground(hoverColor2);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    cmd.setBackground(originalColor2);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    cmd.setBackground(pressedColor2);
                }
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    cmd.setBackground(hoverColor2);
                }
            });

        login.add(cmd, "w 40%, h 35!");
    }
    
    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
