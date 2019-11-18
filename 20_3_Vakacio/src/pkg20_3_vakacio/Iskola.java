/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_3_vakacio;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author
 */
public class Iskola {

    private LocalDate vakacioElsoNapja;
    private LocalDate[][] szunet = new LocalDate[10][2];
    private LocalDate[][] atrak = new LocalDate[10][2];

    public Iskola(LocalDate vakacio) {
        this.vakacioElsoNapja = vakacio;
    }

    public void addSzunet(LocalDate kezd, LocalDate vege) {
        int sorszam = 0;
        while (szunet[sorszam][0] != null) {
            sorszam++;
        }
        this.szunet[sorszam][0] = kezd;
        this.szunet[sorszam][1] = vege;
    }

    public void athelyezMunkanap(LocalDate szabad, LocalDate dolgoz) {
        int sorszam = 0;
        while (atrak[sorszam][0] != null) {
            sorszam++;
        }
        this.atrak[sorszam][0] = szabad;
        this.atrak[sorszam][1] = dolgoz;
    }

    public int getOktatasiNapok(LocalDate mikor) {
        int oktatasiNap = 0;
        LocalDate mikor2 = mikor;
        while (mikor.isBefore(vakacioElsoNapja)) {
            if (mikor.getDayOfWeek() == DayOfWeek.SUNDAY || mikor.getDayOfWeek() == DayOfWeek.SATURDAY) {

            } else {
                oktatasiNap += 1;
            }
            mikor = mikor.plusDays(1);
        }
        for (int i = 0; szunet[i][0] != null; i++) {
            if (szunet[i][0].isBefore(mikor2)) {
                szunet[i][0] = mikor2;
            }
            while (szunet[i][0].isBefore(szunet[i][1]) || szunet[i][0].isEqual(szunet[i][1])) {
                if (szunet[i][0].getDayOfWeek() == DayOfWeek.SUNDAY || szunet[i][0].getDayOfWeek() == DayOfWeek.SATURDAY) {

                } else {
                    oktatasiNap -= 1;
                }
                szunet[i][0] = szunet[i][0].plusDays(1);
            }
        }
        for (int i = 0; atrak[i][0] != null; i++) {
            if (mikor2.isAfter(atrak[i][1]) && atrak[i][0].isAfter(mikor2)) {
                oktatasiNap -= 1;
            }
            if (mikor2.isAfter(atrak[i][0]) && atrak[i][1].isAfter(mikor2)) {
                oktatasiNap += 1;
            }
        }
        return oktatasiNap;
    }

    public void getSzunet() {
        for (int i = 0; szunet[i][0] != null; i++) {
            System.out.println(szunet[i][0]);
            System.out.println(szunet[i][1]);
        }

    }

    public void getAtrak() {
        for (int i = 0; atrak[i][0] != null; i++) {
            System.out.println(atrak[i][0]);
            System.out.println(atrak[i][1]);
        }
    }
}
