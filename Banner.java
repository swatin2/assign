public class Banner {

	protected double height;
	protected double width;
        Shape geomentry=Shape.rectangle;

	public Banner (){}

	public Banner (double h,double w){
		height=h;
		width=w;
	}

	public double getArea(){
	switch (geomentry){
		case rectangle:
			return height * width;
		default :
			return 0;
	}

	}
}
