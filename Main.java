import java.util.Scanner;
class Main{

       public static double totalEmi(Loan obj,int n){
            if (obj instanceof Taxable T)
		   return  T.getTax();
            return 0;
       }



       public static double DiscountEmi(Loan obj,int n){
            if (obj instanceof Discountable d)
		   return d.getDiscount();
	    return 0;
       }
 
	public static void main(String [] args){
	        
        Scanner in =new Scanner(System.in);

	System.out.println("Enter Principle Amount And Period For Loan limit ");
	double p=in.nextDouble();
	int n=in.nextInt();
	double lim=in.nextDouble();
        Loan pl=new PersonalLoan(p,n);
	Loan hl=new HomeLoan(p,n,lim);

	System.out.println("EMI for Personal Loan = " + pl.getEmi());
	System.out.println("EMI for Home Loan = " + hl.getEmi());

	}


}
