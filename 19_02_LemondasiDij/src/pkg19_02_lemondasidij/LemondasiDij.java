/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_02_lemondasidij;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.");
        System.out.printf("Kérem az érkezés napját (yyyy.MM.dd. formátumban)! ");
        Date erkezesiIdo = new Date();
        String erkezesiBeolvasas = sc.nextLine();
        try {
            erkezesiIdo = sdf.parse(erkezesiBeolvasas);
        } catch (ParseException ex) {
            System.out.println("Nem megfelelő formátum.");
            return;
        }
        Calendar erkezesiCal = Calendar.getInstance();
        erkezesiCal.setTime(erkezesiIdo);
        Calendar now = Calendar.getInstance();
        now.add(Calendar.MONTH, 1);
        if (erkezesiCal.after(now)) {
            System.out.println("100% jár vissza.");
            return;
        }
        erkezesiCal.set(Calendar.HOUR_OF_DAY, 14);
        now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_MONTH, 1);
        if (erkezesiCal.before(now)) {
            System.out.println("0% jár vissza.");
            return;
        }
        now = Calendar.getInstance();
        int nap3 = 0;
        while (nap3 < 4) {
            now.add(Calendar.DAY_OF_MONTH, 1);
            if (now.get(Calendar.DAY_OF_WEEK) != 1 || now.get(Calendar.DAY_OF_WEEK) != 7) {
                nap3 += 1;
            }
        }
        if (erkezesiCal.before(now)) {
            System.out.println("50% jár vissza.");
        } else {
            System.out.println("90% jár vissza.");
        }
    }

}
