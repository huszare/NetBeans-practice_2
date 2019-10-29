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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Dokumentum teszt = new Dokumentum();
       SzerkeszthetoDokumentum teszt = new SzerkeszthetoDokumentum();
       //teszt.szoveg = "0123456789kati56789\n0123456789zoli56789\n0123456789feri56789\n";
       //teszt.szoveg = "Lorem ipsum dolor sit amet,\n" + "est an modus semper convenire.\n" + "Recteque scriptorem mea te,\n" + "eruditi vituperata mediocritatem est cu.";
       teszt.szoveg = "buokckrb lfgqni ncsmq\n" + "zmnyrbs ftu ejo\n";
       System.out.println(teszt.getSzoveg());
       System.out.println("hossz:" + teszt.getHossz());
        System.out.println("last n" + teszt.szoveg.lastIndexOf("\n"));
       System.out.println("sor:" + teszt.getSorokSzama());
       System.out.println("sor:" + teszt.getSor(1));
       System.out.println("beszur xxxx zoli elé: ");
       teszt.beszur( 30, "xxxx");
       System.out.println("töröl xxxx");
       teszt.torol( 0, 4);
       System.out.println("töröl zoli");
       teszt.torol( 30, 4);
       System.out.println("vissza zoli: ");
       teszt.beszur( 30, "zoli");
       System.out.println("cserél feri: ");
       teszt.cserel( 50, 4, "liza");
       System.out.println("hozzáfűz feri: ");
       teszt.hozzafuz( "feri");
       SzerkeszthetoDokumentum teszt3 = new SzerkeszthetoDokumentum();
       teszt3.szoveg = "Lorem ipsum dolor sit amet,\n" + "est an modus semper convenire.\n" + "Recteque scriptorem mea te,\n" + "eruditi vituperata mediocritatem est cu."; 
       System.out.println("beszúr sor" );
        teszt3.sorBeszur(4, "iuglgliugliug");       
       SzerkeszthetoDokumentum teszt2 = new SzerkeszthetoDokumentum();
      // System.out.println(" 1 sor töröl");
     teszt2.szoveg = "0123456789kati56789\n0123456789zoli56789\n0123456789feri56789\n";
     teszt2.sorTorol( 0);
      teszt2.szerkeszthetoValtozat();
       SzerkeszthetoDokumentum teszt4 = new SzerkeszthetoDokumentum();
       teszt4.szoveg = "hazikcic aqauycys ocnvq\n" +"qtpb itwqzpp zgn\n" +"yxsjpp uqtlkhwe\n" +"vmhzwf xxadbnv";
      System.out.println("sor:" + teszt4.getSorokSzama());
      SzerkeszthetoDokumentum teszt5 = new SzerkeszthetoDokumentum();
      teszt4.szoveg = "yrzt mbbmtv hkvgrvtb xec wnse\n" + "yapiuwn egi xdtwv syp nswvuj\n" + "lxlzfi ihwk";
      teszt5.szerkeszthetoValtozat();
      
    }
    
}
