
package test;

import GUI.Navigation;

public class testingGreenhouse {
    
    //NOTE: for the following method to be performed during the simulation,
    //line 243 in the Greenhouse.java file must be uncommented.
    
    //method to test action listener in the Greenhouse java file
    public static void testActionListener(){
        
        //NOTE: to test other action listeners, the boolean being checked
        //and button being checked must be changed
        
        //if the corresponding action listener function did what it was
        //supposed to do (set the corresponding boolean to true and disable
        //the button), output "success", otherwise, output "fail"
        if (Navigation.GH.b1==true && Navigation.GH.jButton13.isEnabled()==false){
            System.out.println("success");
        } else{
            System.out.println("fail");
        }
    }
}
