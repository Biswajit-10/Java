class H{
/*static void print(){
System.out.println("*");
System.out.println("* *");
System.out.println("* * *");
System.out.println("* * * *");
}*/
static void print(){
	for(int i=3;i>=0;i--){
		for(int j=0;j<4;j++){
			if(i<=j)
		System.out.print("*");}
	System.out.println("\n");}
		
}
public static void main(String []args){
print();}
}
