/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burger;

/**
 *
 * @author Abdulrahman
 */
public class Receipt {
   private int price_item;
 private int price_addition;
 

    public void setPrice_item(int price_item) {
        
        
        
        this.price_item = price_item;
    }

    public void setPrice_addition(int price_addition) {
        this.price_addition = price_addition;
    }

    public int getPrice_item() {
      
        return price_item;
    }

    public int getPrice_addition() {
        return price_addition;
    }
 public int total(){
 
 
 
 return (price_addition+price_item);
 }  
    
    
}
