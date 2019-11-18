/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_01_ehetoe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Ehetoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aru tejfol = new Aru(LocalDateTime.of(2016, Month.AUGUST, 8, 23, 59));
        //tejfol.setFelbontas(LocalDateTime.of(2016, Month.AUGUST, 15, 12, 00));
        //if (tejfol.eheto(LocalDateTime.now())) {
        //    System.out.println("Még ehető!");
        //} else {
        //    System.out.println("Megromlott!");
        //}

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
        System.out.printf("Kérem a termék lejárati idejét (yyyy.MM.dd. formátumban)! ");
        String lejaratBeolvasas = sc.nextLine();
        //String lejaratBeolvasas = "2019.11.12.";
        try {
            LocalDate lejaratiTime = LocalDate.parse(lejaratBeolvasas, dtf);
            //System.out.println(lejaratiTime);
        } catch (DateTimeParseException ex) {
            System.out.println("Nem megfelelő formátum.");
            return;
        }
        LocalDate lejaratiTime = LocalDate.parse(lejaratBeolvasas, dtf);
        LocalDateTime lejaratLDC = lejaratiTime.atTime(23, 59);
        Aru termek = new Aru(lejaratLDC);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm");
        System.out.println("Kérem a termék felbontási idejét (yyyy.MM.dd. HH:mm formátumban, vagy egy \"-\" jelet, ha nincs még felbontva)!");
        String felbontasBeolvasas = sc.nextLine();
        if (!felbontasBeolvasas.equals("-")) {
            try {
                LocalDateTime felbontasiTime = LocalDateTime.parse(felbontasBeolvasas, dtf2);
                //System.out.println(felbontasiTime);
            } catch (DateTimeParseException ex) {
                System.out.println("Nem megfelelő formátum.");
                return;
            }
        } //else {
            //termek.setFelbontas(lejaratLDC);
        //}
        if (!felbontasBeolvasas.equals("-")) {
            LocalDateTime felbontasiTime = LocalDateTime.parse(felbontasBeolvasas, dtf2);
            termek.setFelbontas(felbontasiTime);
        }
        if (termek.eheto(LocalDateTime.now())) {
            System.out.println("Még ehető!");
        } else {
            System.out.println("Megromlott!");
        }

    }

}
