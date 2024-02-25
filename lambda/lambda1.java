package lambda;

public class lambda1 {
	
	public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){
            public void draw(){System.out.println("Drawing "+width+" shapes");}  
        };  
        d.draw();
        
        Drawable drawable=()->System.out.println("Drawable");
        drawable.draw();
    }  
}
@FunctionalInterface
interface Drawable{  
    public void draw();  
}  