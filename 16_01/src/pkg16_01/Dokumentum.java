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

    public Dokumentum() {
    }

    public Dokumentum(String szoveg) {
        if (szoveg == null) {
            this.szoveg = "";
        } else {
            this.szoveg = szoveg;
        }
        
    }
   

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public int getHossz() {
        int hossz = szoveg.length();
        return hossz;
    }

    public int getSorokSzama() {
        int sor = 0;
        for (int i = 0; i < szoveg.length(); i++) {
            if (szoveg.substring(i, i + 1).equals("\n")) {
                sor++;
            }
           }
       // System.out.println(szoveg.lastIndexOf("\n"));
       // System.out.println((szoveg.length() -1));
                if (szoveg.lastIndexOf("\n") == (szoveg.length() - 1))
                return sor;
            else
                return (sor + 1);
    }

    public String getSor(int sorIndex) {
        String sor = null;
        int maxSor = getSorokSzama();
        int aktSor = 1;
        if (sorIndex == 0) {
            sor = szoveg.substring(0, szoveg.indexOf("\n"));
            return sor;
        }
        if (sorIndex == maxSor -1) {
            sor = szoveg.substring((szoveg.lastIndexOf("\n") + 1));
            return sor;
        }
        if (sorIndex >= maxSor) {
            return sor;
        }
        String keres = szoveg.substring((szoveg.indexOf("\n") + 1));
        boolean meddig = true;
        int i = 0;
        while (meddig){
            if (keres.substring(i, i + 1).equals("\n")){
                if (aktSor == sorIndex){
                    sor = keres.substring(0, keres.indexOf("\n"));
                    return sor;}
                else {
                    keres = keres.substring(keres.indexOf("\n") + 1); 
                    aktSor++;
                    i = 0;
            }
        }
            i++;
            
        }
        return sor;
    }

    public SzerkeszthetoDokumentum szerkeszthetoValtozat() {
        SzerkeszthetoDokumentum SzerkeszthetoDokumentum = new SzerkeszthetoDokumentum();
        this.szoveg = szoveg;
        //SzerkeszthetoDokumentum.szoveg = "";
        return SzerkeszthetoDokumentum;
    }
}
