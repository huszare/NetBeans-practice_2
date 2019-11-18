/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_2_lemondasidij;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author
 */
public class LemondasiDij {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Szallas szallo2 = new Szallas(LocalDateTime.of(2016, Month.AUGUST, 15, 13, 50, 10));
        //System.out.printf("%d%% jár vissza.", szallo2.getVisszajaroSzazalek(LocalDateTime.of(2016, Month.AUGUST, 12, 14, 0)));
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
        System.out.printf("Kérem az érkezés napját (yyyy.MM.dd. formátumban)! ");
        String erkezesBeolvasas = sc.nextLine();
        try {
                LocalDate erkezes = LocalDate.parse(erkezesBeolvasas, dtf);
          } catch (DateTimeParseException ex) {
                System.out.printf("Nem megfelelő formátum.");
                return;
            }
        LocalDate erkezes = LocalDate.parse(erkezesBeolvasas, dtf);
        LocalDateTime erkezesiTime = erkezes.atTime(14, 00);
        Szallas szallo = new Szallas(erkezesiTime);
        System.out.printf("%d%% jár vissza.", szallo.getVisszajaroSzazalek(LocalDateTime.now()));
    }
    
}
