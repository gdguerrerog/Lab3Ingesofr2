/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badcalc;

/**
 *
 * @author Camilo Quiroga
 */
public class Div {

    int a;
    int b;

    public Div(int a1, int b1) {
        this.a = a1;
        this.b = b1;

    }
    public double operacion(){
        if(b!=0) return a/(b*1.0);
        return -1;
    }
}
