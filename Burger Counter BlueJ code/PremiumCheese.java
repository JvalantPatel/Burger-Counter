package composite;


/**
 * Write a description of class PremiumCheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumCheese extends BurgerDecorator
{
     public PremiumCheese(BurgerComponent burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }


    public double cost() {

        double costForPCheese = (options.length)*1.50;

        return costForPCheese + burger.cost();
    }
}
