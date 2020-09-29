
package face;

import javax.swing.JOptionPane;

public class FaceJFrame extends javax.swing.JFrame {
    
    Face f;
    
    public FaceJFrame() {
        initComponents();
        f = new Face(facePanel.getGraphics(),100,100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMove = new javax.swing.JButton();
        btnResize = new javax.swing.JButton();
        btnChangeColor = new javax.swing.JButton();
        btnMood = new javax.swing.JButton();
        btnInitial = new javax.swing.JButton();
        facePanel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMove.setText("Move Face");
        btnMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveActionPerformed(evt);
            }
        });

        btnResize.setText("Resize Face");
        btnResize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResizeActionPerformed(evt);
            }
        });

        btnChangeColor.setText("Change Color");
        btnChangeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeColorActionPerformed(evt);
            }
        });

        btnMood.setText("Toggle Mood");
        btnMood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoodActionPerformed(evt);
            }
        });

        btnInitial.setText("Set Initial Face");
        btnInitial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facePanel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMove)
                        .addGap(18, 18, 18)
                        .addComponent(btnResize)
                        .addGap(18, 18, 18)
                        .addComponent(btnChangeColor)
                        .addGap(18, 18, 18)
                        .addComponent(btnMood)
                        .addGap(0, 160, Short.MAX_VALUE))
                    .addComponent(btnInitial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMove)
                    .addComponent(btnResize)
                    .addComponent(btnChangeColor)
                    .addComponent(btnMood))
                .addGap(18, 18, 18)
                .addComponent(facePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInitial)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitialActionPerformed
         btnMood.setEnabled(true);
         btnChangeColor.setEnabled(true);
         btnMove.setEnabled(true);
         btnResize.setEnabled(true);
         f = new Face(facePanel.getGraphics(),50,50);
         f.draw();
    }//GEN-LAST:event_btnInitialActionPerformed

    private void btnMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveActionPerformed
         int newx = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New X"));
         int newy = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New Y"));
         f.draw();
    }//GEN-LAST:event_btnMoveActionPerformed

    private void btnResizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResizeActionPerformed
        
    }//GEN-LAST:event_btnResizeActionPerformed

    private void btnChangeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeColorActionPerformed
        
    }//GEN-LAST:event_btnChangeColorActionPerformed

    private void btnMoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoodActionPerformed
        
    }//GEN-LAST:event_btnMoodActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeColor;
    private javax.swing.JButton btnInitial;
    private javax.swing.JButton btnMood;
    private javax.swing.JButton btnMove;
    private javax.swing.JButton btnResize;
    private javax.swing.JTextField facePanel;
    // End of variables declaration//GEN-END:variables
}
