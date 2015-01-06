package composite;


/**
 * Write a description of class Sause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sauce extends BurgerDecorator
{


   public Sauce(BurgerComponent burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }

    public double cost() {

        double costForSauce = (options.length<=1)?0.00:(options.length-1)*0.50;
        return costForSauce + burger.cost();
    }
}
