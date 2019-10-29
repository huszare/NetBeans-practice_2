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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] t = {1,5,8,7,34,23};
Tomb tomb = new Tomb(t);
tomb.setElem(0, 16);
System.out.println(tomb.getElem(1)); /* 5 */
KiirVisitor kiiro = new KiirVisitor();
tomb.visit(kiiro); /* 16 5 8 7 34 23 */
ParosOsszegVisitor parosOsszeg = new ParosOsszegVisitor();
tomb.visit(parosOsszeg); /* semmi nem íródik ki */
System.out.println(parosOsszeg.getOsszeg()); /* 58 */
MaxVisitor maxOsszeg = new MaxVisitor();
tomb.visit(maxOsszeg); 
System.out.println(maxOsszeg.getMax());
    }
    
}
