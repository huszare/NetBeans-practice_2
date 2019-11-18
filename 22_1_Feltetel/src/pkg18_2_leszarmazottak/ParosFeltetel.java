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
public class ParosFeltetel extends AbstractFeltetel{
    
    public ParosFeltetel(){
        
    }
    
     public boolean feltetel(double elem){
        return ((elem % 2) == 0);
    }
    
}
