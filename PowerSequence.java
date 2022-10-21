
public class PowerSequence implements Sequence,Resetable{
          private int current;
	  private int factor;

	  PowerSequence(){}
   
          public PowerSequence(int c,int f){
	        current = c;
		factor = f;
	  }

          public void setCurrent(int c){
	        current = c;
	  }

          public void setFactor(int f){
		factor = f;
	  }

	   public double next(){
                 double term =current;
                 current *=factor;
                 return term;		 
	  }
	  public void reset(){
	 
              current = 1;	 
	  }

}
