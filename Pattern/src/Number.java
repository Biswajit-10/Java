class Number
{
  static void larger()
{
  int a=10,b=20;
  int c=a>b?a:b;  //what happens if a=b.....a>b?(a!=b?a:
  System.out.println("larger number is:"+c);
}
 static void largest()
{
  int a=10,b=20,c=30;   //what happens if a=b>c or a=c>b
  int d=a>b&&a>c?a:(b>c&&b>a?b:c);
  System.out.println("largest number is:"+d);
}
 static void smaller()
{
  int a=5,b=10;
  int c=a<b?a:b;
  System.out.println("smaller number is:"+c);
}
static void smallest()
{
  int a=10,b=20,c=30;   
  int d=a<b&&a<c?a:(b<c&&b<a?b:c);
  System.out.println("largest number is:"+d);
}
static void digit()
{
  int a='8';
  String b=a>=48&&a<=57?"digit":"not a digit";
  System.out.println(b);
}
public static void main(String[] args)
{
  larger();
  largest();
  smaller();
  smallest();  
}
}
