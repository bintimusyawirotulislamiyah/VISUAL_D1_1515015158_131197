
public class konversi extends javax.swing.JFrame {
    public Double input;
    public Double celcius;
    public Double kelvin;
    public Double fahrenheit;
    public String hasilcelcius;
    public String hasilkelvin;
    public String hasilfahrenheit;
    /**
     * Creates new form konversi
     */
    public konversi() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblSuhuawal = new javax.swing.JLabel();
        txtsuhuawal = new javax.swing.JTextField();
        rbcelcius = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        btnKonversi = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        lblCelcius = new javax.swing.JLabel();
        txtcelcius = new javax.swing.JTextField();
        lblKelvin = new javax.swing.JLabel();
        lblFahrenheit = new javax.swing.JLabel();
        txtkelvin = new javax.swing.JTextField();
        txtfahrenheit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblSuhuawal.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        lblSuhuawal.setText("Suhu Awal");

        rbcelcius.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(rbcelcius);
        rbcelcius.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        rbcelcius.setText("Celcius");
        rbcelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcelciusActionPerformed(evt);
            }
        });

        rbKelvin.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(rbKelvin);
        rbKelvin.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        rbKelvin.setText("Kelvin");
        rbKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKelvinActionPerformed(evt);
            }
        });

        rbFahrenheit.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(rbFahrenheit);
        rbFahrenheit.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        rbFahrenheit.setText("Fahrenheit");
        rbFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFahrenheitActionPerformed(evt);
            }
        });

        btnKonversi.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnKonversi.setText("Konversi");
        btnKonversi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKonversiMouseClicked(evt);
            }
        });
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        lblCelcius.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        lblCelcius.setText("Celcius");

        txtcelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelciusActionPerformed(evt);
            }
        });

        lblKelvin.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        lblKelvin.setText("Kelvin");

        lblFahrenheit.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        lblFahrenheit.setText("Fahrenheit");

        txtfahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfahrenheitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel5.setText("KONVERSI SUHU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCelcius)
                            .addComponent(lblKelvin)
                            .addComponent(lblFahrenheit))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnReset)
                                .addGap(36, 36, 36)
                                .addComponent(btnKeluar)
                                .addGap(0, 104, Short.MAX_VALUE))
                            .addComponent(txtkelvin)
                            .addComponent(txtcelcius)
                            .addComponent(txtfahrenheit)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSuhuawal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(txtsuhuawal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbcelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuhuawal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsuhuawal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbcelcius))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnKonversi)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCelcius)
                            .addComponent(txtcelcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKelvin)
                            .addComponent(txtkelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFahrenheit)
                            .addComponent(txtfahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbFahrenheit)
                        .addGap(6, 6, 6)
                        .addComponent(rbKelvin)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset)
                    .addComponent(btnKeluar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKelvinActionPerformed
        // TODO add your handling code here:
        input=Double.parseDouble(txtsuhuawal.getText());
        
        
        kelvin=input;
        celcius=kelvin-273.15;
        fahrenheit=kelvin*1.8-459.67;
        
    }//GEN-LAST:event_rbKelvinActionPerformed

    private void txtfahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfahrenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfahrenheitActionPerformed

    private void rbcelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcelciusActionPerformed
        // TODO add your handling code here:
        input=Double.parseDouble(txtsuhuawal.getText());
        
        celcius=input;
        kelvin=celcius+273.15;
        fahrenheit=celcius*1.8+32;
               
    }//GEN-LAST:event_rbcelciusActionPerformed
    
    private void txtcelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelciusActionPerformed

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        // TODO add your handling code here:
        if(rbcelcius.isSelected()){
        input=Double.parseDouble(txtsuhuawal.getText());
               
        hasilcelcius=Double.toString(celcius);
        txtcelcius.setText(hasilcelcius);
        
        hasilkelvin=Double.toString(kelvin);
        txtkelvin.setText(hasilkelvin);
        
        hasilfahrenheit=Double.toString(fahrenheit);
        txtfahrenheit.setText(hasilfahrenheit);

        }
        else if(rbFahrenheit.isSelected()){
         input=Double.parseDouble(txtsuhuawal.getText());
        
        hasilcelcius=Double.toString(celcius);
        txtcelcius.setText(hasilcelcius);
        
        hasilkelvin=Double.toString(kelvin);
        txtkelvin.setText(hasilkelvin);
        
        hasilfahrenheit=Double.toString(fahrenheit);
        txtfahrenheit.setText(hasilfahrenheit);
        }
        else if(rbKelvin.isSelected()){
        input=Double.parseDouble(txtsuhuawal.getText());
        
        hasilcelcius=Double.toString(celcius);
        txtcelcius.setText(hasilcelcius);
        
        hasilkelvin=Double.toString(kelvin);
        txtkelvin.setText(hasilkelvin);
        
        hasilfahrenheit=Double.toString(fahrenheit);
        txtfahrenheit.setText(hasilfahrenheit);
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void rbFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFahrenheitActionPerformed
        // TODO add your handling code here:
        input=Double.parseDouble(txtsuhuawal.getText());
        
        celcius=(fahrenheit-32)/1.8;
        kelvin=(fahrenheit+459.67)/1.8;
        fahrenheit=input;
        
        
    }//GEN-LAST:event_rbFahrenheitActionPerformed

    private void btnKonversiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKonversiMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnKonversiMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtsuhuawal.setText("");
        txtcelcius.setText("");
        txtkelvin.setText("");
        txtfahrenheit.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(konversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konversi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCelcius;
    private javax.swing.JLabel lblFahrenheit;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JLabel lblSuhuawal;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbcelcius;
    private javax.swing.JTextField txtcelcius;
    private javax.swing.JTextField txtfahrenheit;
    private javax.swing.JTextField txtkelvin;
    private javax.swing.JTextField txtsuhuawal;
    // End of variables declaration//GEN-END:variables
}