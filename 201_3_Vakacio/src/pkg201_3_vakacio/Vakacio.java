/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg201_3_vakacio;
import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
/**
 *
 * @author
 */
public class Vakacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy.MM.dd.");
        System.out.printf("Melyik a nyári vakáció első napja? (yyyy.MM.dd. formátumban) ");
        String vakacioBeolvasas = sc.nextLine();
        try {
            DateTime vakacio = dtf.parseDateTime(vakacioBeolvasas);
        } catch (IllegalArgumentException ex) {
            System.out.printf("Nem megfelelő formátum.");
            return;
        }
        DateTime vakacio = dtf.parseDateTime(vakacioBeolvasas);
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
                    DateTime szunetK = dtf.parseDateTime(szunetKBeolvasas);
                } catch (IllegalArgumentException ex)  {
                    System.out.printf("Nem megfelelő formátum.");
                    return;
                }
            
            System.out.printf("Melyik az évközbeni szünet utolsó napja? (yyyy.MM.dd. formátumban) ");
            szunetVBeolvasas = sc.nextLine();
            if (szunetVBeolvasas.equals("-")) {
                szunetMeg = false;
            } else {
                try {
                    DateTime szunetV = dtf.parseDateTime(szunetKBeolvasas);
                } catch (IllegalArgumentException ex)  {
                    System.out.printf("Nem megfelelő formátum.");
                    return;
                }
            
            DateTime szunetK = dtf.parseDateTime(szunetKBeolvasas);
            DateTime szunetV = dtf.parseDateTime(szunetKBeolvasas);
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
                    DateTime atrakK = dtf.parseDateTime(atrakKBeolvasas);
                } catch (IllegalArgumentException ex) {
                    System.out.printf("Nem megfelelő formátum.");
                    return;
                }
            
            System.out.printf("Melyik szünnapon kell cserébe dolgozni? (yyyy.MM.dd. formátumban) ");
            atrakVBeolvasas = sc.nextLine();
            if (atrakVBeolvasas.equals("-")) {
                szunetMeg = false;
            } else {
                try {
                    DateTime atrakV = dtf.parseDateTime(atrakVBeolvasas);
                } catch (IllegalArgumentException ex)  {
                    System.out.printf("Nem megfelelő formátum.");
                    return;
                }
            
            DateTime atrakK = dtf.parseDateTime(atrakKBeolvasas);
            DateTime atrakV = dtf.parseDateTime(atrakVBeolvasas);
            tanev.athelyezMunkanap(atrakK, atrakV);
            }
            }
        }
        //tanev.getSzunet();
       //tanev.getAtrak();
       System.out.printf("Hátralévő iskolai napok száma a mai nappal együtt: %d", tanev.getOktatasiNapok(DateTime.now()));
    }

    }
    

