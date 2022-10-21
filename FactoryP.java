class FactoryP{

	public static Sequence linear(){
	var seql=new LinearSequence();
	return seql;
	}

	public static Sequence Power(){
	var seqp=new PowerSequence();
	return seqp;
	
	
	}
}
