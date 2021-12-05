/*class Book1
{
	String title;
	Book1(String title)
	{
		this.title=title;
	}
}*/
class Book1
{
	String title;
	Book1(String title)
	{
		this.title=title;
	}
	public boolean equals(Object o)
	{
		Book1 b=(Book1)o;
		System.out.println(o);
		System.out.println(b);
		System.out.println(this);
     	if(this.title==b.title)
			return true;
		else
			return false;
	}
		void m()
	{
		System.out.println(this);
	}
}
class BookDriver
{
	public static void main(String[] args)
	{
		Book1 b=new Book1("JAVA");
		Book1 b1=b;
		System.out.println(b1);
		System.out.println(b);
		System.out.println(b1==b);
		System.out.println(b1.equals(b1));
	}
}
class BookDriver1
{

	public static void main(String[] args)
	{
		Book1 b1=new Book1("java");
		Book1 b2=new Book1("java");
		Book1 b3=new Book1("sql");
		b1.m();
		b2.m();
		b3.m();
		System.out.println("===============");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("================");
	//	System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println("================");
		System.out.println(b1.title.equals(b2.title));//comparing directly
		System.out.println(b2.title.equals(b3.title));
		
	}
}