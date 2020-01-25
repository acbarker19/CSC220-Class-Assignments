/*
 * Jim Klayder -- fall 2018
 * 
 * This is a framework for creating some recursive drawings. The buttons each
   call the makeDrawing method in drawingPanel.
 */
package demoRecursionExample;

import java.awt.Point;

/**
 *
 * @author jimklayder
 */
public class DrawingFrame extends javax.swing.JFrame {

    private DrawingPanel drawingPanel;
    
    /**
     * Creates new form MainFrame
     */
    public DrawingFrame() {
        initComponents();
        
        
        drawingPanel = new DrawingPanel();
        drawingPanel.setSize(500, 300);
        drawingPanel.setLocation(new Point(10,10));
        add(drawingPanel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butotnTwo = new javax.swing.JButton();
        buttonThree = new javax.swing.JButton();
        buttonOne = new javax.swing.JButton();
        buttonFive = new javax.swing.JButton();
        buttonFour = new javax.swing.JButton();
        buttonSix = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        butotnTwo.setText("two");
        butotnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butotnTwoActionPerformed(evt);
            }
        });

        buttonThree.setText("three");
        buttonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThreeActionPerformed(evt);
            }
        });

        buttonOne.setText("one");
        buttonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOneActionPerformed(evt);
            }
        });

        buttonFive.setText("five");
        buttonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiveActionPerformed(evt);
            }
        });

        buttonFour.setText("four");
        buttonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourActionPerformed(evt);
            }
        });

        buttonSix.setText("six");
        buttonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(556, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonOne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butotnTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonThree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(buttonFour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonFive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(buttonOne)
                .addGap(18, 18, 18)
                .addComponent(butotnTwo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonThree)
                .addGap(18, 18, 18)
                .addComponent(buttonFour)
                .addGap(19, 19, 19)
                .addComponent(buttonFive)
                .addGap(18, 18, 18)
                .addComponent(buttonSix)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOneActionPerformed
        System.out.println("button one");
        drawingPanel.makeDrawing(1);
    }//GEN-LAST:event_buttonOneActionPerformed

    private void butotnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butotnTwoActionPerformed
        System.out.println("button two");
        drawingPanel.makeDrawing(2);
    }//GEN-LAST:event_butotnTwoActionPerformed

    private void buttonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThreeActionPerformed
        System.out.println("button three");
        drawingPanel.makeDrawing(3);
    }//GEN-LAST:event_buttonThreeActionPerformed

    private void buttonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourActionPerformed
        System.out.println("button four");
        drawingPanel.makeDrawing(4);
    }//GEN-LAST:event_buttonFourActionPerformed

    private void buttonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiveActionPerformed
        System.out.println("button five");
        drawingPanel.makeDrawing(5);
    }//GEN-LAST:event_buttonFiveActionPerformed

    private void buttonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSixActionPerformed
        System.out.println("button six");
        drawingPanel.makeDrawing(6);
    }//GEN-LAST:event_buttonSixActionPerformed

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
            java.util.logging.Logger.getLogger(DrawingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrawingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrawingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butotnTwo;
    private javax.swing.JButton buttonFive;
    private javax.swing.JButton buttonFour;
    private javax.swing.JButton buttonOne;
    private javax.swing.JButton buttonSix;
    private javax.swing.JButton buttonThree;
    // End of variables declaration//GEN-END:variables
}