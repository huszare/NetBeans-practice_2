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
public class SzerkeszthetoDokumentum extends Dokumentum {
    
    public SzerkeszthetoDokumentum(){
        
    }
    
     public SzerkeszthetoDokumentum(String szoveg){
        this.szoveg = szoveg;
    }

    public void beszur(int poz, String uj) {
        if (poz > szoveg.length()){
            System.out.println(szoveg);}
        else {
        String szovegUj = szoveg.substring(0, (poz)) + uj + szoveg.substring(poz);
        szoveg = szovegUj;
        System.out.println(szoveg);}
    }

    public void torol(int poz, int len) {
        if ((poz + len) > szoveg.length()){
            System.out.println(szoveg);}
        else {
        szoveg = szoveg.substring(0, (poz)) + szoveg.substring((poz + len));
        System.out.println(szoveg);}
    }

    public void cserel(int poz, int len, String uj) {
        if ((poz + len) > szoveg.length()){
            System.out.println(szoveg);}
        else {
        String szovegUj = szoveg.substring(0, (poz)) + uj + szoveg.substring(poz);
        szoveg = szovegUj;
        szoveg = szoveg.substring(0, (poz + len)) + szoveg.substring((poz + 2 * len));
        System.out.println(szoveg);}
    }

    public void hozzafuz(String uj) {
        szoveg = (szoveg.substring(0, (szoveg.length() - 1)) + uj + "\n");
        //String szoveg = szoveg.substring(0, (poz)) + uj + szoveg.substring(poz);
        System.out.println(szoveg);
    }

    public void sorBeszur(int sorIndex, String ujSor) {
        String sor = "";
        int maxSor = getSorokSzama();
        if (maxSor <= sorIndex)
            System.out.println(sor);
        else {
            int[] holN = new int[maxSor];
        int kovetkezo = 1;
        holN[0] = 1;
        for (int i = 1; i < szoveg.length(); i++){
            if (szoveg.substring(i - 1, i ).equals("\n")){
                holN[kovetkezo] = i + 1;
            kovetkezo++;
        }}  
        String tag1 = szoveg.substring(0, (holN[sorIndex] - 1));
        String tag2 = ujSor + "\n";
        String tag3 = szoveg.substring((holN[sorIndex] -1));
        System.out.println(tag1);
        System.out.println(tag2);
        System.out.println(tag3);
        System.out.println("");
        this.szoveg = tag1 +tag2 + tag3;
        //this.szoveg = szoveg.substring(0, holN[sorIndex])+ ujSor + szoveg.substring(holN[sorIndex]);
        System.out.println(szoveg);
    }}

    public void sorTorol(int sorIndex) {
       // int hossz = szoveg.length();
   //String sor = new String();
        int sorKezd = 0;
        //int sorVeg = 0;
        int indexJo = 0;
        for (int i = 0; i < szoveg.length(); i++) {
            if (szoveg.substring(i, i + 1).equals("\n")) {
                //        sorKezd = i;
                if (indexJo != sorIndex) {
                    indexJo++;
                    sorKezd = i + 1;
                } else {
                    for (int j = i; j < (szoveg.length() - 1); j++) {
                        if (szoveg.substring(j + 1, j + 2).equals("\n")) {
                            // = szoveg.substring(sorKezd, (sorKezd + j - i));
                            szoveg = szoveg.substring(0, sorKezd) + szoveg.substring((sorKezd + j - i));
                            System.out.println(szoveg);
                          }
                    }
                    szoveg = szoveg.substring(0, sorKezd); 
                    System.out.println(szoveg);
                }
            }
        }
    }
    
   }
