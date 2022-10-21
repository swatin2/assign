
public class LinearSequence implements Sequence{
          private int current;
	  private int step;

	  LinearSequence(){}

	  public LinearSequence(int c,int s){
	        current = c;
		step = s;
	  }
	  
	  public void setCurrent(int c){
	        current = c;
	  }

	  public void setStep(int s){
		step = s;
	  }

	  public double next(){
                 double term =current;
                 current +=step;
                 return term;		 
	  }

}
