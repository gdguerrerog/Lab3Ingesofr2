
public class DecoratorCoffe

{

    public static void main(String[] args)

    {

	Beverage beverage = new HouseBlend();

	System.out.println("Simple: "+ beverage.getDescription() );



	Beverage beverage2 = new HouseBlend();

	beverage2 = new Mocha(beverage2);

	beverage2 = new Mocha(beverage2);

	

	System.out.println("Elementary: "+beverage2.getDescription() );



	Beverage beverage3 = new HouseBlend();

	

	beverage3 = new Mocha(beverage3);

	

	System.out.println("Sophisticated: "+beverage3.getDescription());

    Beverage beverage4 = new HouseBlend();

	

	beverage4 = new Mocha(beverage4);

	

	System.out.println("Basic: "+beverage4.getDescription());


    Beverage beverage5 = new HouseBlend();

	

	beverage4 = new Mocha(beverage5);

	

	System.out.println("Advanced: "+beverage5.getDescription());

    }

}