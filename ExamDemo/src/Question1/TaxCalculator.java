package Question1;

public class TaxCalculator {
	    public static double taxableAmount(double monthlySalary)
	    {
	    	double anincome=monthlySalary*12;
			if(anincome>=1 && anincome<=250000)
			{
				return 0;
			}
			else if(anincome>250000 && anincome<=500000)
			{
				return(anincome*0.1);
			}
			else if(anincome>500000 && anincome<=1000000)
			{
				return(anincome*0.2);
			}
			else if(anincome>1000000)
			{
				return(anincome*0.3);
			}
			return 0;
	    }


}
