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
        if (perc < 0)
             return -1;
        if ((mp < 0 || mp > 59))
            return -1;
        int cost = 0;
        if (perc > 0)
            cost = perc *60;
        if (mp > 0)
            cost = cost + 60;
        if (cost > 0)
            cost = cost + 15;
        return cost;
    }
    
}
