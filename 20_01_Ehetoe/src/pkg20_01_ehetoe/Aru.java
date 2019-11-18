/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_01_ehetoe;

import java.time.LocalDateTime;

/**
 *
 * @author
 */
public class Aru {

    private LocalDateTime lejarat;
    private LocalDateTime felbontas;

    public Aru(LocalDateTime lejarat) {
        LocalDateTime lejar = lejarat.withHour(23);
        this.lejarat = lejar.withMinute(59);
        //this.resolutionTime = resolutionTime.of(year, month, day, hour, min);
    }

    public void setFelbontas(LocalDateTime felbontas) {
        this.felbontas = felbontas;
    }

    public boolean eheto(LocalDateTime vizsgalt) {
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
