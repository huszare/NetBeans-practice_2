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
public class Kutya extends HaziAllat{
    private int elkergetettPostas;


    public Kutya() {
    }

    public Kutya(String nev, int kor, int elkergetettPostas){
    super(nev, kor);
    this.elkergetettPostas = elkergetettPostas;
    } 
    
    public String bemutatkozas(){
        String kutya = nev + " kutya (" + kor + " éves, " +  elkergetettPostas + " elkergetett postás)";
        return kutya;
    }
    
    public void megol(Allat preda){
        String szamar = preda.bemutatkozas();
        String kutya = bemutatkozas();
        System.out.println("A(z) " + kutya + " megölte " + szamar + "-t.");        
//System.out.println(" \"A(z) Blöki kutya (3 éves, 12 elkergetett postás) megölte Samantha, a(z) 1 éves nem makacs szamár-t\" ");
    }
    
    public String hang(){
        String hang = "Vau";
        return hang;
    }

    public int getElkergetettPostas() {
        return elkergetettPostas;
    }

    public void setElkergetettPostas(int elkergetettPostas) {
        this.elkergetettPostas = elkergetettPostas;
    }


}