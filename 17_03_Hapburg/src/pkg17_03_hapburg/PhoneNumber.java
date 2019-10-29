/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_03_hapburg;

/**
 *
 * @author
 */
public abstract class PhoneNumber {
    
     public int price(int perc, int mp){
         return 0;
     }
    
    public static PhoneNumber create(String phoneNumber){
        if ((phoneNumber.substring(0,1)).equals("1")) 
            return new KwakPhoneNumber();
        if ((phoneNumber.substring(0,3)).equals("999")) 
            return new McChipPhoneNumber();
        if ((phoneNumber.substring(0,2)).equals("88")) 
            return new IkiPhoneNumber();
        else
        return null;
    }
        
    }
      
    
    

