/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_1_ehetoe;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.");
        SimpleDateFormat sdfFel = new SimpleDateFormat("yyyy.MM.dd. HH:mm");
        Date lejaratiIdo = new Date();
        Date felbontasiIdo = new Date();
        System.out.printf("Kérem a termék lejárati idejét (yyyy.MM.dd. formátumban)! ");
        String lejaratBeolvasas = sc.nextLine();
        try {
            lejaratiIdo = sdf.parse(lejaratBeolvasas);
        } catch (ParseException ex) {
            System.out.println("Nem megfelelő formátum.");
            return;
        }
        System.out.println("Kérem a termék felbontási idejét (yyyy.MM.dd. HH:mm formátumban, vagy egy \"-\" jelet, ha nincs még felbontva)!");
        String felbontasBeolvasas = sc.nextLine();
        if (!felbontasBeolvasas.equals("-")) {
            try {
                felbontasiIdo = sdfFel.parse(felbontasBeolvasas);
            } catch (ParseException ex) {
                System.out.println("Nem megfelelő formátum.");
                return;
            }
        } else {
            felbontasiIdo = lejaratiIdo;
        }
        Calendar lejaratiCal = Calendar.getInstance();
        lejaratiCal.setTime(lejaratiIdo);
        lejaratiCal.add(Calendar.DAY_OF_MONTH, +11);
        Calendar felbontasiCal = Calendar.getInstance();
        felbontasiCal.setTime(felbontasiIdo);
        if (!felbontasBeolvasas.equals("-")) 
            felbontasiCal.add(Calendar.DAY_OF_MONTH, +3);
        Calendar ma = Calendar.getInstance();
        ma.set(Calendar.HOUR_OF_DAY, 23);
        ma.set(Calendar.MINUTE, 59);
        ma.set(Calendar.SECOND, 0);
        ma.set(Calendar.MILLISECOND, 0);
        if (lejaratiCal.before(ma))
            System.out.println("Megromlott!");
        else{
        if (felbontasiCal.after(Calendar.getInstance()) || felbontasBeolvasas.equals("-")) {
            System.out.println("Még ehető!");
            //System.out.println(sdfFel.format(felbontasiCal.getTime()));
            } else {
            System.out.println("Megromlott!");
            //System.out.println(sdfFel.format(felbontasiCal.getTime()));
           }
        }
    }
}
