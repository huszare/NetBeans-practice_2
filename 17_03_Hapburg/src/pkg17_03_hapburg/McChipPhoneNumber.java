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
public class McChipPhoneNumber extends PhoneNumber{
    
    public String number;
    
    public int price(int perc, int mp){
        int cost = 15 + perc *60;
        if (mp < 0)
            cost += 60;
        return cost;
    }
    
}
