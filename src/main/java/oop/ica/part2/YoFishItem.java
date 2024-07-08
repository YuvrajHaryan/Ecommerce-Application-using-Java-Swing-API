/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.part2;

/**
 *
 * @author Yuvraj Haryan D3581054
 */

public class YoFishItem {
    // Declaring all the members of the data class, used PRIVATE access modifier to maintain principles of encapsulation
    private int id, stock, lowTemp, HighTemp;
    private String item;
    private double price, maxSize; 

    // Constructor
    public YoFishItem(int id, String item, double price, int stock, double maxSize, int lowTemp, int HighTemp) {
        this.id = id;
        this.stock = stock;
        this.lowTemp = lowTemp;
        this.HighTemp = HighTemp;
        this.item = item;
        this.price = price;
        this.maxSize = maxSize;
    }
    

    // The getter and setter methods for modifiying the members of the data class from outside the class
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public int getHighTemp() {
        return HighTemp;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public double getMaxSize() {
        return maxSize;
    }
    
    
    
    // Method to return the name of the image file for an item
    public String getPicFilename() {
        return this.id + ".jpg";
    }
    
}
