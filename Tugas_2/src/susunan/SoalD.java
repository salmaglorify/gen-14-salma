/**
 * 
 */
package susunan;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class SoalD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nilai n : ");
		int n = input.nextInt();
		input.close();
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if (i == j) {
					System.out.print((i*2)-1);
				} else if (i+j == n+1){
					System.out.print((j*2)-1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
