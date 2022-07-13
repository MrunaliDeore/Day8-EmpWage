package Eight;

public class empWageComputation
{
	public static  final int FULL_TIME=1;
	
	public static void main (String[] args)
	{		
		int empCheck=(int) Math.floor(Math.random()*10%2);

		if(empCheck==FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is not present");
	}
}
