package composite;

public interface BurgerComponent{

     void printDescription() ;
     void addChild(BurgerComponent c);
     void removeChild(BurgerComponent c);
     BurgerComponent getChild(int i);
     public double cost();

}
 
