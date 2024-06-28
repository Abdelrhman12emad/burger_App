/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Abdulrahman
 */
public class Menu {
     MenuItem[] items;
    Addition[] additions;
    int itemCount;
    int additionCount;

    Menu(int maxItems, int maxAdditions) {
        items = new MenuItem[maxItems];
        additions = new Addition[maxAdditions];
        itemCount = 0;
        additionCount = 0;
    }

    void addItem(MenuItem item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Menu is full. Cannot add more items.");
        }
    }

    void addAddition(Addition addition) {
        if (additionCount < additions.length) {
            additions[additionCount++] = addition;
        } else {
            System.out.println("Addition list is full. Cannot add more additions.");
        }
    }

    void viewMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + " - " + items[i]);
        }
    }

    void viewAdditions() {
        System.out.println("Additions:");
        for (int i = 0; i < additionCount; i++) {
            System.out.println((i + 1) + " - " + additions[i]);
        }
    }

    MenuItem getItem(int index) {
        if (index >= 0 && index < itemCount) {
            return items[index];
        } else {
            return null;
        }
    }

    Addition getAddition(int index) {
        if (index >= 0 && index < additionCount) {
            return additions[index];
        } else {
            return null;
        }
    }
}
