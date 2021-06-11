package GUI;

//IMPORTANT NOTE: Because all the dialog jDialogs and clue jDialogs contain
//                relatively the same code, commenting will only be performed on
//                one of each. This commenting can be found in the CasinoDialog
//                and CasinoClue java files.
public class Casino extends javax.swing.JFrame {

    public Casino() {
        initComponents();
        
        //set the title
        this.setTitle("Casino");
        
        //call the reset function
        reset();
        
        //disable the 'Reset' button
        jButton4.setEnabled(false);
    }
    
    //when the house draws a card
    public String houseHit(){
        //get a random number between 0 and 14
        int N = (int)(Math.random()*13)+1;
        
        //depending on the number, return a different symbol/integer
        //also add the respective value to the house's total
        if (N==11){
            houseTotal += 10;
            return "J";
        } else if (N==12){
            houseTotal += 10;
            return "Q";
        } else if (N==13){
            houseTotal += 10;
            return "K";
        } else if (N==1){
            houseTotal += 11;
            houseAceCount++;
            return "A";
        }
        houseTotal += N;
        return Integer.toString(N);
    }
    
    //when the user draws a card
    public String youHit(){
        //get a random number between 0 and 14
        int N = (int)(Math.random()*13)+1;
        
        //depending on the number, return a different symbol/integer
        //also add the respective value to the user's total
        if (N==11){
            yourTotal += 10;
            return "J";
        } else if (N==12){
            yourTotal += 10;
            return "Q";
        } else if (N==13){
            yourTotal += 10;
            return "K";
        } else if (N==1){
            yourTotal += 11;
            yourAceCount++;
            return "A";
        }
        yourTotal += N;
        return Integer.toString(N);
    }
    
    //reset function
    public void reset(){
        //reset all the utility variables
        yourIndex = 3;
        houseIndex = 2;
        yourTotal = 0;
        houseTotal = 0;
        houseAceCount = 0;
        yourAceCount = 0;
        blackjack = false;
        
        //display the initial cards
        jTextField1.setText(houseHit());
        jTextField5.setText(youHit());
        jTextField6.setText(youHit());
        
        //make all the other textfields empty
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }
    
    //utility variables declaration
    int houseTotal = 0;
    int yourTotal = 0;
    int houseAceCount = 0;
    int yourAceCount = 0;
    int houseIndex = 2;
    int yourIndex = 3;
    boolean blackjack = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(825, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(590, 358));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Click Me!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("House's Cards");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Your Cards");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Hit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Stay");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //display the helper dialog when user clicks the 'Click Me!' button
        new CasinoDialog(null, true).show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    //the following code is the logic behind the casino game Blackjack.
    //Here is the general idea behind the code:
    //if the user hits, give them a new card. If their total exceeds 21, they
    //have busted. If they hit 21 exactly, they win. The same goes for the house
    //If neither party busts or hits 21, the winner is whichever party has
    //the greater total. If the user hits the 'Stay' button, they decide that
    //they do not want to continue hitting for risk of busting. In this case,
    //the house begins hitting. When the user wins, they are presented with the
    //clue jDialog.
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (yourTotal==21){
            jLabel3.setText("Blackjack! You win!");
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(true);
            blackjack = true;
            new CasinoClue(null, true).show();
        }
        
        if (!blackjack){
        while(true){
        if (houseIndex==2){
            jTextField2.setText(houseHit());
            houseIndex++;
            
            if (houseTotal==21){
                jLabel3.setText("House Blackjack. Try again.");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
                break;
            } else if (houseTotal>16){
                if (yourTotal>houseTotal){
                    jLabel3.setText("You're higher! You win!");
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(true);
                    new CasinoClue(null, true).show();
                } else if (yourTotal<houseTotal){
                    jLabel3.setText("You're lower. Try again.");
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(true);
                } else{
                    jLabel3.setText("You tied! Try again.");
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(true);
                }
                break;
            }
        } else if (houseIndex==3){
            jTextField3.setText(houseHit());
            houseIndex++;
            
            if(houseTotal>=22 && houseAceCount==0){
                jLabel3.setText("House Busted! You win!");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
                new CasinoClue(null, true).show();
                break;
            } else if (houseTotal>=22 && houseAceCount>0){
                houseAceCount--;
                houseTotal -= 10;
            } else if (houseTotal==21){
                jLabel3.setText("House has 21. Try again.");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
                break;
            } else if (houseTotal>16){
                if (yourTotal>houseTotal){
                    jLabel3.setText("You're higher! You win!");
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(true);
                    new CasinoClue(null, true).show();
                } else if (yourTotal<houseTotal){
                    jLabel3.setText("You're lower. Try again.");
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(true);
                } else{
                    jLabel3.setText("You tied! Try again.");
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(true);
                }
                break;
            }
        } else if (houseIndex==4){
            jTextField4.setText(houseHit());
            houseIndex++;
            
            if(houseTotal>=22 && houseAceCount==0){
                jLabel3.setText("House Busted! You win!");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
                new CasinoClue(null, true).show();
                break;
            } else if (houseTotal>=22 && houseAceCount>0){
                houseAceCount--;
                houseTotal -= 10;
            } else if (houseTotal==21){
                jLabel3.setText("House has 21. Try again.");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
                break;
            } else if (houseTotal>16){
                if (yourTotal>houseTotal){
                    jLabel3.setText("You're higher! You win!");
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(true);
                    new CasinoClue(null, true).show();
                } else if (yourTotal<houseTotal){
                    jLabel3.setText("You're lower. Try again.");
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(true);
                } else{
                    jLabel3.setText("You tied! Try again.");
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    jButton4.setEnabled(true);
                }
                break;
            }
        }
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(yourTotal==21){
            jLabel3.setText("Blackjack! You win!");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
                blackjack = true;
                new CasinoClue(null, true).show();
        }
        
        if (!blackjack){
        if (yourIndex==3){
            jTextField8.setText(youHit());
            yourIndex++;
            
            if(yourTotal>=22 && yourAceCount==0){
                jLabel3.setText("Busted! Try again.");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
            } else if (yourTotal>=22 && yourAceCount>0){
                yourAceCount--;
                yourTotal -= 10;
            }
            if (yourTotal==21){
                jLabel3.setText("Total is 21! You win!");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
                new CasinoClue(null, true).show();
            }
        } else if (yourIndex==4){
            jTextField7.setText(youHit());
            yourIndex++;
            
            if(yourTotal>=22 && yourAceCount==0){
                jLabel3.setText("Busted! Try again.");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
            } else if (yourTotal>=22 && yourAceCount>0){
                yourAceCount--;
                yourTotal -= 10;
            } else if (yourTotal==21){
                jLabel3.setText("Total is 21! You win!");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(true);
                new CasinoClue(null, true).show();
            }
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //when the user wins or loses, they get access to the 'Reset' button.
    //Clicking this button will call the reset function and re-enable the
    //'Hit' and 'Stay' buttons
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabel3.setText("");
        reset();
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    //main method
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Casino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
