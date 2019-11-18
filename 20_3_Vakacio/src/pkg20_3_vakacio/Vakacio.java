/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_3_vakacio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Vakacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Iskola oktatasiNapok = new Iskola(LocalDate.of(2020, 6, 27));
        //oktatasiNapok.addSzunet(LocalDate.of(2020, 2, 1), LocalDate.of(2020, 2, 5));
        //oktatasiNapok.addSzunet(LocalDate.of(2020, 4, 2), LocalDate.of(2020, 4, 8));
        //oktatasiNapok.athelyezMunkanap(LocalDate.of(2020, 3, 14), LocalDate.of(2020, 3, 5));
        //System.out.printf("Hátralévő iskolai napok száma a mai nappal együtt: %d", oktatasiNapok.getOktatasiNapok(LocalDate.now()));

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
        System.out.printf("Melyik a nyári vakáció első napja? (yyyy.MM.dd. formátumban) ");
        String vakacioBeolvasas = sc.nextLine();
        try {
            LocalDate vakacio = LocalDate.parse(vakacioBeolvasas, dtf);
        } catch (DateTimeParseException ex) {
            System.out.printf("Nem megfelelő formátum.");
            return;
        }
        LocalDate vakacio = LocalDate.parse(vakacioBeolvasas, dtf);
        Iskola tanev = new Iskola(vakacio);
        System.out.println("Évközi szünetek felvitele:");
        boolean szunetMeg = true;
        String szunetKBeolvasas;
        String szunetVBeolvasas;
        while (szunetMeg) {
            System.out.printf("Melyik az évközbeni szünet első napja? (yyyy.MM.dd. formátumban, - jel, ha nincs több.) ");
            szunetKBeolvasas = sc.nextLine();
            if (szunetKBeolvasas.equals("-")) {
                szunetMeg = false;
            } else {
                try {
                    LocalDate szunetK = LocalDate.parse(szunetKBeolvasas, dtf);
                } catch (DateTimeParseException ex) {
                    System.out.printf("Nem megfelelő formátum.");
                    return;
                }
            
            System.out.printf("Melyik az évközbeni szünet utolsó napja? (yyyy.MM.dd. formátumban) ");
            szunetVBeolvasas = sc.nextLine();
            if (szunetVBeolvasas.equals("-")) {
                szunetMeg = false;
            } else {
                try {
                    LocalDate szunetV = LocalDate.parse(szunetVBeolvasas, dtf);
                } catch (DateTimeParseException ex) {
                    System.out.printf("Nem megfelelő formátum.");
                    return;
                }
            
            LocalDate szunetK = LocalDate.parse(szunetKBeolvasas, dtf);
            LocalDate szunetV = LocalDate.parse(szunetVBeolvasas, dtf);
            tanev.addSzunet(szunetK, szunetV);
            }
            }
        }
        System.out.println("Munkanap áthelyezések:");
        szunetMeg = true;
        String atrakKBeolvasas;
        String atrakVBeolvasas;
        while (szunetMeg) {
            System.out.printf("Melyik munkanap lesz szünet? (yyyy.MM.dd. formátumban, - jel, ha nincs több.) ");
            atrakKBeolvasas = sc.nextLine();
            if (atrakKBeolvasas.equals("-")) {
                szunetMeg = false;
            } else {
                try {
                    LocalDate atrakK = LocalDate.parse(atrakKBeolvasas, dtf);
                } catch (DateTimeParseException ex) {
                    System.out.printf("Nem megfelelő formátum.");
                    return;
                }
            
            System.out.printf("Melyik szünnapon kell cserébe dolgozni? (yyyy.MM.dd. formátumban) ");
            atrakVBeolvasas = sc.nextLine();
            if (atrakVBeolvasas.equals("-")) {
                szunetMeg = false;
            } else {
                try {
                    LocalDate atrakV = LocalDate.parse(atrakVBeolvasas, dtf);
                } catch (DateTimeParseException ex) {
                    System.out.printf("Nem megfelelő formátum.");
                    return;
                }
            
            LocalDate atrakK = LocalDate.parse(atrakKBeolvasas, dtf);
            LocalDate atrakV = LocalDate.parse(atrakVBeolvasas, dtf);
            tanev.athelyezMunkanap(atrakK, atrakV);
            }
            }
        }
        //tanev.getSzunet();
       //tanev.getAtrak();
       System.out.printf("Hátralévő iskolai napok száma a mai nappal együtt: %d", tanev.getOktatasiNapok(LocalDate.now()));
    }

}
