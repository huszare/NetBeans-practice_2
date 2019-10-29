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
public class ParosOsszegVisitor extends Visitor{
    
    private int osszeg;
    
    public void visiting(int elem){
        if (elem % 2 == 0)
        osszeg += elem;
    }
    
    public int getOsszeg(){
        this.osszeg = osszeg;
        return osszeg;
    }
   
}
