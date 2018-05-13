/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.ui.teacher;

import manager.ui.admin.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import manager.control.InformationControl;
import manager.ui.LoginUI;

/**
 *
 * @author Dell
 */
public class TeacherMenu extends javax.swing.JFrame {
    private String userName;
    private final InformationControl informationControl;
    /**
     * Creates new form MainMenu
     */   
    
    public TeacherMenu(String userName){
        this.userName = userName;
        informationControl = new InformationControl(userName);
        initComponents();
        setResizable(true);
        helloLabel.setText("<html>Xin chào bạn <b>" + userName + "</b></html>");
        menuManageTranscript.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        titlePanel = new javax.swing.JPanel();
        helloLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        helpLabel = new manager.ui.ButtonLabel(new java.awt.Color(204,204,255), new java.awt.Color(54,33,89));
        minimizeLabel = new manager.ui.ButtonLabel(new java.awt.Color(204,204,255), new java.awt.Color(54,33,89));
        exitLabel = new manager.ui.ButtonLabel(new java.awt.Color(242,38,19), Color.white);
        logoutLabel = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        sis = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        accountPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainLayeredPane = new javax.swing.JLayeredPane();
        menuManageTranscript = new javax.swing.JPanel();
        goModifyTranscriptTab = new manager.ui.ButtonPanel(new java.awt.Color(70,53,89), null);
        iconInfoButton = new javax.swing.JLabel();
        textInfoButton = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        manageTranscript = new javax.swing.JPanel();
        modifyTranscriptTab = new manager.ui.teacher.ManagerTranscript();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        titlePanel.setBackground(new java.awt.Color(54, 33, 89));
        titlePanel.setPreferredSize(new java.awt.Dimension(1020, 56));

        helloLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        helloLabel.setForeground(new java.awt.Color(255, 255, 255));
        helloLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        helpLabel.setBackground(new java.awt.Color(54, 33, 89));
        helpLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        helpLabel.setForeground(new java.awt.Color(204, 204, 255));
        helpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpLabel.setText("?");
        helpLabel.setToolTipText("Help");
        helpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpLabelMouseClicked(evt);
            }
        });
        jPanel1.add(helpLabel);

        minimizeLabel.setBackground(new java.awt.Color(54, 33, 89));
        minimizeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimizeLabel.setForeground(new java.awt.Color(204, 204, 255));
        minimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLabel.setText("_");
        minimizeLabel.setToolTipText("Minimize");
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });
        jPanel1.add(minimizeLabel);

        exitLabel.setBackground(new java.awt.Color(54, 33, 89));
        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(204, 204, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setText("X");
        exitLabel.setToolTipText("Quit");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel1.add(exitLabel);

        logoutLabel.setBackground(new java.awt.Color(54, 33, 89));
        logoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/white-logout.png"))); // NOI18N
        logoutLabel.setOpaque(true);
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap(726, Short.MAX_VALUE)
                .addComponent(helloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helloLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));
        sidePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 55, 118)));

        sis.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        sis.setForeground(new java.awt.Color(204, 204, 204));
        sis.setText("SIS");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logbk-40.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new java.awt.GridLayout(5, 1));

        accountPanel.setBackground(new java.awt.Color(85, 55, 118));
        accountPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountPanelMousePressed(evt);
            }
        });
        accountPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 25, 12));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/information.png"))); // NOI18N
        accountPanel.add(jLabel1);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Quản lý điểm");
        accountPanel.add(jLabel3);

        jPanel2.add(accountPanel);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12))
                    .addComponent(sis))
                .addGap(95, 95, 95))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(sis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 105, Short.MAX_VALUE))
        );

        mainLayeredPane.setPreferredSize(new java.awt.Dimension(1020, 565));

        menuManageTranscript.setBackground(new java.awt.Color(255, 255, 255));
        menuManageTranscript.setPreferredSize(new java.awt.Dimension(150, 565));
        menuManageTranscript.setLayout(new java.awt.GridLayout(3, 1));

        goModifyTranscriptTab.setBackground(new java.awt.Color(85, 55, 118));
        goModifyTranscriptTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goModifyTranscriptTabMousePressed(evt);
            }
        });
        goModifyTranscriptTab.setLayout(new java.awt.FlowLayout());

        iconInfoButton.setBackground(new java.awt.Color(255, 255, 255));
        iconInfoButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconInfoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/information/information.png"))); // NOI18N
        iconInfoButton.setMaximumSize(new java.awt.Dimension(64, 64));
        iconInfoButton.setMinimumSize(new java.awt.Dimension(64, 64));
        iconInfoButton.setPreferredSize(new java.awt.Dimension(64, 64));
        goModifyTranscriptTab.add(iconInfoButton);

        textInfoButton.setBackground(new java.awt.Color(255, 255, 255));
        textInfoButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        textInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        textInfoButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textInfoButton.setText("Nhập, sửa điểm");
        goModifyTranscriptTab.add(textInfoButton);

        menuManageTranscript.add(goModifyTranscriptTab);

        jLabel6.setBackground(new java.awt.Color(85, 55, 118));
        jLabel6.setOpaque(true);
        menuManageTranscript.add(jLabel6);

        jLabel4.setBackground(new java.awt.Color(85, 55, 118));
        jLabel4.setOpaque(true);
        menuManageTranscript.add(jLabel4);

        mainPanel.setMinimumSize(new java.awt.Dimension(1020, 1393));
        mainPanel.setPreferredSize(new java.awt.Dimension(1020, 565));
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainPanelMousePressed(evt);
            }
        });
        mainPanel.setLayout(new java.awt.CardLayout());

        manageTranscript.setBackground(new java.awt.Color(255, 255, 255));
        manageTranscript.setLayout(new java.awt.CardLayout());
        manageTranscript.add(modifyTranscriptTab, "modifyTransciptCard");

        mainPanel.add(manageTranscript, "manageTranscriptCard");

        mainLayeredPane.setLayer(menuManageTranscript, javax.swing.JLayeredPane.MODAL_LAYER);
        mainLayeredPane.setLayer(mainPanel, javax.swing.JLayeredPane.MODAL_LAYER);

        javax.swing.GroupLayout mainLayeredPaneLayout = new javax.swing.GroupLayout(mainLayeredPane);
        mainLayeredPane.setLayout(mainLayeredPaneLayout);
        mainLayeredPaneLayout.setHorizontalGroup(
            mainLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(mainLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainLayeredPaneLayout.createSequentialGroup()
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(mainLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainLayeredPaneLayout.createSequentialGroup()
                    .addComponent(menuManageTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 876, Short.MAX_VALUE)))
        );
        mainLayeredPaneLayout.setVerticalGroup(
            mainLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(mainLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainLayeredPaneLayout.createSequentialGroup()
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 22, Short.MAX_VALUE)))
            .addGroup(mainLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainLayeredPaneLayout.createSequentialGroup()
                    .addComponent(menuManageTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 263, Short.MAX_VALUE)
                    .addComponent(mainLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 56, Short.MAX_VALUE)
                    .addComponent(mainLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        super.dispose();
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void helpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_helpLabelMouseClicked

    private void resetVisible() {
        if(menuManageTranscript.isVisible()) {
            menuManageTranscript.setVisible(false);
        }
    }
    
    private void accountPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPanelMousePressed
        mainLayeredPane.moveToFront(menuManageTranscript);
        resetColor();
        accountPanel.setBackground(new java.awt.Color(85,55,118));
        
        if(menuManageTranscript.isVisible() == false) {
            resetVisible();
            menuManageTranscript.setVisible(true);
        } else {
            resetVisible(); 
        }
        //((CardLayout)mainPanel.getLayout()).show(mainPanel, "accountManagerCard");
        //((CardLayout)accountManager.getLayout()).show(accountManager, "menuAccountCard");
        
    }//GEN-LAST:event_accountPanelMousePressed

    private void accountPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPanelMouseEntered
        java.awt.Color color = new java.awt.Color(85,55,118);
        if(accountPanel.getBackground().getRGB() != color.getRGB()) {
            accountPanel.setBackground(new java.awt.Color(52,35,82));
        } 
    }//GEN-LAST:event_accountPanelMouseEntered

    private void accountPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPanelMouseExited
        java.awt.Color color = new java.awt.Color(85,55,118);
        if(accountPanel.getBackground().getRGB() != color.getRGB()) {
            accountPanel.setBackground(new java.awt.Color(64,43,100));
        } 
    }//GEN-LAST:event_accountPanelMouseExited

    private void logoutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseEntered
        logoutLabel.setBackground(new java.awt.Color(242,38,19));
        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/white-logout.png")));
    }//GEN-LAST:event_logoutLabelMouseEntered

    private void logoutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseExited
        logoutLabel.setBackground(Color.white);
        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/purple-logout.png")));
    }//GEN-LAST:event_logoutLabelMouseExited

    private void logoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMousePressed
        super.dispose();
        LoginUI.main(null);
    }//GEN-LAST:event_logoutLabelMousePressed

    private void goModifyTranscriptTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goModifyTranscriptTabMousePressed
        resetVisible();
        ((CardLayout)manageTranscript.getLayout()).show(manageTranscript, "modifyTranscriptCard");
        modifyTranscriptTab.reset();
    }//GEN-LAST:event_goModifyTranscriptTabMousePressed

    private void mainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMousePressed
        resetVisible();
    }//GEN-LAST:event_mainPanelMousePressed

    private void resetColor() {
        accountPanel.setBackground(new java.awt.Color(64,43,100));
    }
    /**
     * @param userName
     */
    public static void main(String userName) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TeacherMenu(userName).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountPanel;
    private javax.swing.JLabel exitLabel;
    private manager.ui.ButtonPanel goModifyTranscriptTab;
    private javax.swing.JLabel helloLabel;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JLabel iconInfoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLayeredPane mainLayeredPane;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel manageTranscript;
    private javax.swing.JPanel menuManageTranscript;
    private javax.swing.JLabel minimizeLabel;
    private manager.ui.teacher.ManagerTranscript modifyTranscriptTab;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel sis;
    private javax.swing.JLabel textInfoButton;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
