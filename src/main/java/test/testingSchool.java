package test;

import GUI.Navigation;

public class testingSchool extends Navigation {
   
    //NOTE: for the following method to be performed during the simulation,
    //line 193 in the School.java file must be uncommented.
    
    //method to test action listener in the Schoolq1 java file
    public static void testActionListener(){
        
        //first, select the correct radio button
        //NOTE: to test other action listeneres, change the question # and
        //the corresponding radio button #
        Navigation.SC.question1.jRadioButton2.doClick();
        
        //then, simulate a click on the 'OK' button
        Navigation.SC.question1.jButton1.doClick();
        
        //finally, check that the corresponding boolean was set to true
        if (Navigation.SC.q1==true){
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }
   
}
