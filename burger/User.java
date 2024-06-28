/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burger;

/**
 *
 * @author Abdulrahman
 */
class User {
  protected int item;
 protected int Beef_Burger;
 protected int Chicken_Burger;
 protected int Cheese_Burger;
  
    public void setitem (int item){
   this.item=item;
    }
    public int getitem(){
       
    return item;
    }
    
    
     public void menu(){
    
        System.out.println("Welcome to our restaurant");
         System.out.println("Menu:\n 1-Beef Burger\n 2-Chicken Burger\n 3-Cheese Burger");
    }

  
    }

  

