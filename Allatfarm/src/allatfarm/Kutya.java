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
    protected int elkergetettPostas;


    public Kutya() {
    }

    public Kutya(String nev, int kor, int elkergetettPostas){
    super(nev, kor);
    this.elkergetettPostas = elkergetettPostas;
    }   

    public int getKor() {
        return elkergetettPostas;
    }

    public void setKor(int elkergetettPostas) {
        this.elkergetettPostas = elkergetettPostas;
    }


}