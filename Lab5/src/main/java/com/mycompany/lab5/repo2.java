
package com.mycompany.lab5;


class Product{
    
    protected String productName;
    protected int price, quantity;
    
    public void show(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class Computer extends Product{
    
    private String processor;
    private int ram;
    private int storage;
    private String gpu;
    
    Computer(String productName, int price, int quantity,  String processor,  int  ram, int storage, String gpu){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
    }
    
    public void show(){
        super.show();
        System.out.println("Processor: " + processor );
        System.out.println("Ram: " + ram + " GB");
        System.out.println("Storage: " + storage + " TB");
        System.out.println("Graphics card: " + gpu); 
    }
}

public class repo2 {
    public static void main(String[] args) {
        Computer c = new Computer("Computer", 250000, 1, "Intel core i9", 32, 2, "Rtx 4090");
        c.show();
    } 
}
