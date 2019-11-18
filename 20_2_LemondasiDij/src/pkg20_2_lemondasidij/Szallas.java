/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_2_lemondasidij;

import java.time.LocalDateTime;

/**
 *
 * @author
 */

public class Szallas {
    private LocalDateTime erkezes;
    
    public Szallas(LocalDateTime erkezes){
        LocalDateTime erk = erkezes.withHour(14);
        this.erkezes = erk.withMinute(00);        
    }
    
    public int getVisszajaroSzazalek(LocalDateTime mikor){
        int szazalek = 0;
        if (mikor.isBefore(erkezes.minusMonths(1))) {
            szazalek = 100;
            return szazalek;
        }
        if (mikor.isAfter(erkezes.minusHours(24))) {
            szazalek = 0;
            return szazalek;
        }
        int munkaNap = 0;
        while (munkaNap < 3 ){
            if (mikor.plusDays(1).getDayOfMonth() != 6 || mikor.plusDays(1).getDayOfMonth() != 7)
                munkaNap +=1;}
        mikor = mikor.plusDays(munkaNap);
        if (mikor.isBefore(erkezes) || mikor.isEqual(erkezes)) {
            szazalek = 90;
            //System.out.println(mikor);
            return szazalek;
        } else {
            szazalek = 50;
            //System.out.println(mikor);
            return szazalek;
        }
        
    }
    
}
