package Eight;

import java.util.Scanner;

public class empWageComputation
{
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int PER_HOUR=20;
	public static final int WORK_DAY=2;
	public static final int MAX_HRS_MONTH=10;

	int emphrs=0;
	int totalemphrs=0;
	int totalworkingdays=0;	
	int empCheck=0;
	int totalempwage=0;

	

	void calculate()
	{
		while(totalemphrs<=MAX_HRS_MONTH && totalworkingdays<WORK_DAY)
		{
			totalworkingdays ++;
			int empCheck= (int) Math.floor(Math.random()*10%3);
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
			totalemphrs +=emphrs;	
			System.out.println("No. of Working Days :"+totalworkingdays + "\nEmployee Working Hrs :"+ emphrs);
		}	
		int totalempwage= totalemphrs * PER_HOUR;
		System.out.println("Total Employee wage :"+totalempwage);
	}
	
	public static void main(String args[]) 
	{   
        empWageComputation obj = new empWageComputation();
        obj.calculate();
	}
}