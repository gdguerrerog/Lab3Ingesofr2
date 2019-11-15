/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirst.designpatterns.factory.pizzafm;

/**
 *
 * @author Camilo Quiroga
 */
public class MedellinStyleMetroPizza extends Pizza{
    
    public MedellinStyleMetroPizza() {
        name = "Pizza orgullo al metropolitano!";
        dough = "Rectangular y delgada";
        sauce = "Salsa Mayonesa y Mostaza, como los colores de nuestro metro ";
        toppings.add("Una pisca de azucar para endulzar el dia");
    }
}
