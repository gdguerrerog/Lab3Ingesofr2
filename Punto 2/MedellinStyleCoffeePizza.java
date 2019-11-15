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
public class MedellinStyleCoffeePizza extends Pizza {

    public MedellinStyleCoffeePizza() {
        name = "Mellas Style Sauce y Cafe!";
        dough = "Gruesa y con ligero sabor a cafe";
        sauce = "Salsa de Chocolate en leche";
        toppings.add("Cafe recien molido");
    }

}
