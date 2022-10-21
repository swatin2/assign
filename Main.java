
class Main{
        public static double cast(Sequence seq,int n){
	if(seq instanceof Resetable r){
	      r.reset();
	      return seq.sum(n)/n;
	}
	else {
		return seq.sum(n)/n;
        }
	}	

	public static void main(String []args){
	      var l =new LinearSequence(2,5);
	      var p =new PowerSequence(2,5);
//              System.out.println(ls.sum(5));
//              System.out.println(ps.sum(5));

              Sequence ps=FactoryP.linear();
              Sequence ls=FactoryP.Power();  
//	      ps.setCurrent(10);
//	      ps.setStep(2);
////	      ls.setCurrent(10);
	   //   ls.setFactor(3);
              System.out.println(cast(ps,5));
              System.out.println(cast(ls,8));
             


	}
}
