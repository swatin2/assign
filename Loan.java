abstract class Loan{
	
            protected double principle;
            protected int period;

            abstract double getRate();

            protected double getEmi(){
	              
		  double Emi = principle * (1 + ((getRate() * period) /100))/(12*period);
	   	  return Emi;		  
            }

}
