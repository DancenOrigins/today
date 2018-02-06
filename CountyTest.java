package suspects;

import java.util.Scanner;

public class CountyTest {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("name?");
		
		String CountyName = scanner.nextLine();
		
		System.out.print("last name?");

		String CountyPopulation = scanner.nextLine();
		
		System.out.print("middle initial?");

		String YearEstab = scanner.nextLine();
		
		System.out.print("CountyLV (if you even have one)?");

		String CountyLV = scanner.nextLine();
		
		County county1=new County(CountyName,CountyPopulation,YearEstab,CountyLV, 0);
		System.out.print(county1.CountyName + " " + county1.YearEstab + " " + county1.CountyPopulation + " " + county1.CountyLV + " ");
		County county2=new County("Zark","Muckerberg","E","AI", 0);
		System.out.print(county2.CountyName + county2.CountyPopulation);
		county2.CountyName = "Mark";
		county2.CountyPopulation = "Zuckerberg";
		System.out.print(county2.CountyName + " " + county2.CountyPopulation);
		
		scanner.close();
	}

}
