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
public class BankKartya {
    protected int egyenleg;
    private static double KAMAT;
    

public BankKartya(int egyenleg){
    if (egyenleg > 0)
    this.egyenleg = egyenleg;
}

public void setEgyenleg(int egyenleg){
    if (egyenleg > 0)
            this.egyenleg =egyenleg;
       }

public int getEgyenleg(){
    return egyenleg;
}

public void setKAMAT(double kamat){
    if (kamat >= 0)
        this.KAMAT =kamat;
    
}

public double getKAMAT(){
    return KAMAT;
}

public boolean kivesz(int osszeg){
    boolean fedezet = true;
     if (osszeg < 0)
        return false;
    if ((getEgyenleg() - osszeg) >= 0)
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
    double haviKamatD = Math.round(getKAMAT()/100 * egyenleg / 12 );
    int haviKamatI = (int)haviKamatD;;
    this.egyenleg = egyenleg + haviKamatI;
}
}
