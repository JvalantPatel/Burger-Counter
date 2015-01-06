package composite;


/**
 * Write a description of class Beef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteBurger extends Composite
{
    public static final String SMALL = "1/3lb.";  
    public static final String MEDIUM = "2/3lb";
    public static final String LARGE = "1lb.";

    public static final String BUN = "On A Bun";
    public static final String BOWL = "In a Bowl";
    
    public static final String BEEF = "Hormone & Antibiotic Free Beef";
    public static final String CHICKEN = "100% Natural Chicken Breast";
    public static final String TURKEY = "100% Natural Ground Turkey";
    public static final String VEGGIE = "Housemade Vegan Veggie";
    public static final String ORGANIC_BISON = "Organic Bison";
    public static final String AHI_TUNA = "Ahi Tuna";
    
    String description ="No Description";
    String size = "";
    String type ="";
    
    public ConcreteBurger(String description,String size,String type) {
                super(description);
        this.description = description;
        this.size = size;
        this.type=type;

    }

    public double cost() {
        double extraForType = (this.description.equals(this.ORGANIC_BISON)||this.description.equals(this.AHI_TUNA))?4.00:0.00;
        double extraForBowl = (this.type.equals(this.BOWL))?1.00:0.00;
        if(size.equals(this.SMALL))
        return 9.00+extraForBowl+extraForType;
        else if(size.equals(this.MEDIUM))
        return 12.00+extraForBowl+extraForType;
        else
        return 18.00+extraForBowl+extraForType;
    }
    
    public String getDescription() {
       return description+" + "+getSize()+" + "+getType();
    }
    
     public String getSize() {
       return size;
    }
    
    public String getType() {
       return type;
    }
    
    public void printDescription() {

         System.out.println(getDescription());
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
}
