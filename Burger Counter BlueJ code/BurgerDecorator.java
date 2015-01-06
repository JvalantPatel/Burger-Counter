package composite;
import java.util.Arrays;

/**
 * Abstract class BurgerDecorator - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BurgerDecorator implements BurgerComponent
{
  String[] options = new String[]{""}; 
  BurgerComponent burger;
  public void setOptions(String[] options)
  {
      this.options = options;
    }
    
   private String getFormattedDescription(String[] arrayString)
   {
       String returnString="";
       for(int index=0;index<options.length;index++)
       {
           if(index==0)
           returnString+=options[index];
           else
           returnString+=" + "+options[index];
        }
           return returnString;
}

    public void printDescription() {

         burger.printDescription(); 
         System.out.println(getFormattedDescription(this.options));
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
	
	protected boolean checkEntryInOptions(String option)
	{
	    return Arrays.asList(options).contains(option);
	 }
}
