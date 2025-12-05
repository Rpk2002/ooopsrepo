import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        BOOK bb[]=new BOOK[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String title=sc.nextLine();
            double price=sc.nextDouble();
            sc.nextLine();
            String gen=sc.nextLine();
            bb[i]=new BOOK(id,title,price,gen);

        }

        String gg=sc.nextLine();

        String gg1=sc.nextLine();

        int dis=sc.nextInt();
        String ans[]=BOOK.getBookGenre(bb,gg);
        for(String s:ans){
            System.out.println(s);
        }
       BOOK.applyDiscount(bb,gg1,dis);

    }

public static class BOOK {
    private   int bookid;
    private String title;
    private double price;
    private  String genre;
    public  BOOK(int bookid,String title,double price,String genre){
        this.bookid=bookid;
        this.title=title;
        this.price=price;
        this.genre=genre;
    }

    public int getBookid() {
        return bookid;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public static String [] getBookGenre(BOOK[]bb,String genre){
        if(bb==null|| bb.length==0)return new String[]{};
        List<String> ll=new ArrayList<>();
        for(BOOK ss:bb){
            if(ss.getGenre().equalsIgnoreCase(genre)){
                ll.add(ss.getTitle());
            }
        }
        String[] hh=new String[ll.size()];
        for(int i=0;i<ll.size();i++){
            hh[i]=ll.get(i);
        }
        return hh;
    }
    public static void applyDiscount(BOOK []bb ,String genre,double discount){
        if( bb==null ||bb.length==0 ) System.out.println("No book foud");
        for(BOOK kk:bb){
            if(kk.getGenre().equalsIgnoreCase(genre)){
                double temp=kk.getPrice();
                double tt=(temp*discount)/100;
                double ans=temp-tt;
                System.out.println("Title : "+kk.getGenre()+", "+"Updated Price : "+ans);
            }
        }
    }


}
}
//Here is the **complete question with Sample Input & Output** exactly matching your code.
//You can use this as your assignment/problem statement.
//
//---
//
//# ✅ **FINAL QUESTION**
//
//## **Problem Statement**
//
//Create a Java program to store details of books and perform genre-based operations.
//
//Define a class **BOOK** with the following attributes:
//
//* **bookid** – integer
//* **title** – String
//* **price** – double
//* **genre** – String
//
//The class should contain:
//
//### **1. Constructor**
//
//To initialize all fields.
//
//### **2. Getter methods**
//
//* `getBookid()`
//* `getTitle()`
//* `getPrice()`
//* `getGenre()`
//
//### **3. Static Method — `getBookGenre(BOOK[] bb, String genre)`**
//
//This method should:
//
//* Find all books whose genre matches the given `genre` (case-insensitive)
//* Return an array of titles of those books
//* Return an empty array if none match
//
//### **4. Static Method — `applyDiscount(BOOK[] bb, String genre, double discount)`**
//
//This method should:
//
//* Find all books of the given genre (case-insensitive)
//
//* Apply discount percentage on price
//
//  ```
//  discountAmount = (price * discount) / 100
//  newPrice = price - discountAmount
//  ```
//
//* Print the result in the format:
//
//  ```
//  Title : <genre>, Updated Price : <new price>
//  ```
//
//* If no matching book is found, print:
//
//  ```
//  No book found
//  ```
//
//---
//
//## **Input Format**
//
//1. An integer **n** → number of books
//
//2. For each book (n times):
//
//   * bookid (int)
//   * title (String)
//   * price (double)
//   * genre (String)
//
//3. A genre **gg** → used for `getBookGenre`
//
//4. A genre **gg1** → used for `applyDiscount`
//
//5. An integer **dis** → discount percentage
//
//---
//
//## **Output Format**
//
//1. Print each title returned from `getBookGenre(bb, gg)` on a new line
//2. Print the results of `applyDiscount(bb, gg1, dis)`
//
//---
//
//## **Sample Input**
//
//```
//3
//101
//Java Basics
//500
//Programming
//102
//Python Guide
//650
//Programming
//103
//History of India
//300
//History
//Programming
//History
//10
//```
//
//---
//
//## **Sample Output**
//
//```
//Java Basics
//Python Guide
//Title : History, Updated Price : 270.0
//```
//
//---
//
//If you want, I can also write **test cases**, **explanations**, or **improve your code**.

