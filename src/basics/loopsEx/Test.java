package basics.loopsEx;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.println("You can stick wallpaper, enter the number of stripes: ");
	        int stripes = sc.nextInt();

	        System.out.println("And enter the height of the wallpaper");
	        int heighWallpaper = sc.nextInt();

	        for (int j = 1; j <= heighWallpaper; j++) {
	            for (int i = 1; i <= stripes; i++) {
	                if (i % 2 != 0) System.out.print("***");
	                if (i % 2 == 0) System.out.print("+++");
	            }
	            System.out.println("");
	        }
	}

}
