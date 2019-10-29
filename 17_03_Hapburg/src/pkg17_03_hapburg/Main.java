/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_03_hapburg;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //     PhoneNumber customer = PhoneNumber.create("888888");
 //       int cost = customer.price(3, 4);
  //      System.out.println("A hívás díja: " + cost + " tallér.");
    
    boolean joSzam = true;
    String callNumber = "";
    int perc = 0;
    int mp = 0;
    int cost = 0;
    Scanner sc = new Scanner(System.in);
    
     while (joSzam){
        System.out.println("Kérem a telefonszámot: ");
        callNumber = sc.nextLine();
    
            System.out.println("Kérem a hívás perceinek számát: ");
            perc = sc.nextInt();
            System.out.println("Kérem a hívás perceinek számát: ");
            mp = sc.nextInt();
            PhoneNumber customer = PhoneNumber.create(callNumber);
            cost = customer.price(3, 4);
            System.out.println("A hívás díja: " + cost + " tallér.");
}
    }   
}
