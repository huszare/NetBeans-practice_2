/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_02_bank;

/**
 *
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankKartya BankKartya1 = new BankKartya(100000);
        BankKartya1.kivesz(50000);
        System.out.println("egyenleg:" + BankKartya1.egyenleg);
        BankKartya1.kivesz(60000);
        System.out.println("egyenleg:" + BankKartya1.egyenleg);
        BankKartya1.setKAMAT(12.0);
        BankKartya1.kamatozik();
        System.out.println("egyenleg:" + BankKartya1.egyenleg);
        
        
    }
    
}
