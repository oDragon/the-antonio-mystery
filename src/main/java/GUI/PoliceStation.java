package GUI;

//IMPORTANT NOTE: There is commenting for the PoliceStationDialog java file
public class PoliceStation extends javax.swing.JFrame {

    public PoliceStation() {
        initComponents();
        
        //set the title
        this.setTitle("Police Station");
        
        //set the text in the jEditorPane
        //basically tell the user how to input the suspect they have identified
        jEditorPane1.setText("Determined the killer?\n\nSimply enter the number of the suspect that you think is the killer"
                + " into the textfield below,\nthen hit submit.\n\nFor example, if you believe that suspect #8 is the killer,"
                + " type '8' into the text field and hit submit.\n\nSuspect numbers can be found at the office.\n\nWARNING:"
                + " Be careful! This action can only be performed once!");
    }

    //initiate the scenario string
    String scenario;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(825, 250));
        setPreferredSize(new java.awt.Dimension(590, 358));
        setResizable(false);
        setSize(new java.awt.Dimension(590, 358));

        jTextField1.setText("Enter Suspect #");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jEditorPane1.setEditable(false);
        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setText("Submit");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 182, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    //when the user hits the 'Submit' button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //set the input string the the user inputted String
        String input = jTextField1.getText();
        //if the String entered is 1, 2, 3, 4, 6, or 7, do the following
        if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("6") || input.equals("7")){
            
            //set the scenario string to "fail"
            scenario = "fail";
            
            //initiate the PoliceStationDialog
            new PoliceStationDialog(null, true).show();
            
        //if the String entered is 5, the user has identified the correct
        //suspect
        } else if (input.equals("5")){
            
            //set the scenario string to "success"
            scenario = "success";
            
            //initiate the PoliceStationDialog
            new PoliceStationDialog(null, true).show();
        //in the case that the user inputs an invalid String, such as a symbol,
        //letter, or number above 7, do the following
        } else{
            
            //set the scenario string to "invalid"
            scenario = "invalid";
            
            //initiate the PoliceStationDialog
            new PoliceStationDialog(null, true).show();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    //main function
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PoliceStation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
