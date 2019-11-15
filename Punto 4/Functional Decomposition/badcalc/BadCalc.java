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
public class BadCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma sum = new Suma(10, 4);
        System.out.println("Suma: " + sum.operacion());
        Resta res = new Resta(15, 8);
        System.out.println("Resta: " + res.operacion());
        Multi mul = new Multi(10, 4);
        System.out.println("Multi: " + mul.operacion());
        Div div = new Div(15, 8);
        System.out.println("Div: " + div.operacion());
    }

}
