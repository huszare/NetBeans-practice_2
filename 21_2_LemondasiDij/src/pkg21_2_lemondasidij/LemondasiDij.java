/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_2_lemondasidij;
import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
/**
 *
 * @author
 */
public class LemondasiDij {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy.MM.dd.");
        System.out.printf("Kérem az érkezés napját (yyyy.MM.dd. formátumban)! ");
        String erkezesBeolvasas = sc.nextLine();
        try {
                DateTime erkezes = dtf.parseDateTime(erkezesBeolvasas);
          } catch (IllegalArgumentException ex) {
                System.out.printf("Nem megfelelő formátum.");
                return;
            }
        DateTime erkezes = dtf.parseDateTime(erkezesBeolvasas);
        DateTime erkezesiTime = erkezes;
        Szallas szallo = new Szallas(erkezesiTime);
        System.out.printf("%d%% jár vissza.", szallo.getVisszajaroSzazalek(DateTime.now()));
        //System.out.println(DateTime.now().minusDays(4));
        //System.out.printf("%d%% jár vissza.", szallo.getVisszajaroSzazalek(DateTime.now().minusDays(4)));
        //System.out.printf("%d%% jár vissza.", szallo.getVisszajaroSzazalek(new DateTime(2019, 12, 04, 15, 0)));
    }
    
    }
    

