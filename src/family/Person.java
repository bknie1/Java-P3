//  P2BirthdayKnieriem.java
//  @Author: Brandon Knieriem
//	@Version: 1.0

package family;

import java.util.*;
//--------------------------------------------------------------------------
public class Person {
	
	private int 	piAge;
	private String 	psName;
//--------------------------------------------------------------------------	
	Person(String n, int a) {
		psName = n;
		piAge = a;
	}
	
	private static int calculate(Person[] personArray) {
		int iAverage;
		int	iTotal = 0;
		int	iSize = 0;
		for(Person i : personArray) {
			iTotal += i.piAge;
			iSize++;
		}
		iAverage = iTotal / iSize;
		return iAverage;
	}

//--------------------------------------------------------------------------	
	public static void main(String[] args) {
		int 	iSize;
		int 	iAge;
		int		iAveAge;
		String	sName;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\tP3: Family\n\t   Brandon Knieriem");
		System.out.print("Size of family (1 - 100): ");
		iSize = sc.nextInt();
		if (iSize == 0) {
			System.out.println("Error: Invalid input.");
			sc.close();
			return;
		}
		
		Person[] personArray = new Person[iSize];
		/* Family Entry Loop */
		for(int k = 0; k < iSize; k++) {
			System.out.print("Family Member " + (k+1) + " Name: ");
			sName = sc.next();
			System.out.print("Family Member " + (k+1) + " Age: ");			
			iAge = sc.nextInt();
			
			personArray[k] = new Person(sName, iAge);
		}
		
		/*Average */
		iAveAge = calculate(personArray);
		
		/* Print List/Average */
		System.out.println("\nYour family members: \n");
		for (Person i : personArray) {
			System.out.print(i.psName + " - ");
			System.out.println(i.piAge);
		}
		System.out.println("\nAverage Age: " + iAveAge);
		
		sc.close();
	}
}

/*

		P3: Family
	   Brandon Knieriem
Size of family (1 - 100): 0
Error: Invalid input.

		P3: Family
	   Brandon Knieriem
Size of family (1 - 100): 1
Family Member 1 Name: Brandon
Family Member 1 Age: 26

Your family members: 

Brandon - 26

Average Age: 26

		P3: Family
	   Brandon Knieriem
Size of family (1 - 100): 2
Family Member 1 Name: Brandon
Family Member 1 Age: 26
Family Member 2 Name: Jee
Family Member 2 Age: 22

Your family members: 

Brandon - 26
Jee - 22

Average Age: 24

*/