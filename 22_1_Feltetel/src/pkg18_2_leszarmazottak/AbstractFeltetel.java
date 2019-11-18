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
public abstract class AbstractFeltetel implements Feltetel{
    
    public abstract boolean feltetel(double elem);
    
    public AbstractFeltetel tagadas(){
        return AbstractFeltetel.this.tagadas();
       // AbstractFeltetel f = new TagadasFeltetel(Feltetel.this);
       // return f;
    }
      
      
    public AbstractFeltetel es(Feltetel jobb){
        AbstractFeltetel f = new EsFeltetel(AbstractFeltetel.this, jobb);
        return f;        
        //return (AbstractFeltetel.this.es(jobb));
    }
   
    
    public AbstractFeltetel vagy(Feltetel jobb){
        AbstractFeltetel f = new VagyFeltetel(AbstractFeltetel.this, jobb);
        return f;          
//return (AbstractFeltetel.this.vagy(jobb));
    }

    
    
    
    
    
}
