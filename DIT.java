
package javaapplication8;

public class DIT {
    
           String name = ("DIT");
           String id   = ("1234445");
           
           public DIT(String name, String id) {
               
               this.name = name;
               this.id = id;
           }
           
           public void displayInfo(){
               System.out.println("Name:"+ name);
               System.out.println("ID: "+ id);
           }
           
           public void location(){
               System.out.println("Location: Bibi Titi and Morogoro");
             
           }
           
           public void colors(){
               System.out.println("Colors: Blue and White");
           }
           
           
          public String leadership(){
              return "Name: " +name +", ID: " +id;
          }
           }