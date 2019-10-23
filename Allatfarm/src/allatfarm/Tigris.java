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
public class Tigris extends Allat{
   
    public Tigris(){
        
    }
    
    public Tigris(int kor){
        super(kor);
    }
    
    public String bemutatkozas() {
        String valasz = kor + " éves tigris";
        return valasz;
    }
    
    public void megol(Allat preda){
        String szamar = preda.bemutatkozas();
        System.out.println("A(z) " + kor + " éves tigris megölte " + szamar + "-t.");
        
    }
    public String hang(){
        String hang = "Grrr";
        return hang;
}
}
    

