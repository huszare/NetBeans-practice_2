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
public class Feltetelek{
    //public static Feltetel f;
    
    //public Feltetelek(){
   //     this.f = f;
  //  }
  
    public static Feltetel getNagyobb10EsKisebbEgyenlo50Feltetel(){
       //Feltetel f1 = new NagyobbFeltetel(10.0);
       //Feltetel f2 = new NagyobbFeltetel(50.0);
       //f2 = f2.tagadas();
       return new NagyobbFeltetel(10.0).es(new NagyobbFeltetel(50.0).tagadas());
       //new NagyobbFeltetel(9).es(new NagyobbFeltetel(99).tagadas());
    }

    public static Feltetel getNagyobb10EsParatlanFeltetel(){
       //Feltetel f1 = new NagyobbFeltetel(10.0);
       //Feltetel f2 = new ParosFeltetel();
       //f2 = f2.tagadas();
       return new NagyobbFeltetel(10.0).es(new ParosFeltetel().tagadas());
}
        
    public static Feltetel getNagyobb20VagyParosFeltetel(){
       //Feltetel f1 = new NagyobbFeltetel(20.0);
       //Feltetel f2 = new ParosFeltetel();
       return new NagyobbFeltetel(20.0).vagy(new ParosFeltetel());
}
}
