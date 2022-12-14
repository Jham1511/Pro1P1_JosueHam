/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pro1p1_josueham;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author SKX Kafei
 */
public class MenuConversiones extends javax.swing.JFrame {

    
    public MenuConversiones() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        BtnDecimalABinario = new javax.swing.JButton();
        BtnBinarioADecimal = new javax.swing.JButton();
        BtnMenuRecursion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Conversiones");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnDecimalABinario.setBackground(new java.awt.Color(153, 153, 153));
        BtnDecimalABinario.setForeground(new java.awt.Color(255, 255, 255));
        BtnDecimalABinario.setText("Decimal A Binario");
        BtnDecimalABinario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnDecimalABinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDecimalABinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDecimalABinarioActionPerformed(evt);
            }
        });

        BtnBinarioADecimal.setBackground(new java.awt.Color(153, 153, 153));
        BtnBinarioADecimal.setForeground(new java.awt.Color(255, 255, 255));
        BtnBinarioADecimal.setText("Binario A Decimal");
        BtnBinarioADecimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBinarioADecimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBinarioADecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBinarioADecimalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBinarioADecimalMouseExited(evt);
            }
        });
        BtnBinarioADecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBinarioADecimalActionPerformed(evt);
            }
        });

        BtnMenuRecursion.setBackground(new java.awt.Color(255, 255, 255));
        BtnMenuRecursion.setForeground(new java.awt.Color(255, 51, 51));
        BtnMenuRecursion.setText("Menu Recursion");
        BtnMenuRecursion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMenuRecursion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMenuRecursion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuRecursionActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1p1_josueham/binary-code.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnDecimalABinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBinarioADecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnMenuRecursion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBinarioADecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BtnDecimalABinario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BtnMenuRecursion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDecimalABinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDecimalABinarioActionPerformed
        String StrDec = JOptionPane.showInputDialog(null, "Ingrese un numero decimal: ");
        int dec = Integer.parseInt(StrDec);
        ArrayList<Integer> binario = new ArrayList<>();
        
        JOptionPane.showMessageDialog(null, "El numero decimal " + dec + " en binario es:\n" + decToBin(dec,binario));
    }//GEN-LAST:event_BtnDecimalABinarioActionPerformed

    private void BtnBinarioADecimalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBinarioADecimalMouseEntered
        BtnBinarioADecimal.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnBinarioADecimalMouseEntered

    private void BtnBinarioADecimalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBinarioADecimalMouseExited
        BtnBinarioADecimal.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_BtnBinarioADecimalMouseExited

    private void BtnBinarioADecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBinarioADecimalActionPerformed
        String StrBin = JOptionPane.showInputDialog(null, "Ingrese un numero binario: ");
        int[] bin = new int[StrBin.length()];
        int cont = 0;
        
        for (int i = StrBin.length() - 1; i >= 0; i--) {
            bin[StrBin.length() - i - 1] = Integer.parseInt("" + StrBin.charAt(i));
        }
       
        JOptionPane.showMessageDialog(null, "El numero binario " + StrBin + " en decimal es:\n" 
                +binToDec(bin, cont,0) );
        
    }//GEN-LAST:event_BtnBinarioADecimalActionPerformed

    private void BtnMenuRecursionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuRecursionActionPerformed
        BtnMenuRecursion.setBackground(Color.red);
        BtnMenuRecursion.setForeground(Color.white);
        Recursion ventana = new Recursion ();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnMenuRecursionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConversiones().setVisible(true);
            }
        });
    }

    public static int binToDec(int[] bin, int cont, int decimal) {
        // Recibe el binario dado vuelta
        if (cont < bin.length) // Condicion para recursividad
            if (bin[cont] == 1)
                // Se incrementa el contador y se acumula el resultado de 2 elevado a cont
                return binToDec(bin, cont+1, decimal + (int) Math.pow(2, cont));
            else
                // Se incrementa el contador y no se acumula nada porque bin[cont] es 0
                return binToDec(bin, cont+1, decimal);
        else // Fin recursion, se retorna el valor decimal obtenido
            return decimal;
    }
    
    
    
   public static ArrayList decToBin(int dec, ArrayList binario) {
        if (dec >= 1) { // Condicion para recursividad
            // Se agrega el digito al inicio del ArrayList para guardar el numero binario en el orden debido
            if (dec % 2 == 0)
                // Si el residuo es 0, se agrega un 0
                binario.add(0, 0);
            else
                // Si el residuo es distinto de 0, se agrega un 1
                binario.add(0, 1);
            return decToBin(dec/2, binario);
        }
        else // Fin recursion, se retorna el numero binario almacenado en el ArrayList
            return binario;
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBinarioADecimal;
    private javax.swing.JButton BtnDecimalABinario;
    private javax.swing.JButton BtnMenuRecursion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
