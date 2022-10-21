import java.util.Scanner;
class Main{
  
	public static void main(String []args){
	       var in=new Scanner(System.in);
	       double a=in.nextDouble();   
	       double b=in.nextDouble();      
	       float c=in.nextFloat();   
	       
		var obj=new Banner(a,b);
		Banner obj1=new CurvedBanner(a,b,c);
	        System.out.println(obj.getArea());
	        System.out.println(obj1.getArea());
	}
}
