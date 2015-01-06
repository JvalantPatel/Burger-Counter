package composite;


/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends BurgerDecorator
{


   public Cheese(BurgerComponent burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }


    public double cost() {

        double costForCheese = (options.length<=1)?0.00:(options.length-1)*1.00;

        return costForCheese + burger.cost();
    }
}
