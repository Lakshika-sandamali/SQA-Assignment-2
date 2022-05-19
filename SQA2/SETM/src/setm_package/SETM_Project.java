package setm_package;

public class SETM_Project {

	public SETM_Project() {
		
		System.out.println("A new Doctor has been created successfully!");
	}
	
	public void Check_Patients() {
		
		System.out.println("Doctor is checking patients....");
	}
	
	public void Identify_Diseases() {
		
		System.out.println("Doctor is identifying diseases....");
	}
	
	/**
	 * @param args the command line arguments
	 */
	
	public static void main(String[] args) {
		// TODO code application logic here
		
		SETM_Project sp1 = new SETM_Project();
		
		allergists_doctor d1 = new allergists_doctor();
		System.out.println();
		
		sp1.Check_Patients();
		sp1.Identify_Diseases();
		d1.Check_Patients();
		d1.Identify_Diseases();

		add(1,2);
		add(1,2,3);
		
		int outer = 1;
		
		while(outer < 3)
		{
			int inner = 5;
			while(inner < 8)
			{
				System.out.println(outer + "" + inner);
				inner++;
			}
			outer++;
		}
	}
	
	public static class allergists_doctor extends SETM_Project{
		
		public allergists_doctor() {
			
			super();
			System.out.println("A new Allergists doctor has been created!");
			
		}
		
		@Override
		public void Check_Patients() {
			
			System.out.println("An Allergists doctor is checking patients....");
		}
		
		public void Identify_Diseases() {
			
			System.out.println("An Allergists doctor is identifying diseases....");
			System.out.println("");

		}
		
	}
	
	static int add(int a, int b) {
		
		int c;
		c = a + b;
		
		System.out.println("Sum of the numbers are = "+c);
		return c;
	}
	 
	//Changing number of args
	
	static int add(int a, int b, int c) {
		
		int d = a + b + c;
		
		System.out.println("Sum of the numbers are = "+d);
		return d;
	}
}
