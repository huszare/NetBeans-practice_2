/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_02_tomb_visitorral;

/**
 *
 * @author
 */
public class Tomb {
    private int[] tomb;


public Tomb (int[] tomb){
    this.tomb = tomb;
    }

public void setElem(int i, int elem){
    this.tomb [i]= elem;
    }

public int getElem(int i){
    int elem = tomb[i];
    return elem;
}

public void visit(Visitor v){
    for (int elem:tomb)
    v.visiting(elem);
       
}
    
}