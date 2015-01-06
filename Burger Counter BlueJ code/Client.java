package composite;

public class Client {

    public static void runTest()
    {
        BurgerComponent theOrder = BuildOrder.getOrder() ;
        theOrder.printDescription();

    }
}
 
