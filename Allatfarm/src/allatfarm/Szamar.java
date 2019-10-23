/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allatfarm;

import java.util.Random;

/**
 *
 * @author
 */
public class Szamar extends HaziAllat{
    private boolean makacs;
    
    public Szamar(){
        
    }
    
    public Szamar(String nev, int kor, boolean makacs){
        super(nev, kor);
        this.makacs = makacs;
    }
    
    public String bemutatkozas() {
        String makacs = new String();
        if (isMakacs())
            makacs = "makacs";
        else
            makacs = "nem makacs";
        String valasz = nev + ", a(z) " +  kor + " éves " + makacs + " szamár";
        //System.out.println("Hisztéria, a(z) 3 éves makacs szamár");
        return valasz;
    }
    
    public void kocsitHuz(){
         if (isMakacs()){
            Random generator = new Random(); 
             int makacs = generator.nextInt(2)+1;
             if (makacs == 1)
                System.out.println("Megmakacsolta magát.");
             else
                System.out.println("Kocsit húz.");   
         }
        else
            System.out.println("Kocsit húz.");
       }
  
    public String hang(){
        String hang = "Iá";
        return hang;
    }
    
    public boolean isMakacs() {
        return makacs;
    }

    public void setMakacs(boolean makacs) {
        this.makacs = makacs;
    }
}
