package areaOfrectangle;
import java.util.*;

public class area2 {
	
	float length, breadth, area;



	  void set_values(float length, float breadth)

	  {  

	     this.length = length;

	     this.breadth = breadth;

	     

	     area = this.length * this.breadth;

	  }

	 

	 float get_area2()

	 {

	     return area; 

	 }

	 

	public static void main(String[] args, int area2, String sum){

	    
           Scanner sc = new Scanner(System.in);
	        area2 ar = new area2();

	        float l,b;

	        System.out.println("Enter the length of rectangle : ");

	        l=sc.nextFloat();

	        System.out.println("Enter breadth of rectangle : ");

	        b=sc.nextFloat();

	        ar.set_values(l, b);

	        System.out.println("Area of rectangle is = " +ar.get_area2() + sum);
	        
	        System.out.println("Would you like to continue? (yes or no)");
	        
	        String s = sc.nextLine();
	        boolean stop = false;    
	        while(!stop) {
	          
	        }
	            
	            Scanner scan;
				String s1 = scan.nextLine();
	            if(s1.equals("no")) {
	                stop = true;
	        
	        
	            }
	        }
	
	
	
        
	
		        

	
	
	
	
	
	



	
	
	
	
	        
	       
	              		     
	        
	        
	       
	       
	       
	       
	       
	       
	      

	


