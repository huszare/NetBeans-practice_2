/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_3_vakacio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.");
        System.out.printf("Melyik a nyári vakáció első napja? (yyyy.MM.dd. formátumban) ");
        String vakacioBeolvasas = sc.nextLine();
        Date vakacioKezd = new Date();
        try {
            vakacioKezd = sdf.parse(vakacioBeolvasas);
        } catch (ParseException ex) {
            System.out.println("Nem megfelelő formátum.");
            return;
        }
        Calendar vakacioCal = Calendar.getInstance();
        vakacioCal.setTime(vakacioKezd);
        Calendar gyujtCal = Calendar.getInstance();
        int napok = 0;
        while (gyujtCal.before(vakacioCal)) {
            if (gyujtCal.get(Calendar.DAY_OF_WEEK) == 1 || gyujtCal.get(Calendar.DAY_OF_WEEK) == 7) {

            } else {
                napok += 1;
            }
            gyujtCal.add(Calendar.DAY_OF_WEEK, 1);
        }
        //System.out.println(napok);
        System.out.println("Évközi szünetek felvitele:");
        boolean szunetMeg = true;
        String szunetKBeolvasas;
        String szunetVBeolvasas;
        Date szunetKezd = new Date();
        Date szunetVeg = new Date();
        while (szunetMeg) {
            System.out.printf("Melyik az évközbeni szünet első napja? (yyyy.MM.dd. formátumban, - jel, ha nincs több.) ");
            szunetKBeolvasas = sc.nextLine();
            if (szunetKBeolvasas.equals("-")) {
                szunetMeg = false;
            } else {
                try {
                    szunetKezd = sdf.parse(szunetKBeolvasas);
                } catch (ParseException ex) {
                    System.out.println("Nem megfelelő formátum.");
                    return;
                }
                System.out.printf("Melyik az évközbeni szünet utolsó napja? (yyyy.MM.dd. formátumban) ");
                szunetVBeolvasas = sc.nextLine();
                try {
                    szunetVeg = sdf.parse(szunetVBeolvasas);
                } catch (ParseException ex) {
                    System.out.println("Nem megfelelő formátum.");
                    return;
                }
                Calendar szunetKCal = Calendar.getInstance();
                gyujtCal.setTime(szunetKezd);
                Calendar szunetVCal = Calendar.getInstance();
                szunetVCal.setTime(szunetVeg);
                Calendar now = Calendar.getInstance();
                if (gyujtCal.before(now)){
                    gyujtCal = now;
                    //gyujtCal.add(Calendar.DAY_OF_WEEK, 1);
                }    
                while (gyujtCal.before(szunetVCal)|| gyujtCal == szunetVCal) {
                    if (gyujtCal.get(Calendar.DAY_OF_WEEK) == 1 || gyujtCal.get(Calendar.DAY_OF_WEEK) == 7) {

                    } else {
                        napok -= 1;
                    }
                    gyujtCal.add(Calendar.DAY_OF_WEEK, 1);
                }
            }
        }
        //System.out.println(napok);
        System.out.println("Munkanap áthelyezések:");
        szunetMeg = true;
        while (szunetMeg) {
            System.out.printf("Melyik munkanap lesz szünet? (yyyy.MM.dd. formátumban, - jel, ha nincs több.) ");
            szunetKBeolvasas = sc.nextLine();
            if (szunetKBeolvasas.equals("-")) {
                szunetMeg = false;
            } else {
                try {
                    szunetKezd = sdf.parse(szunetKBeolvasas);
                } catch (ParseException ex) {
                    System.out.println("Nem megfelelő formátum.");
                    return;
                }
                System.out.printf("Melyik szünnapon kell cserébe dolgozni? (yyyy.MM.dd. formátumban) ");
                szunetVBeolvasas = sc.nextLine();
                try {
                    szunetVeg = sdf.parse(szunetVBeolvasas);
                } catch (ParseException ex) {
                    System.out.println("Nem megfelelő formátum.");
                    return;
                }
                gyujtCal.setTime(szunetKezd);
                Calendar szunetKCal = Calendar.getInstance();
                gyujtCal.setTime(szunetKezd);
                Calendar szunetVCal = Calendar.getInstance();
                szunetVCal.setTime(szunetVeg);
                Calendar now = Calendar.getInstance();
                if (now.after(szunetVCal) && szunetKCal.after(now)) {
                    napok -= 1;
                }
                if (now.after(szunetKCal) && szunetVCal.after(now)) {
                    napok += 1;
                }
            }
        }
        System.out.println("Hátralévő iskolai napok száma a mai nappal együtt: " + napok);
    }
}
