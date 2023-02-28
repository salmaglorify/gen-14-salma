/**
 * 
 */
package tugas3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Salma
 *
 */
public class BeliBarang {

	public static void main(String[] args) {
		
		String[] namaBarang = new String[4];
		int[] hargaBarang = new int [4];
		
		namaBarang[0] = "Oreo";
		hargaBarang[0] = 6000;
		
		namaBarang[1] = "Tanggo";
		hargaBarang[1] = 5000;
		
		namaBarang[2] = "Buavita";
		hargaBarang[2] = 7000;
		
		namaBarang[3] = "Aqua";
		hargaBarang[3] = 3000;
		
		int n = 4000; //jumlah uang yang dimiliki
		
		if (n >= hargaBarang[2]) {
			System.out.println(namaBarang[2]);
		} else if (n >= hargaBarang[0]) {
			System.out.println(namaBarang[0]);
		} else if (n >= hargaBarang[1]) {
			System.out.println(namaBarang[1]);
		} else
			System.out.println(namaBarang[3]);
	}	
}


