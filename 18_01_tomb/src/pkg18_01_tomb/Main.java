/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18_01_tomb;

/**
 *
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] t = {1.0, -2.0, 3.0, 4.0, -5.0};
        //double[] t = {1.5, -2.8, 3.9, -11.54, 5.89};
        //double[] t = null;
        Tomb tomb = new Tomb(t);
        System.out.println("getElemszam():" + tomb.getElemszam());
        System.out.println("getOsszeg():" + tomb.getOsszeg());
        if (tomb.getElemszam() != 0)
            System.out.println("toString():" + tomb.toString());
        System.out.println("getAtlag():" + tomb.getAtlag());
        System.out.println("maxIndex():" + tomb.maxIndex());
        System.out.println("minIndex():" + tomb.minIndex());
        System.out.println("max():" + tomb.max());
        System.out.println("min():" + tomb.min());
        System.out.println("elsoIlyen():" + tomb.elsoIlyenSzam(3.0));
        System.out.println("utolsoIlyen():" + tomb.utolsoIlyenSzam(3.0));
        
    }
    
}
