package composite;

import java.text.DecimalFormat;


public class Leaf implements BurgerComponent {

    private String description ;
    private Double price ;
    private BurgerComponent burger;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf(String message,BurgerComponent burger)
    {
        description = message;
        price = burger.cost();
        this.burger = burger;
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description + " " + fmt.format(price) ) ;
        if(burger!=null)burger.printDescription();
    }

    public void addChild(BurgerComponent c) {
	    // no implementation
	}

	public void removeChild(BurgerComponent c) {
        // no implementation
	}

	public BurgerComponent getChild(int i) {
        // no implementation
        return null ;
	}
	
	public double cost()
	{
	    return price;
	   }
}
 
