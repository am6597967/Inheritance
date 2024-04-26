
package javaapplication8;


public class JavaApplication8 {

   
    public static void main(String[] args) {
        DIT dit = new DIT("John Doe", "12345");
               
        
              dit.displayInfo();
              dit.location();
              dit.colors();
              
        System.out.println("Leadership: " +dit.leadership());
        
        System.out.println();
          
             ComputerStudies cs = new ComputerStudies("Jane Smith", "67890");
             cs.displayInfo();
             cs.location();
             cs.colors();
        
        
        
          System.out.println("Leadership:" +cs.leadership());
          
            System.out.println("Module Code: " + cs.modulecode("Computer Science", "CS101"));
    }
    
}
