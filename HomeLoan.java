public class HomeLoan extends Loan implements Discountable{
           
	final double limit;

	//   HomeLoan(){}

	   public HomeLoan(double a,int b,double lim){
	        principle = a;
		period = b;
		limit=lim;
	   }

	   
	   public double getRate(){

		  if (principle <= 500000 && limit < 250000 )
			  return 0.15;
	
		  if (principle <= 500000 && limit > 250000 )
			  return 0.15 + 1;

		  if (principle > 500000 && limit < 250000 )
			  return 0.16;

		  if (principle > 500000 && limit > 250000 )
			  return 0.16 + 1;
               return 0;	
       }
       

	 public double getDiscount(){
	    return 0;
	 }
}
