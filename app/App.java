/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(10, 10); 

    
        menu.addItem(new MenuItem("Beef Burger", 5));
        menu.addItem(new MenuItem("Chicken Burger", 4));
        menu.addItem(new MenuItem("Cheese Burger", 6));
        
        menu.addAddition(new Addition("catchup", 1));
        menu.addAddition(new Addition("cheese", 2));
        menu.addAddition(new Addition("Mayonnise", 3));
        menu.addAddition(new Addition("tomatoes", 4));

        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1 - View Menu");
            System.out.println("2 - View Additions");
            System.out.println("3 - Add New Item");
            System.out.println("4 - Add New Addition");
            System.out.println("5 - Select Item and Additions");
            System.out.println("6 - Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    menu.viewMenu();
                    break;
                case 2:
                    menu.viewAdditions();
                    break;
                case 3:
                    System.out.println("Enter the name of the new item:");
                    String newItemName = scanner.nextLine();
                    System.out.println("Enter the price of the new item:");
                    double newItemPrice = scanner.nextDouble();
                    scanner.nextLine(); // consume the newline
                    menu.addItem(new MenuItem(newItemName, newItemPrice));
                    System.out.println("Item added.");
                    break;
                case 4:
                    System.out.println("Enter the name of the new addition:");
                    String newAdditionName = scanner.nextLine();
                    System.out.println("Enter the price of the new addition:");
                    double newAdditionPrice = scanner.nextDouble();
                    scanner.nextLine(); 
                    menu.addAddition(new Addition(newAdditionName, newAdditionPrice));
                    System.out.println("Addition added.");
                    break;
                case 5:
                    menu.viewMenu();
                    System.out.println("Select an item number:");
                    int itemNumber = scanner.nextInt() - 1;
                    if (itemNumber < 0 || itemNumber >= menu.itemCount) {
                        System.out.println("Invalid item number.");
                        break;
                    }
                    MenuItem selectedItem = menu.getItem(itemNumber);
                    double totalPrice = selectedItem.price;
                    System.out.println("You selected: " + selectedItem);

                    System.out.println("Do you want to add any additions? (yes/no)");
                    scanner.nextLine(); 
                    String addAdditions = scanner.nextLine();

                    if (addAdditions.equalsIgnoreCase("yes")) {
                        menu.viewAdditions();
                        while (true) {
                            System.out.println("Select an addition number (0 to finish):");
                            int additionNumber = scanner.nextInt() - 1;
                            if (additionNumber == -1) {
                                break;
                            }
                            if (additionNumber < 0 || additionNumber >= menu.additionCount) {
                                System.out.println("Invalid addition number.");
                                continue;
                            }
                            Addition selectedAddition = menu.getAddition(additionNumber);
                            totalPrice += selectedAddition.price;
                            System.out.println("Added: " + selectedAddition);
                        }
                    }

                    System.out.println("Total Price: $" + totalPrice);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
    
}
