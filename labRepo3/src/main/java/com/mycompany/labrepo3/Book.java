

package com.mycompany.labrepo3;


public class Book {
     private String title;
    private String author;
    private double price;
    private int year;
    
    public Book(String title, String author, double price, int year) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setYear(year);
        
        
    }
    
     // Getter and setter for title
    public String getTitle() {
        return title;
    }

     public void setTitle(String title) {
        this.title = title;
    }


    // Getter and setter for author
    public String getAuthor() {
        return author;
    }

   public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and setter for price with validation
    public double getPrice() {
        return price;
    }

 public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    // Getter and setter for year
    public int getYear() {
        return year;
    }

     public void setYear(int year) {
        this.year = year;
    }
 

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println("-----------------------------");
    }
    
    public static void main(String[] args) {
         Book[] books = new Book[2];

        // Creating Book objects
        books[0] = new Book("1971", "Kalam", -39.99, 2020);
        books[1] = new Book("Home Work", "Sikagu", 5.99, 2018);  

        // Displaying book information
        for (int i=0;i<2;i++) {
            books[i].displayInfo();
            
        }
    }
}

