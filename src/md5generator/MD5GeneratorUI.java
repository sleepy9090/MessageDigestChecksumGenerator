/*
 * Copyright (c) Shawn M. Crawford All Rights Reserved.
 */

package md5generator;

import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shawn M. Crawford
 */
public class MD5GeneratorUI extends JFrame {

    /**
     * Creates new form MD5GeneratorUI
     */
    public MD5GeneratorUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMD5 = new javax.swing.JLabel();
        jTextFieldMD5Checksum = new javax.swing.JTextField();
        buttonFileSelect = new javax.swing.JButton();
        jTextFieldFile = new javax.swing.JTextField();
        jLabelMD2 = new javax.swing.JLabel();
        jTextFieldMD2Checksum = new javax.swing.JTextField();
        jLabel1SHA1 = new javax.swing.JLabel();
        jLabelSHA256 = new javax.swing.JLabel();
        jLabelSHA384 = new javax.swing.JLabel();
        jLabelSHA512 = new javax.swing.JLabel();
        jTextFieldSHA1Checksum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSHA512Checksum = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSHA384Checksum = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaSHA256Checksum = new javax.swing.JTextArea();
        jProgressBar = new javax.swing.JProgressBar();
        jLabelProgress = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Message Digest Checksum Generator");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jLabelMD5.setText("MD5:");

        jTextFieldMD5Checksum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMD5ChecksumActionPerformed(evt);
            }
        });

        buttonFileSelect.setText("Select File:");
        buttonFileSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFileSelectActionPerformed(evt);
            }
        });

        jLabelMD2.setText("MD2:");

        jLabel1SHA1.setText("SHA-1:");

        jLabelSHA256.setText("SHA-256:");

        jLabelSHA384.setText("SHA-384:");

        jLabelSHA512.setText("SHA-512:");

        jTextAreaSHA512Checksum.setColumns(20);
        jTextAreaSHA512Checksum.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSHA512Checksum);

        jTextAreaSHA384Checksum.setColumns(20);
        jTextAreaSHA384Checksum.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSHA384Checksum);

        jTextAreaSHA256Checksum.setColumns(20);
        jTextAreaSHA256Checksum.setRows(5);
        jScrollPane3.setViewportView(jTextAreaSHA256Checksum);

        jLabelProgress.setText("Progress:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSHA384)
                    .addComponent(jLabelSHA256)
                    .addComponent(jLabel1SHA1)
                    .addComponent(jLabelMD2)
                    .addComponent(jLabelMD5)
                    .addComponent(buttonFileSelect)
                    .addComponent(jLabelSHA512)
                    .addComponent(jLabelProgress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMD5Checksum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldFile)
                    .addComponent(jTextFieldMD2Checksum)
                    .addComponent(jTextFieldSHA1Checksum)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFileSelect)
                    .addComponent(jTextFieldFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMD2)
                    .addComponent(jTextFieldMD2Checksum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMD5Checksum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMD5))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1SHA1)
                    .addComponent(jTextFieldSHA1Checksum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSHA256)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSHA384))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSHA512))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProgress))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Select File");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        jMenuItem2.setText("About");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMD5ChecksumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMD5ChecksumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMD5ChecksumActionPerformed

    private void buttonFileSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFileSelectActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        jProgressBar.setValue(0);
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(100);
        jProgressBar.setStringPainted(true);

        jTextFieldFile.repaint();
        jTextFieldFile.validate();

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(this, "This might take awhile.", "Please wait.", JOptionPane.INFORMATION_MESSAGE);
            File selectedFile = fileChooser.getSelectedFile();
            populateForm(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_buttonFileSelectActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void populateForm(String selectedFilename) {

        final String CHECKSUM_ERROR = "There was a problem generating the checksum.";
        MD5Generator md5Generator = new MD5Generator();

        jTextFieldFile.setText(selectedFilename);

        String checksum = md5Generator.generateFileMD5Checksum("MD2", selectedFilename);
        jProgressBar.setValue(14);

        if (checksum != null) {
            jTextFieldMD2Checksum.setText(checksum);
        } else {
            jTextFieldMD2Checksum.setText(CHECKSUM_ERROR);
        }

        checksum = md5Generator.generateFileMD5Checksum("MD5", selectedFilename);
        jProgressBar.setValue(28);

        if (checksum != null) {
            jTextFieldMD5Checksum.setText(checksum);
        } else {
            jTextFieldMD5Checksum.setText(CHECKSUM_ERROR);
        }

        checksum = md5Generator.generateFileMD5Checksum("SHA-1", selectedFilename);
        jProgressBar.setValue(42);

        if (checksum != null) {
            jTextFieldSHA1Checksum.setText(checksum);
        } else {
            jTextFieldSHA1Checksum.setText(CHECKSUM_ERROR);
        }

        checksum = md5Generator.generateFileMD5Checksum("SHA-256", selectedFilename);
        jProgressBar.setValue(56);

        jTextAreaSHA256Checksum.setLineWrap(true);
        if (checksum != null) {
            jTextAreaSHA256Checksum.setText(checksum);
        } else {
            jTextAreaSHA256Checksum.setText(CHECKSUM_ERROR);
        }

        checksum = md5Generator.generateFileMD5Checksum("SHA-384", selectedFilename);
        jProgressBar.setValue(70);

        jTextAreaSHA384Checksum.setLineWrap(true);
        if (checksum != null) {
            jTextAreaSHA384Checksum.setText(checksum);
        } else {
            jTextAreaSHA384Checksum.setText(CHECKSUM_ERROR);
        }

        checksum = md5Generator.generateFileMD5Checksum("SHA-512", selectedFilename);
        jProgressBar.setValue(84);

        jTextAreaSHA512Checksum.setLineWrap(true);
        if (checksum != null) {
            jTextAreaSHA512Checksum.setText(checksum);
        } else {
            jTextAreaSHA512Checksum.setText(CHECKSUM_ERROR);
        }

        jProgressBar.setValue(100);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MD5GeneratorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFileSelect;
    private javax.swing.JLabel jLabel1SHA1;
    private javax.swing.JLabel jLabelMD2;
    private javax.swing.JLabel jLabelMD5;
    private javax.swing.JLabel jLabelProgress;
    private javax.swing.JLabel jLabelSHA256;
    private javax.swing.JLabel jLabelSHA384;
    private javax.swing.JLabel jLabelSHA512;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaSHA256Checksum;
    private javax.swing.JTextArea jTextAreaSHA384Checksum;
    private javax.swing.JTextArea jTextAreaSHA512Checksum;
    private javax.swing.JTextField jTextFieldFile;
    private javax.swing.JTextField jTextFieldMD2Checksum;
    private javax.swing.JTextField jTextFieldMD5Checksum;
    private javax.swing.JTextField jTextFieldSHA1Checksum;
    // End of variables declaration//GEN-END:variables
}
