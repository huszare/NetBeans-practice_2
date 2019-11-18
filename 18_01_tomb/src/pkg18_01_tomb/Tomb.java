/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18_01_tomb;

import java.lang.reflect.Array;

/**
 *
 * @author
 */
public class Tomb {
    private double[] tomb;
    
    public Tomb(double[] t){
        if (t != null)
            this.tomb = t;
        else {
            double[] t2 = {};
            this.tomb = t2;}
     }
    
    public int getElemszam() {
        return Array.getLength(tomb);
      }
    
    
    public double getOsszeg(){
        double osszeg = 0.0;
        for (int i = 0; i < getElemszam(); i++)
            osszeg += tomb[i];
        return osszeg;
    }
    
    public String toString(){
        if (getElemszam() != 0){
            String tombString = "";
            for (int i = 0; i < (getElemszam()- 1); i++)
                tombString = tombString + tomb[i] + " ";
            tombString = tombString + tomb[getElemszam()-1];
            return tombString;
    }
        return "";
    } 
    
    public void kivalogat(Feltetel f){
        for (int i = 0; i < getElemszam(); i++)
            if (f.feltetel(tomb[i])) 
                System.out.printf(tomb[i]+ " ");
        //System.out.println(tomb);
    }
    
    public double getAtlag(){
        if (getElemszam() != 0){
            double atlag = 0;
            for (int i = 0; i < getElemszam(); i++)
                atlag += tomb[i];
            atlag = atlag / getElemszam();
            return atlag;
    }
        return 0;
    }
    
    public int megszamlal(Feltetel f){
        if (getElemszam() != 0){
        int szamol = 0;
        for (int i = 0; i < getElemszam(); i++){
            if (f.feltetel(tomb[i])) 
                szamol += 1;}
        return szamol;
     }
        else 
            return 0;
    }
    
    public int maxIndex(){
        if (getElemszam() != 0){
            int max = 0;
             for (int i = 0; i < (getElemszam()- 1); i++)
                 if (tomb[i+1] > tomb[max])
                     max = i+1;
            return max; 
        }
        else
        return -1;
    }
    
    public int minIndex(){
        if (getElemszam() != 0){
            int min = 0;
             for (int i = 0; i < (getElemszam()- 1); i++)
                 if (tomb[i+1] < tomb[min])
                     min = i+1;
            return min; 
        }
           return -1;
    }
    
     public double max(){
        if (maxIndex()!= -1)
            return tomb[maxIndex()];
                else
         return 0;
    }
    
    public double min(){
        if (minIndex()!= -1)
            return tomb[minIndex()];
                else
        return 0;
    }
    
     public boolean vanIlyen(Feltetel f){
    if (getElemszam() != 0){
        int szamol = 0;
        for (int i = 0; i < getElemszam(); i++){
            if (f.feltetel(tomb[i])) 
                szamol += 1;}
        if (szamol > 0)
        return true;
     }
        return false;
     }
     
     public boolean mindIlyen(Feltetel f){
       if (getElemszam() != 0){
        int szamol = 0;
        for (int i = 0; i < getElemszam(); i++){
            if (f.feltetel(tomb[i])) 
                szamol += 1;}
        if (szamol == getElemszam())
        return true;
     }
        return false;
     }
     
     public int elsoIlyenSzam(double keresett){
         if (getElemszam() != 0)
            for (int i = 0; i < getElemszam(); i++)
                 if (tomb[i] == keresett)
                     return i;
          return -1;
    }
     
      public int utolsoIlyenSzam(double keresett){
          if (getElemszam() != 0){
            int index = -1;
            for (int i = 0; i < getElemszam(); i++)
                 if (tomb[i] == keresett)
                     index = i;
            return index; 
        }
        else
        return -1;
    }
      
       public int elsoIlyen(Feltetel f){
       if (getElemszam() != 0){
          for (int i = 0; i < getElemszam(); i++){
            if (f.feltetel(tomb[i])) 
                return i;}
       }
        return -1;
     }
     
      public int utolsoIlyen(Feltetel f){
      if (getElemszam() != 0){
          for (int i = getElemszam()-1; i >= 0; i--){
            if (f.feltetel(tomb[i])) 
                return i;}
       }
        return -1;
     }
      
      
    
}
