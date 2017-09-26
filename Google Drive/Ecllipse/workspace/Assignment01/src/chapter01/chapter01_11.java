package chapter01;

public class chapter01_11 {

	public static void main(String[] args) {
		
		double currentPopulation = 312032486;
		double yearInSec = 365 * 24 * 60 * 60;
		double birth = yearInSec / 7;
		double death = yearInSec / 13;
		double immigrant = yearInSec / 45;
		double populationChange = birth - death + immigrant;

		
		System.out.println("The population in the first year is "
						  + (int)(currentPopulation + populationChange) );
		System.out.println("The population in the second year is "
				 		  + (int)(currentPopulation + populationChange * 2) );
		System.out.println("The population in the third year is "
					      + (int)(currentPopulation + populationChange * 3) );
		System.out.println("The population in the fourth year is "
						  + (int)(currentPopulation + populationChange * 4) );
		System.out.println("The population in the fifth year is "
						  + (int)(currentPopulation + populationChange * 5) );

		
	}
}
