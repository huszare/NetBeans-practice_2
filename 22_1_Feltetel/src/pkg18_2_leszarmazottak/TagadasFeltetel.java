/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18_2_leszarmazottak;

/**
 *
 * @author
 */
public class TagadasFeltetel extends AbstractFeltetel{
    private final Feltetel pozitiv;
       
    public TagadasFeltetel(Feltetel pozitiv){
        this.pozitiv = pozitiv;
        }
    
    public boolean feltetel(double elem){
        if (pozitiv.feltetel(elem) != true)
            return true;
        else
            return false;
    }
}
