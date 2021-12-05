class Bike
{
	String color;
	Engiene e=new Engiene();
}
	class Engiene
{
	
}
class BikeRunner
{
	public static void main(String[] args)
	{
		Bike b=new Bike();
		System.out.println(b);
		System.out.println(b.e);
	}
}