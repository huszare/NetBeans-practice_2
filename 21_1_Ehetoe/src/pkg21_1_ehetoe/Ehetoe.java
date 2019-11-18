/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_1_ehetoe;


import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 *
 * @author
 */
public class Ehetoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy.MM.dd.");
        System.out.printf("Kérem a termék lejárati idejét (yyyy.MM.dd. formátumban)! ");
        String lejaratBeolvasas = sc.nextLine();
        //String lejaratBeolvasas = "2019.11.12.";
        try {
            DateTime lejaratiTime = dtf.parseDateTime(lejaratBeolvasas);
       } catch (IllegalArgumentException ex) {
            System.out.println("Nem megfelelő formátum.");
            return;
        }
        DateTime lejaratiTime = dtf.parseDateTime(lejaratBeolvasas);
        Aru termek = new Aru(lejaratiTime);
        DateTimeFormatter dtf2 = DateTimeFormat.forPattern("yyyy.MM.dd. HH:mm");
        System.out.println("Kérem a termék felbontási idejét (yyyy.MM.dd. HH:mm formátumban, vagy egy \"-\" jelet, ha nincs még felbontva)!");
        String felbontasBeolvasas = sc.nextLine();
        if (!felbontasBeolvasas.equals("-")) {
            try {
                DateTime felbontasiTime = dtf2.parseDateTime(felbontasBeolvasas);
                //System.out.println(felbontasiTime);
            } catch (IllegalArgumentException ex)  {
                System.out.println("Nem megfelelő formátum.");
                return;
            }
        } //else {
            //termek.setFelbontas(lejaratLDC);
        //}
        if (!felbontasBeolvasas.equals("-")) {
            DateTime felbontasiTime = dtf2.parseDateTime(felbontasBeolvasas);
            termek.setFelbontas(felbontasiTime);
        }
        if (termek.eheto(DateTime.now())) {
            System.out.println("Még ehető!");
        } else {
            System.out.println("Megromlott!");
        }

    }
    }
    
