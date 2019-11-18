/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_03_vakacio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Vakacio_old {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.");
        System.out.println("Melyik a nyári vakáció első napja? (yyyy.MM.dd. formátumban) ");
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
        Calendar now = Calendar.getInstance();
        Calendar evNap = Calendar.getInstance();
        int kezdNap = now.get(Calendar.DAY_OF_MONTH);
        int kezdHo = now.get(Calendar.MONTH);
        int vegNap = vakacioCal.get(Calendar.DAY_OF_MONTH);
        int vegHo = vakacioCal.get(Calendar.MONTH);
        int[][] ev = new int[12][31];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                ev[i][j] = 0;
            }
        }
        evNap.set(Calendar.YEAR, now.get(Calendar.YEAR));
        if (now.get(Calendar.YEAR) < vakacioCal.get(Calendar.YEAR)) {
            for (int i = kezdHo; i < 12; i++) {
                for (int j = 0; j < 31; j++) {
                    if (i == kezdHo && j < kezdNap) {
                        j = kezdNap;
                    }
                    evNap.set(Calendar.MONTH, i);
                    evNap.set(Calendar.DAY_OF_WEEK, j);
                    if (evNap.get(Calendar.DAY_OF_WEEK) == 1 || evNap.get(Calendar.DAY_OF_WEEK) == 7) {
                        ev[i][j] = 0;
                    } else {
                        ev[i][j] = 1;
                    }
                }
            }
            evNap.set(Calendar.YEAR, vakacioCal.get(Calendar.YEAR));
            for (int i = 0; i <= vegHo; i++) {
                for (int j = 0; j < 31; j++) {
                    evNap.set(Calendar.MONTH, i);
                    evNap.set(Calendar.DAY_OF_WEEK, j);
                    if (evNap.get(Calendar.DAY_OF_WEEK) == 1 || evNap.get(Calendar.DAY_OF_WEEK) == 7) {
                        ev[i][j] = 0;
                    } else {
                        ev[i][j] = 1;
                    }
                    if (i == vegHo && j == vegNap) {
                        j = 31;
                    }
                }
            }
        } else {
            for (int i = kezdHo; i <= vegHo; i++) {
                for (int j = 0; j < 31; j++) {
                    if (i == kezdHo && j < kezdNap) {
                        j = kezdNap;
                    }
                    evNap.set(Calendar.MONTH, i);
                    evNap.set(Calendar.DAY_OF_WEEK, j);
                    if (evNap.get(Calendar.DAY_OF_WEEK) == 1 || evNap.get(Calendar.DAY_OF_WEEK) == 7) {
                        ev[i][j] = 0;
                    } else {
                        ev[i][j] = 1;
                    }
                    if (i == vegHo && j == vegNap) {
                        j = 31;
                    }
                }
            }
        }
        int napok = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                napok += ev[i][j];
            }
        }
        System.out.println(napok);

        System.out.println("Évközi szünetek felvitele:");
        boolean szunetMeg = true;
        String szunetKBeolvasas;
        String szunetVBeolvasas;
        Date szunetKezd = new Date();
        Date szunetVeg = new Date();
        while (szunetMeg) {
            System.out.printf("Melyik az évközbeni szünet első napja? (yyyy.MM.dd. formátumban, - jel, ha nincs több.) ");
            szunetKBeolvasas = sc.nextLine();
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
            szunetKCal.setTime(szunetKezd);
            Calendar szunetVCal = Calendar.getInstance();
            szunetVCal.setTime(szunetVeg);
            kezdNap = szunetKCal.get(Calendar.DAY_OF_MONTH);
            kezdHo = szunetKCal.get(Calendar.MONTH);
            vegNap = szunetVCal.get(Calendar.DAY_OF_MONTH);
            vegHo = szunetVCal.get(Calendar.MONTH);
            evNap.set(Calendar.YEAR, szunetKCal.get(Calendar.YEAR));
            for (int i = kezdHo; i <= vegHo; i++) {
                for (int j = 0; j < 31; j++) {
                    if (i == kezdHo && j < kezdNap) {
                        j = kezdNap;
                    }
                    evNap.set(Calendar.MONTH, i);
                    evNap.set(Calendar.DAY_OF_WEEK, j);
                    if (evNap.get(Calendar.DAY_OF_WEEK) == 1 || evNap.get(Calendar.DAY_OF_WEEK) == 7) {
                        ev[i][j] = 0;
                    } else {
                        ev[i][j] = 1;
                    }
                    if (i == vegHo && j == vegNap) {
                        j = 31;
                    }
                }
            }
            
        }
        System.out.println("Munkanap áthelyezések:");

    }
}
