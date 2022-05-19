package setm_package2;

public class SETM_Project2 
{

	float getRateOfInterest() {
		
		return 0; //non parameterized function
	}
	
	public static void main(String[] args) //Main Method
	{
		for(int i = 1; i <= 5; ++i) // Inner For Loop
		{
			System.out.println("Outer loop iteration "+ i); // Output Statement
			
			for(int j = 1; j <= 2; ++j) // Inner For Loop
			{
				System.out.println("i =  "+ i + "; j = " + j);
			}
		}
		
		int n = 10; //Variable Declaration
		
		int k = 3;
		
		System.out.println("");
		
		System.out.println("Minumum Value = " + minFunction(n,k));
		// Function calling inside SOP statement
		
		System.out.println("");

		SETM_Project2 b = new SIB();
		System.out.println("SIB Rate of Interest : " +b.getRateOfInterest());
		
		b = new ICICI();
		System.out.println("ICICI Rate of Interest : " +b.getRateOfInterest());
		
		b = new AXIS();
		System.out.println("AXIS Rate of Interest : " +b.getRateOfInterest());

	}
	/** Return the Minimum of Two Numbers */
	
	public static int minFunction(int n1, int n2) // Parameterize Function
	{
		int min;
		
		if(n1 > n2) //Condition Checking
			min = n2;
		
		else        //Else Part
			min = n1;
		
		return min; // Returning a Value
		
	}

	private static class SIB extends SETM_Project2{
		
		@Override // Same function is calling again
		float getRateOfInterest()
		{
			return 8.4f;
		}
		
	}
	
	private static class ICICI extends SETM_Project2{
		
		@Override // Same function is calling again
		float getRateOfInterest()
		{
			return 7.3f;
		}
		
	}

	private static class AXIS extends SETM_Project2{
	
	@Override // Same function is calling again
	float getRateOfInterest()
	{
		return 9.7f;
	}
	
}
}

