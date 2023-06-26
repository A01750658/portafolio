/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yeet2;

import Yeet.GameLogic;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author alanvega
 */
public class Game extends javax.swing.JFrame {

    private GameLogic log = new GameLogic();
    private boolean Up = false;
    private JButton[] ghint = new JButton[3];
    private ImageIcon Im1;
    private ImageIcon Im2;
    
    String respuesta;
    int number;

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        SetImage();
        SetHints();
    }

    private void SetImage() {
        number = log.setImage();
        image.setVisible(false);
        felicitacion.setVisible(false);
        image.setIcon(new ImageIcon(getClass().getResource("../Yeet3/imagen" + number + ".png")));
        String[] respuestas = log.objetos();
        respuesta = respuestas[number];
    }

    private void SetHints() {
        int[] numbers = log.setHints();
        hint1.setDisabledIcon(new ImageIcon(getClass().getResource("../Yeet3/pista" + number + numbers[0] + ".png")));
        hint2.setDisabledIcon(new ImageIcon(getClass().getResource("../Yeet3/pista" + number + numbers[1] + ".png")));
        hint3.setDisabledIcon(new ImageIcon(getClass().getResource("../Yeet3/pista" + number + numbers[2] + ".png")));
        hint4.setDisabledIcon(new ImageIcon(getClass().getResource("../Yeet3/pista" + number + numbers[3] + ".png")));
        hint5.setDisabledIcon(new ImageIcon(getClass().getResource("../Yeet3/pista" + number + numbers[4] + ".png")));
        hint6.setDisabledIcon(new ImageIcon(getClass().getResource("../Yeet3/pista" + number + numbers[5] + ".png")));
        hint7.setDisabledIcon(new ImageIcon(getClass().getResource("../Yeet3/pista" + number + numbers[6] + ".png")));
    }

    private void HintEnabled(JButton hint) {
      
        for (int i = 0; i < 3; i++) {
            if (!Up) {
                hint.setEnabled(false);
                ghint[i] = hint;
                

            }
        }
        hint1.setVisible(false);
        hint2.setVisible(false);
        hint3.setVisible(false);
        hint4.setVisible(false);
        hint5.setVisible(false);
        hint6.setVisible(false);
        hint7.setVisible(false);

        ghint[0].setVisible(true);
        ghint[1].setVisible(true);
        ghint[2].setVisible(true);
    }

    private void respuesta() {
        String input = texto.getText();
        if (input.equals(respuesta)) {
            image.setVisible(true);
            felicitacion.setVisible(true);
            felicitacion.setText("FELICIDADES, HAS ENCONTRADO EL PERSONAJE!!! (presiona reiniciar para volver a jugar)");
        } else {
            image.setVisible(true);
            felicitacion.setVisible(true);
            felicitacion.setText("Respuesta incorrecta, el personaje era" + respuesta);
        }
    }

    private void reinicio() {
        hint1.setEnabled(true);
        hint2.setEnabled(true);
        hint3.setEnabled(true);
        hint4.setEnabled(true);
        hint5.setEnabled(true);
        hint6.setEnabled(true);
        hint7.setEnabled(true);
        
        hint1.setVisible(true);
        hint2.setVisible(true);
        hint3.setVisible(true);
        hint4.setVisible(true);
        hint5.setVisible(true);
        hint6.setVisible(true);
        hint7.setVisible(true);
        Up = false;
        SetImage();
        SetHints();
        image.setVisible(false);
        felicitacion.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hint1 = new javax.swing.JButton();
        hint2 = new javax.swing.JButton();
        hint3 = new javax.swing.JButton();
        hint4 = new javax.swing.JButton();
        hint5 = new javax.swing.JButton();
        hint6 = new javax.swing.JButton();
        hint7 = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        reinicio = new javax.swing.JButton();
        felicitacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hint1.setText("Pista");
        hint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hint1ActionPerformed(evt);
            }
        });

        hint2.setText("Pista");
        hint2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hint2ActionPerformed(evt);
            }
        });

        hint3.setText("Pista");
        hint3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hint3ActionPerformed(evt);
            }
        });

        hint4.setText("Pista");
        hint4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hint4ActionPerformed(evt);
            }
        });

        hint5.setText("Pista");
        hint5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hint5ActionPerformed(evt);
            }
        });

        hint6.setText("Pista");
        hint6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hint6ActionPerformed(evt);
            }
        });

        hint7.setText("Pista");
        hint7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hint7ActionPerformed(evt);
            }
        });

        texto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textoInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        reinicio.setText("Reinicio");
        reinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hint1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reinicio)
                            .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(felicitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hint4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(hint5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hint6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hint3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hint7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hint2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(1061, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(hint1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hint2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hint4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hint5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hint6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(reinicio)
                        .addGap(49, 49, 49)
                        .addComponent(felicitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hint3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hint7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textoInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_textoInputMethodTextChanged

    private void hint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hint1ActionPerformed
        // TODO add your handling code here:
        HintEnabled(hint1);

    }//GEN-LAST:event_hint1ActionPerformed

    private void hint2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hint2ActionPerformed
        // TODO add your handling code here:
        HintEnabled(hint2);
    }//GEN-LAST:event_hint2ActionPerformed

    private void hint3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hint3ActionPerformed
        // TODO add your handling code here:
        HintEnabled(hint3);
    }//GEN-LAST:event_hint3ActionPerformed

    private void hint4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hint4ActionPerformed
        // TODO add your handling code here:
        HintEnabled(hint4);
    }//GEN-LAST:event_hint4ActionPerformed

    private void hint5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hint5ActionPerformed
        // TODO add your handling code here:
        HintEnabled(hint5);
    }//GEN-LAST:event_hint5ActionPerformed

    private void hint6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hint6ActionPerformed
        // TODO add your handling code here:
        HintEnabled(hint6);
    }//GEN-LAST:event_hint6ActionPerformed

    private void hint7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hint7ActionPerformed
        // TODO add your handling code here:
        HintEnabled(hint7);
    }//GEN-LAST:event_hint7ActionPerformed

    private void reinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinicioActionPerformed
        // TODO add your handling code here:
        reinicio();
    }//GEN-LAST:event_reinicioActionPerformed

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        // TODO add your handling code here:
        respuesta();
    }//GEN-LAST:event_textoActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Game().setVisible(true);
                System.out.println("Yeet");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel felicitacion;
    private javax.swing.JButton hint1;
    private javax.swing.JButton hint2;
    private javax.swing.JButton hint3;
    private javax.swing.JButton hint4;
    private javax.swing.JButton hint5;
    private javax.swing.JButton hint6;
    private javax.swing.JButton hint7;
    private javax.swing.JLabel image;
    private javax.swing.JButton reinicio;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}