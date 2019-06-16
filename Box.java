class  Box
{
	//state / properties =non static data members.
	private double width,depth,height;
	//parameterized constr
	Box(double w ,double d, double height)
	{
		width=w;
		depth=d;
		//un hides inst var from method local var.
		this.height=height;
	}//display dims
	void displayBoxDetails()
	{
		System.out.println("Box dims "+width+" "+depth+" "+height);
	}
	//ret computed vol to the caller
	double calcVolume()
	{
		 return width*depth*height;
	}


}



