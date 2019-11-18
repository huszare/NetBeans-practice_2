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
public class EsFeltetel extends AbstractFeltetel{
    private final Feltetel egyik;
    private final Feltetel masik;
    
    public EsFeltetel(Feltetel egyik, Feltetel masik){
        this.egyik = egyik;
        this.masik = masik;
    }
    
    public boolean feltetel(double elem){
        return (egyik.feltetel(elem) && masik.feltetel(elem));
    }
}
