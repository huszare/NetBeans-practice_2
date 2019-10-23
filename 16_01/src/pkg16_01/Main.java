/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_01;

/**
 *
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dokumentum teszt = new Dokumentum();
       teszt.szoveg = "0123456789kati56789\n0123456789zoli56789\n0123456789feri56789\n";
       System.out.println(teszt.getSzoveg());
       System.out.println("hossz:" + teszt.getHossz());
       System.out.println("sor:" + teszt.getSorokSzama());
       System.out.println("sor:" + teszt.getSor(0));
       
       
    }
    
}
