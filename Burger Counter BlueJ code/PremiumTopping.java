package composite;


/**
 * Write a description of class PremiumToppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumTopping extends BurgerDecorator
{
    String twoDollarsTopping = "Marinated Tomatoes";

   public PremiumTopping(BurgerComponent burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }

    
    public double cost() {

        double costForPTopping = options.length*1.00;
        if(checkEntryInOptions(twoDollarsTopping))
        {
            costForPTopping+=2.00;
        }
        return costForPTopping + burger.cost();
    }
}
