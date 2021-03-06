/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namdd.main;

import javax.swing.JOptionPane;

/**
 *
 * @author Đỗ Nam
 */
public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form UserForm
     */
    public UserForm() {
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

        bgGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        cboQualification = new javax.swing.JComboBox<>();
        bntValidate = new javax.swing.JButton();
        bntReset = new javax.swing.JButton();
        jpSex = new javax.swing.JPanel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jpHoppy = new javax.swing.JPanel();
        chkReading = new javax.swing.JCheckBox();
        chkSinging = new javax.swing.JCheckBox();
        chkDancing = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name :");

        jLabel2.setText("Address :");

        jLabel3.setText("Qualification :");

        jLabel4.setText("Sex :");

        jLabel5.setText("Hoppy :");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        cboQualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduated", "Freshmen", "Senior", "Junior" }));

        bntValidate.setText("Validate");
        bntValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntValidateActionPerformed(evt);
            }
        });

        bntReset.setText("Reset");
        bntReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntResetActionPerformed(evt);
            }
        });

        jpSex.setBackground(new java.awt.Color(255, 255, 255));
        jpSex.setBorder(new javax.swing.border.MatteBorder(null));

        bgGender.add(rdMale);
        rdMale.setText("Male");

        bgGender.add(rdFemale);
        rdFemale.setText("Female");

        javax.swing.GroupLayout jpSexLayout = new javax.swing.GroupLayout(jpSex);
        jpSex.setLayout(jpSexLayout);
        jpSexLayout.setHorizontalGroup(
            jpSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSexLayout.createSequentialGroup()
                .addGroup(jpSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdMale)
                    .addComponent(rdFemale))
                .addGap(0, 107, Short.MAX_VALUE))
        );
        jpSexLayout.setVerticalGroup(
            jpSexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdMale)
                .addGap(18, 18, 18)
                .addComponent(rdFemale)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpHoppy.setBorder(new javax.swing.border.MatteBorder(null));

        chkReading.setText("Reading");

        chkSinging.setText("Singing");

        chkDancing.setText("Dancing");

        javax.swing.GroupLayout jpHoppyLayout = new javax.swing.GroupLayout(jpHoppy);
        jpHoppy.setLayout(jpHoppyLayout);
        jpHoppyLayout.setHorizontalGroup(
            jpHoppyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHoppyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHoppyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkReading)
                    .addComponent(chkSinging)
                    .addComponent(chkDancing))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpHoppyLayout.setVerticalGroup(
            jpHoppyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHoppyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkReading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkSinging)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkDancing)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(txtName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboQualification, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpHoppy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntValidate)
                .addGap(81, 81, 81)
                .addComponent(bntReset)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cboQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpHoppy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jpSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntValidate)
                    .addComponent(bntReset))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntValidateActionPerformed
       String name = txtName.getText();
       String address = txtAddress.getText();
       String gender = rdFemale.isSelected()?"Female":"Male";
       String qualification = cboQualification.getSelectedItem().toString();
       String hoppy ="", dancing="", reading="",singing="" ;
        if (chkDancing.isSelected()) {
            dancing = "Dancing";
        }
        if (chkReading.isSelected()) {
            reading = "Reading";
        }
        if (chkSinging.isSelected()) {
            singing = "Singing";
        }
        hoppy = dancing+" "+reading+" "+singing;
        if (name.equals("") || address.equals("")) {
            JOptionPane.showMessageDialog(this, "Name or address not blank.");
        }
        else{
           String s = " Name: " + name + "\n Address: " + address +
                    "\n Sex: " + gender + "\n Qyalification: " + qualification +
                    "\n Hoppy: " + hoppy;
            JOptionPane.showMessageDialog(this, s);
        }
    }//GEN-LAST:event_bntValidateActionPerformed

    private void bntResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntResetActionPerformed
        txtAddress.setText("");
        txtName.setText("");
        
        
    }//GEN-LAST:event_bntResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserForm frmUser = new UserForm();
                frmUser.setLocationRelativeTo(null);
                frmUser.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGender;
    private javax.swing.JButton bntReset;
    private javax.swing.JButton bntValidate;
    private javax.swing.JComboBox<String> cboQualification;
    private javax.swing.JCheckBox chkDancing;
    private javax.swing.JCheckBox chkReading;
    private javax.swing.JCheckBox chkSinging;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpHoppy;
    private javax.swing.JPanel jpSex;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
