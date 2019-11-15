
public class DecoratorCoffe

{

    public static void main(String[] args)

    {

	Beverage beverage = new Coffee();

	System.out.println("Simple: "+ beverage.getDescription() );



	Beverage beverage2 = new Milk();

    System.out.println("Elementary: "+ beverage.getDescription()+" with " +beverage2.getDescription() );



	Beverage beverage3 = new CookTime();

	System.out.println("Sophisticated: "+ beverage.getDescription()+" with " +beverage2.getDescription()+" and " +beverage3.getDescription());

    
    System.out.println("Elementary: "+ beverage.getDescription()+" without " +beverage2.getDescription()+" and " +beverage3.getDescription() );

	    
    Beverage beverage4 = new Mocha();
    Beverage beverage5 = new FigCover();
	    
    System.out.println("Advanced: "+ beverage.getDescription()+" with " +beverage2.getDescription()+ ", " +beverage4.getDescription()+" and " +beverage5.getDescription());


    }

}
