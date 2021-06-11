package GUI;


public class PoliceStationDialog extends javax.swing.JDialog {

    public PoliceStationDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //the value of this string is equal to whatever the text was in the
        //scenario string in the PoliceStation java file
        String scen = Navigation.PS.scenario;
        
        //if the text said "invalid"
        if (scen.equals("invalid")){
            
            //set the title to "Invalid Input"
            this.setTitle("Invalid Input");
            //tell the user to re-enter their input
            jEditorPane1.setText("Your input was not a suspect number.\n\nBecause of this, you are given the opportunity to re-enter.\n\nPlease enter a number between 1 and 7.");
            
        //if the text said "fail"    
        } else if (scen.equals("fail")){
            
            //set the title to "Game over - You failed"
            this.setTitle("Game over - You failed");
            //tell the user that the lost the game because they entered the
            //incorrect suspect number
            jEditorPane1.setText("FAIL!\n\nThe suspect you identified was not the murderer!\n\nGeneral Krantz tells you that your terrible work could have led to theconviction"
                    + " of an innocent person. You are stripped of your badge\nand told to pursue a different career.");
            
        //if the text said "success"
        } else if (scen.equals("success")){
            
            //set the title to "Game over - You won!"
            this.setTitle("Game over - You won!");
            //tell the user that they beat the game
            jEditorPane1.setText("SUCCESS!\n\nThe suspect you identified was the murderer!\n\nGeneral Krantz is pleased and invites you to a dinner party.\n\nCongratulations!"
                    + " You completed the game!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jEditorPane1.setEditable(false);
        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jButton1)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //if the user hits the 'OK' button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //if the user entered an invalid input
        if (Navigation.PS.scenario.equals("invalid")){
            //close this jDialog so the user can re-enter their input
            this.dispose();
        //if the user failed or beat the game
        } else{
            //terminate the program
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //main function
    public static void main(String args[]) {

        //initiate the jFrame and the different swing components
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PoliceStationDialog dialog = new PoliceStationDialog(new javax.swing.JFrame(), true);
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
