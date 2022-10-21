public class PersonalLoan extends Loan implements Taxable{

	   PersonalLoan(){}

           PersonalLoan(double amt,int n){
		   principle=amt;
		   period=n;
           }

	   public double getRate(){
		  if (principle <= 2000000)
			  return 0.10;
		  else 
			  return 0.11;
	
	   }
	   public double getTax(){
	        return 0;
	   }
}

