/* Hacker rank problem to calculate the number of valley hiker walks. 
 * Given : 
 * 			Number of steps walked ex: 8
 * 			Path(ex: UDDDUDUU)
 * Output : 2
 * _/\      _
   	  \    /
       \/\/
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 * */

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number steps walked, should be an integer :");
		int stepsWalked = scanner.nextInt();
		System.out.print("\nEnter a the Path traversed like ex:UDDDUDUU :");
		String pathWalked = scanner.next();
		
		System.out.printf("\nThe hiker walked %d valleys", calculateValleys(stepsWalked, pathWalked));
	}

	private static int calculateValleys(int stepsWalked, String pathWalked) {
		int steep =0;
		int numOfValley =0;
		for (int i=0;i<stepsWalked; i++)
		{
			if (pathWalked.charAt(i) == 'U') 
				steep++;
			
			else if(pathWalked.charAt(i) == 'D' ) {
				if(steep==0) 
					numOfValley++;
				steep--;
			}
			System.out.printf("\nsteep in the loop: %d, number of valley: %d", +steep,+numOfValley );
		}
		return numOfValley;
	}
}
