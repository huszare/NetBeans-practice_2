/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_1_ehetoe;

import org.joda.time.DateTime;

/**
 *
 * @author
 */
public class Aru {
    private DateTime lejarat;
    private DateTime felbontas;

    public Aru (DateTime lejarat ) {
        DateTime lejar = new DateTime();
        lejar = lejarat.withHourOfDay(23);
        this.lejarat = lejar.withMinuteOfHour(59);
        //this.resolutionTime = resolutionTime.of(year, month, day, hour, min);
    }

    public void setFelbontas(DateTime felbontas) {
        this.felbontas = felbontas;
    }

    public boolean eheto(DateTime vizsgalt) {
        if (lejarat.plusDays(10).isBefore(vizsgalt)) {
            return false;
        } else {
            if (felbontas == null) {
                return true;
            } else {
                if (felbontas.plusDays(3).isAfter(vizsgalt)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    
}
