package day8_array;

public class arraystring {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
	
		String[] games = {"starcraft","리니지","ongames"};
		System.out.print("게임이름:");
		for(int i =0; i<games.length; i++) {
			System.out.print(games[i]+" ");
		}
		System.out.println(" ");
		System.out.println("등   수:");
		for(int i =0; i<arr.length; i++) {
			System.out.print("    "+arr[i]+  "  ");
	}

	}
}
