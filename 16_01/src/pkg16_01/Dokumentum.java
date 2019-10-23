/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_01;

/**
 *
 * @author
 */
public class Dokumentum {
    protected String szoveg;
    
    public Dokumentum(){
    }
    
    public void setSzoveg(String szoveg){
        this.szoveg = szoveg;
    }
    
    public String getSzoveg(){
        return szoveg;
    }
    
    public int getHossz(){
        int hossz = szoveg.length();
        return hossz;
    }
    
    public int getSorokSzama(){
        int sor = 0;
         for (int i = 0; i < szoveg.length(); i++){
            if (szoveg.substring(i,i +1).equals("\n"))
                sor++;
    }
        return sor;
    }
    
    public String getSor(int sorIndex){
        String sor = new String();
         int sorSzam = 0;
         for (int i = 0; i < szoveg.length(); i++){
            if (szoveg.substring(i,i + 1).equals("\n"))
                if (sorSzam != sorIndex)
                    sorSzam++;
                else {
                    for (int j = i; j < szoveg.length(); j++)
                        if (szoveg.substring(j+1,j +2).equals("\n")){
                            sor = szoveg.substring(i, j);
                            return sor;
                        }
                }
    }
         return sor;
    }
    
    
    
}
