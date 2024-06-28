/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burger;

import com.sun.source.tree.BreakTree;
import org.w3c.dom.UserDataHandler;
import java.util.Scanner;
/**
 *
 * @author Abdulrahman
 */
public class Burger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
    int num_item;
    String item;
    int choise ;
    int addition;
    String add_item;
    int price_item=0;
    int price_addition=0;
    User u1=new User();
  u1.menu();
  System.out.println("please select option:");      
 num_item=input.nextInt();     
      switch(num_item){
        case 1:
        item="Beef Burger";
        price_item=80;
        break;
        case 2:
        item="Chicken Burger";
         price_item=90;
        break;
        case 3:
        item="Cheese Burger";
         price_item=100;
        break;
        default:
        item="not found";
       }
      u1.setitem(num_item); 
       System.out.println(item);
        System.out.println("Do you like to add any addition?\n1-Yes\n2-No\n");     
        Addition a1=new Addition();
      choise=input.nextInt();
       if (choise==1){
           
 System.out.println("Choose what you want");
a1.add();
    addition=input.nextInt();
     switch(addition){
        case 1:
        add_item="Catchup";
        price_addition=5;
        break;
        case 2:
     add_item="Mayonnise";
       price_addition=10;
        break;
        case 3:
      add_item="tomatoes";
        price_addition=15;
        break;
        case 4:
      add_item="Cheese";
        price_addition=20;
      break;
      default:
          add_item="not found";
       }
       System.out.println("your order now is "+item+" and "+ add_item);
       Receipt r1=new Receipt();
       r1.setPrice_item(price_item);
       r1.setPrice_addition(price_addition);
    
           System.out.println( "the item "+item+r1.getPrice_item()); 
           System.out.println( "Extra "+add_item+r1.getPrice_addition());
           System.out.println("total"+r1.total());
       
       

       }
       else{
           Receipt r2=new Receipt();
       r2.setPrice_item(price_item);
       r2.setPrice_addition(price_addition);
            System.out.println("your order now is "+item);
   System.out.println( "the item "+item+r2.getPrice_item());
          System.out.println("total"+r2.total());
       }
}
    
 
    
    
    
}