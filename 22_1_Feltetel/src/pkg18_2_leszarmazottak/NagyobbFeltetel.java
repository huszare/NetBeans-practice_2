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
public class NagyobbFeltetel extends AbstractFeltetel{
    private final double hatar;
    
     public NagyobbFeltetel(double hatar){
        this.hatar = hatar;
    }
     
      public boolean feltetel(double elem){
        return (elem > hatar);
    }
}
