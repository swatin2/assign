
class CurvedBanner extends Banner{

        private float radius;

	CurvedBanner(){}

	public CurvedBanner(double h,double w,float r){
	        super(h,w);
		radius=r;
	}
	public double getArea(){
	  return 3.142 * super.getArea() * radius * radius / 2;
	}
}
