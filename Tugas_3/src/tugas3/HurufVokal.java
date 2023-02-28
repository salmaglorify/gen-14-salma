/**
 * 
 */
package tugas3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Salma
 *
 */
public class HurufVokal {
	public static void main(String[] args) {
		String kalimat = "aku belajar pemrograman"; //input kalimat
		
		int countA=0, countI=0, countU=0, countE=0, countO=0;
		
		for (int i=0; i<kalimat.length(); i++) {
			if (kalimat.charAt(i)=='a' || kalimat.charAt(i)=='A') {
				countA++;
			} else if (kalimat.charAt(i)=='i' || kalimat.charAt(i)=='I') {
				countI++;
			} else if (kalimat.charAt(i)=='u' || kalimat.charAt(i)=='U') {
				countU++;
			} else if (kalimat.charAt(i)=='e' || kalimat.charAt(i)=='E') {
				countE++;
			} else if (kalimat.charAt(i)=='o' || kalimat.charAt(i)=='O') {
				countO++;
			}
		}
		System.out.println("a = "+countA);
		System.out.println("i = "+countI);
		System.out.println("u = "+countU);
		System.out.println("e = "+countE);
		System.out.println("o = "+countO);
	}
}
