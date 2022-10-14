package areaOfrectangle;

import java.util.*;



public class area {

	float length, breadth, area;



	  void set_values(float length, float breadth)

	  {  

	     this.length = length;

	     this.breadth = breadth;

	     

	     area = this.length * this.breadth;

	  }

	 

	 float get_area()

	 {

	     return area; 

	 }



	public static void main(String[] args)

	    {

	        area ar = new area();

	        float l,b;

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the length of rectangle : ");

	        l=sc.nextFloat();

	        System.out.println("Enter breadth of rectangle : ");

	        b=sc.nextFloat();

	        ar.set_values(l, b);

	        System.out.println("Area of rectangle is = " +ar.get_area());

	}
	
}
	


