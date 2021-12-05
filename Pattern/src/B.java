class A
{
	int a,b,c;
	A(){}//if i don't write this statement i am getting error
	A(int a)
	{
		System.out.println("this is parent class constructor");
		this.a=a;
	}
}
class Constructor extends A
{
	int d,e,f;
	Constructor(int d)
	{
		System.out.println("this is child class constructor");
		this.d=d;
	}
	public static void main(String[] args)
	{
		Constructor b=new Constructor(12);
		
	}	
}