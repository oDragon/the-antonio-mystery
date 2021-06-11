package GUI;


public class CasinoDialog extends javax.swing.JDialog {

    public CasinoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //set the title of the jDialog to "Dialog"
        this.setTitle("Dialog");
        
        //give the user instructions what to do in this specific location
        //also provide hints for the user to better understand the usage of
        //the components of the jFrame
        jEditorPane1.setText("You recieved a tip-off from an informant that says somebody at the Casino"
                + " has\ninformation. Upon entering the building, a large man with a beard gestures\nat you"
                + " to come over to his poker table. He tells you that you must beat the house\nin a game"
                + " of Blackjack before you recieve the information.\n\nWin at Blackjack!\n\nHow to Play: "
                + "Click the 'Hit' button to recieve a card. The goal is to have the sum of\nyour cards be more than"
                + " the house's sum of cards. Careful though, a total of\n22 or over makes you instantly lose! A total "
                + "of 21 makes you instantly win!\n\nHint: Jacks, Queens, and Kings are worth 10, and an Ace can be"
                + " worth\neither 1 or 11.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jEditorPane1.setEditable(false);
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton1)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //the OK button will always close the jDialog and allow the user to interact
    //with the jFrame
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //main function
    public static void main(String args[]) {

        //initiate the jDialog and the different swing components
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CasinoDialog dialog = new CasinoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
