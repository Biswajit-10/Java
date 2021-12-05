class numberPattern
{
  public static void main(String args[])
  {
//	   print();
//	   print1();
//	   print2();
//	   print3();
//	   print4();
//	   print5();
//	   print6();
//	   print7();
//	   print8();
}
  static void print()
  {
    for(int i=1;i<=4;i++)
	{
	  for(int j=1;j<=i;j++)
	  System.out.print(j);
  System.out.println();
	}	
  }
  static void print2()
  { int k=1;
    for(int i=1;i<=4;i++)
	{
	  for(int j=1;j<=i;j++,k++)
	  System.out.print(k+" ");
  System.out.println();
	}	
  }
 static void print3()
  {
    for(int i=1;i<=5;i++)
	{
	  for(int j=i;j>=1;j--)
	  System.out.print(j);
  System.out.println();
	}	
  }
  static void print4()
  {
    for(int i=1;i<=5;i++)
	{
	  for(int j=1;j<=i;j++)
	  System.out.print(j);
   for(int k=i-1;k>0;k--)  //1234 pare 321 print karibaku
	  System.out.print(k); 
  System.out.println();
	}	
  }
  static void print5()
  {
    for(int i=1;i<=5;i++)
	{
	  for(int j=5;j>=i;j--)
	  System.out.print(j);
  System.out.println();
	}	
  }
  static void print6()
  {
    for(int i=1;i<=5;i++)
	{ int no=i;
	  for(int j=1;j<=i;j++){
	  System.out.print(no);
	  no=no+5-j;}
  System.out.println();
	}	
  }
  static void print7()
  { int count=0;
    for(int i=1;i<=5;i++)
	{ 
	  for(int j=1;j<=3;j++){
	  count=count+1;
	  System.out.print(count+" ");
	  }
  System.out.println();
	}	
  }
  static void print8()
  { int count=0;
    for(int i=1;i<=5;i++)
	{
		if(i%2!=0)
		{ for(int j=1;j<=3;j++)
	  {
	  count=count+1;
	  System.out.print(count+" ");
		} }
	  else
       { 
   int temp=count+1;
    for(int j=count+3;j>=temp;j--){
		count=count+1;
  System.out.print(j+" ");
	}		
  }
  System.out.println();
}
}
}
















