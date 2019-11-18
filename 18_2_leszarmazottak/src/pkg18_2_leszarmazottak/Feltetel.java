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
public abstract class Feltetel {
    
    public abstract boolean feltetel(double elem);
    
    public Feltetel tagadas(){
        //return Feltetel.this.tagadas();
        Feltetel f = new TagadasFeltetel(Feltetel.this);
        return f;
    }
      
      
    public Feltetel es(Feltetel jobb){
        Feltetel f = new EsFeltetel(Feltetel.this, jobb);
        return f;        
        //return (Feltetel.this.es(jobb));
    }
   
    
    public Feltetel vagy(Feltetel jobb){
        Feltetel f = new VagyFeltetel(Feltetel.this, jobb);
        return f;          
//return (Feltetel.this.vagy(jobb));
    }

    
    
    
    
    
}
