/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burger;

/**
 *
 * @author Abdulrahman
 */
public class Addition extends User {
  protected int Catchup=5;
  protected int Mayonnise=10;
  protected int tomatoes=15;
  protected int Cheese=20;        
  
    
    
    protected int addition;

    public void setAddition(int addition) {
        this.addition = addition;
    }

    public int getAddition() {
        return addition;
    }
    
    
    
    
    public void add(){
        System.out.println("Additions:");
        System.out.println("1-Catchup\n2-Mayonnise\n3-tomatoes\n 4-Cheese");
    
    }
}
