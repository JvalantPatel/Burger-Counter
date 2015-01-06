package composite;


/**
 * Write a description of class Toppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Topping extends BurgerDecorator
{


   public Topping(BurgerComponent burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }

    public double cost() {

        double costForTopping = 0.0;//(options.length<=4)?0.00:(options.length-4)*0.75;

        return costForTopping + burger.cost();
    }
}
