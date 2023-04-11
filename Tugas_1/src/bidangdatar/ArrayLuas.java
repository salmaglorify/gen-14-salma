package bidangdatar;

import bidangdatar.Segitiga;
import bidangdatar.Persegi;
import bidangdatar.Lingkaran;
import bidangdatar.BelahKetupat;

public class ArrayLuas {

	public static void main(String[] args) {
		String[] bidangDatar = new String[4];
		double[] keliling = new double [4];
		double[] luas = new double [4];
		
		bidangDatar[0] = "Segitiga";
		double  sisi1 = 3,
				sisi2 = 4,
				sisi3 = 5,
				alas = 6,
				tinggi = 7,
				kelilingsegitiga, luassegitiga;
		keliling[0] = kelilingsegitiga = sisi1+sisi2+sisi3; ;
		luas[0] = luassegitiga = alas*tinggi/2;;
		
		bidangDatar[1] = "Persegi";
		double  sisi = 19,
				kelilingpersegi, luaspersegi;
		keliling[1] = kelilingpersegi = 4*sisi;
		luas[1] = luaspersegi = sisi*sisi;
		
		bidangDatar[2] = "Lingkaran";
		double  r = 7,
				phi = 3.14,
				kelilinglingkaran, luaslingkaran;
		keliling[2] = kelilinglingkaran = 2*phi*r;;
		luas[2] = luaslingkaran = phi*r*r;
		
		bidangDatar[3] = "Belah Ketupat";
		double  sisi4=7,
				diagonal1 = 5,
				diagonal2 = 6,
				kelilingbelahketupat, luasbelahketupat;
		keliling[3] = kelilingbelahketupat = 4*sisi;
		luas[3] = luasbelahketupat = diagonal1*diagonal2;
				
		for (int i=0; i<bidangDatar.length; i++) {
			System.out.println("Nama:"+bidangDatar[i]+" -> keliling:"+keliling[i]+" -> luas:"+luas[i]);
				}
			
		}

	}


