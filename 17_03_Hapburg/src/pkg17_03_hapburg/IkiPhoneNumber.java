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
public class IkiPhoneNumber extends PhoneNumber{
    
    public String number;
 
    public int price(int perc, int mp){
        int cost = 0;
        int tarifa = 0;
        for (int i = 1; i < (perc + 1); i++){
            cost = cost + 60 * i;
            tarifa = i;}
        cost = cost + mp * (tarifa + 1);
        return cost;
    }
    
}
