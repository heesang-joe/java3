package day8_array;
import java.util.Scanner;


public class Arrayindex {

	public static void main(String[] args) {
		int nums[] = new int[5];
		Scanner scan = new Scanner(System.in);
		int i =0;
		while(i<nums.length) {
		
		System.out.print("nums["+i+"]=");
		nums[i] =scan.nextInt();
		i++;
		}
		System.out.println("--------------------------");
		
		for( i =0; i<nums.length;i++) {
			if(i%2==0)
				continue;
			else
			System.out.println("nums["+i+"]="+nums[i]	 );
			
		}

	}

}
