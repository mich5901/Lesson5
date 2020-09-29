package face;

import javax.swing.JOptionPane;

public class mainApp extends javax.swing.JFrame {

    Face f;

    public mainApp() {
        initComponents();
        f = new Face(facePanel.getGraphics(), 100, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmove = new javax.swing.JButton();
        btnresize = new javax.swing.JButton();
        btncolor = new javax.swing.JButton();
        btnmood = new javax.swing.JButton();
        btnset = new javax.swing.JButton();
        facePanel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnmove.setText("Move Face");
        btnmove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoveActionPerformed(evt);
            }
        });

        btnresize.setText("Resize Face");

        btncolor.setText("Change Color");

        btnmood.setText("Toggle Mood");

        btnset.setText("Set Initial Face");
        btnset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsetActionPerformed(evt);
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
                    .addComponent(btnset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmove)
                        .addGap(65, 65, 65)
                        .addComponent(btnresize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(btncolor)
                        .addGap(56, 56, 56)
                        .addComponent(btnmood)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmove)
                    .addComponent(btnresize)
                    .addComponent(btnmood)
                    .addComponent(btncolor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(facePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnset)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsetActionPerformed
        btnmood.setEnabled(true);
        btncolor.setEnabled(true);
        btnmove.setEnabled(true);
        btnresize.setEnabled(true);
        f.erase();
        f = new Face(facePanel.getGraphics(), 50, 50);
        f.draw();
    }//GEN-LAST:event_btnsetActionPerformed

    private void btnmoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoveActionPerformed
        int newx = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New Y"));
        int newy = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New Y"));
        f.erase();
        f.move(newx, newy);
        f.draw();
    }//GEN-LAST:event_btnmoveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncolor;
    private javax.swing.JButton btnmood;
    private javax.swing.JButton btnmove;
    private javax.swing.JButton btnresize;
    private javax.swing.JButton btnset;
    private javax.swing.JTextField facePanel;
    // End of variables declaration//GEN-END:variables
}
