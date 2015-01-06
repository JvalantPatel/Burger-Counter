package composite;


/**
 * Write a description of class Side here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Side extends BurgerDecorator
{
    public Side(BurgerComponent burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }


    public double cost() {
         double costForSide = 0.0;
        if(!checkEntryInOptions("No Side"))
        costForSide = (options.length<=0)?0.00:(options.length)*3.00;

        return costForSide + burger.cost();
    }
}
