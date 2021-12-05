class Pen{
	void m()
	{
		System.out.println("this is pen class");
	}
}
class SketchPen extends Pen{
	void m()
	{
		System.out.println("this is sketch pen class");
	}
}
class MarkerPen extends Pen{
	void m()
	{
		System.out.println("this is marker pen class");
	}
}
class SuperTest{
public static void main(String[] args) {
SketchPen sp1 = new SketchPen();
SketchPen sp2=sp1;
Pen p=sp1;//Up-Casting
Object o=sp1;//Up-Casting
Pen p1= new MarkerPen();
Pen p2=p;
Object o1=p;//Up-Casting  //NOW o1 HAS ADDRESS OF pen//no it doesn't we have not created object of Object class
//p=new MarkerPen();
//MarkerPen mp=(MarkerPen)p;//Error
//MarkerPen mp1=(MarkerPen)p;//Down-Casting
SketchPen sp3=(SketchPen)p;//gives ClassCastException
System.out.println("hello milu");
//sp3.m();
//mp.m();
//mp1.m();
}
}