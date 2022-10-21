

interface Sequence{
            public double next();
	    default double sum(int count){
            double total=0;
           for (int i=0; i<=count; ++i){
		     
		   
		   total += next();

		 }
		 return total;
	    }
}
