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
public class MedellinStyleNacionalPizza extends Pizza {

    public MedellinStyleNacionalPizza() {
        name = "Apoya a tu equipo!";
        dough = "Delgada pero con bastante area";
        sauce = "Salsa de tomate y BBQ";
        toppings.add("Jamon y Peperoni");
    }
    
}
