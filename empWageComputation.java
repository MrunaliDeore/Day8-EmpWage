package Eight;

public class empWageComputation
{
	public static  final int FULL_TIME=1;
	public static final int WAGE_PER_HOUR=20;

	public static void main (String[] args)
	{		
		int emphrs=0,empwage=0;
		int empCheck=(int) Math.floor(Math.random()*10%2);

		if(empCheck==FULL_TIME)
			emphrs=8;
		else
			emphrs=0;
		empwage=emphrs*WAGE_PER_HOUR;

		System.out.println("Employee Wage :"+empwage);
	}
}
