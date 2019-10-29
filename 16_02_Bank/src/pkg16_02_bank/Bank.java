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
public class Bank {
    
    
     public static BankKartya ujBankKartya(Ugyfel u) {
        if (u.getFizetes() < 150000) {
            return new BankKartya(u.getFizetes());
        } else  
            if (u.getFizetes() >= 150000) {
            return new HitelKartya(u.getFizetes(), 2 * u.getFizetes());
        }
        return null;
    }
    
}
