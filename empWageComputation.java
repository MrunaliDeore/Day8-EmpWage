package Eight;

public class empWageComputation
{
	public static  final int PART_TIME=1;
	public static  final int FULL_TIME=2;
	public static  final int WAGE_PER_HOUR=20;

	public static void main (String[] args)
	{		
		int emphrs=0,empwage=0;
		int empCheck=(int) Math.floor(Math.random()*10%3);

		switch(empCheck)
		{
		case PART_TIME:
			emphrs=4;
			break;

		case FULL_TIME:
			emphrs=8;
			break;

		default:
			emphrs=0;

		}
		empwage=emphrs*WAGE_PER_HOUR;

		System.out.println("Employee Wage :"+empwage);
	}
}
