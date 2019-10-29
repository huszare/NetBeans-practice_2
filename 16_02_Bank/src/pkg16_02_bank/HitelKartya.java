/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_02_bank;

/**
 *
 * @author
 */
public class HitelKartya extends BankKartya{
    private int hitelkeret;
    private static double HITELKAMAT ;


public HitelKartya(int egyenleg, int hitelkeret){
    super(egyenleg);
    if (hitelkeret < 0)
        this.hitelkeret = 0;
    else
    this.hitelkeret = hitelkeret;
}

public void setHitelkeret(int hitelkeret){
    if (hitelkeret > 0)
       this.hitelkeret = hitelkeret;
}

public int getHitelkeret(){
    return hitelkeret;
}

public void setHITELKAMAT(double hitelkamat){
    if (hitelkamat >= 0)
         this.HITELKAMAT = hitelkamat;
}

public double getHITELKAMAT(){
    return HITELKAMAT;
}

public boolean kivesz(int osszeg){
    boolean fedezet = true;
    if (osszeg < 0)
        return false;
    if ((getEgyenleg() + getHitelkeret()- osszeg) >= 0)
        this.egyenleg = getEgyenleg() - osszeg;
    else
        fedezet = false;
    return fedezet;
}

public void betesz(int osszeg){
    if (osszeg > 0)
        this.egyenleg = egyenleg + osszeg;
}

public void kamatozik(){
    double haviKamatD = 0;
    int haviKamatI = 0;
    if (getEgyenleg() > 0){
        haviKamatD = Math.round(getKAMAT()/100 * egyenleg / 12 );
        haviKamatI = (int)haviKamatD;;
        this.egyenleg = egyenleg + haviKamatI;
    } else {
    haviKamatD = Math.round(getHITELKAMAT()/100 * Math.abs(egyenleg) / 12 );
    haviKamatI = (int)haviKamatD;;
    this.egyenleg = egyenleg - haviKamatI;}
}
}