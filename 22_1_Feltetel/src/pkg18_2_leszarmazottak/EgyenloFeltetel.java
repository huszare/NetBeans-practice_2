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
public class EgyenloFeltetel extends AbstractFeltetel{
    private final double mivel;
    
    public EgyenloFeltetel(double mivel){
        this.mivel = mivel;
    }
    
     public boolean feltetel(double elem){
        return (elem == mivel);
    }
}
