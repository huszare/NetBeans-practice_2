/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_02_tomb_visitorral;

/**
 *
 * @author
 */
public class MaxVisitor extends Visitor{
    
    private int max = Integer.MIN_VALUE;
    
     public int getMax(){
        this.max = max;
        return max;
    }
   
    
    public void visiting(int elem){
        if (elem > max)
        max = elem;
    }
} 
    
    
