/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_2_lemondasidij;

import org.joda.time.DateTime;

/**
 *
 * @author
 */
public class Szallas {

    private DateTime erkezes;

    public Szallas(DateTime erkezes) {
        DateTime erk = new DateTime();
        erk = erkezes.withHourOfDay(14);
        this.erkezes = erk.withMinuteOfHour(0);
    }

    public int getVisszajaroSzazalek(DateTime mikor) {
        int szazalek = 0;
        //System.out.println(mikor);
        if (mikor.isBefore(erkezes.minusMonths(1))) {
            szazalek = 100;
            return szazalek;
        }
        if (mikor.isAfter(erkezes.minusHours(24))) {
            szazalek = 0;
            return szazalek;
        }
        //System.out.println(mikor);
        //System.out.println(erkezes);
        int munkaNap = 0;
        while (munkaNap < 3) {
            if (mikor.getDayOfMonth() != 6 || mikor.getDayOfMonth() != 7) {
                munkaNap += 1;
            }
            mikor = mikor.plusDays(1);
           //System.out.println(mikor);
            //System.out.println(erkezes);
        }
        if (mikor.getHourOfDay() > 13)
            mikor = mikor.plusDays(1);
        if (mikor.isAfter(erkezes)) {
            szazalek = 50;
            //System.out.println(mikor);
            return szazalek;
        } else {
            szazalek = 90;
            //System.out.println(mikor);
            return szazalek;
        }

    }
}
