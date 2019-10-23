/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allatfarm;

/**
 *
 * @author
 */
public class Szamar extends HaziAllat{
    protected boolean makacs;
    
    public Szamar(){
        
    }
    
    public Szamar(String nev, int kor, boolean makacs){
        super(nev, kor);
        this.makacs = makacs;
    }
    
    public String bemutatkozas() {
        String makacs = new String();
        if (getMakacs())
            makacs = "makacs";
        else
            makacs = "nem makacs";
        String valasz = nev + ", a(z) " +  kor + " éves " + makacs + " szamár";
        //System.out.println("Hisztéria, a(z) 3 éves makacs szamár");
        return valasz;
    }
    
    public boolean getMakacs() {
        return makacs;
    }

    public void setMakacs(boolean makacs) {
        this.makacs = makacs;
    }
}
