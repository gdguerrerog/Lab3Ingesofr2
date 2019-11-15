
package headfirst.designpatterns.factory.pizzafm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camilo Quiroga
 */


public class MedellinPaisaPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("Ñampiros")) {
            return new MedellinStyleNampiroPizza();
        } else if (item.equals("Nacional's Team")) {
            return new MedellinStyleNacionalPizza();
        } else if (item.equals("Metro")) {
            return new MedellinStyleMetroPizza();
        } else if (item.equals("Coffee")) {
            return new MedellinStyleCoffeePizza();
        } else {
            return null;
        }
    }
}
