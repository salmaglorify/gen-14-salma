/**
 * 
 */
package tugas_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 * @author SALMA
 *
 */
public class WriteToFile {

	private static final String OutputText = null;

	public static void main(String[] args) throws IOException {
		String[] nama = new String[4];
		int[] harga = new int [4];
		int[] persediaan = new int [4];

		Barang b1 = new Barang("Oreo", 5000, 10);
		Barang b2 = new Barang("Ultra", 6000, 11);
		Barang b3 = new Barang("Silverqueen", 15000, 20);
		Barang b4 = new Barang("Pocky", 8000, 30);

		Barang[] daftarBarang = new Barang[4];
		daftarBarang[0] = b1;
		daftarBarang[1] = b2;
		daftarBarang[2] = b3;
		daftarBarang[3] = b4;

		for (int i=0; i<daftarBarang.length; i++) {
			String outputText = "Barang = "+daftarBarang[i].getNama()+", Harga = "+daftarBarang[i].getHarga()+", Persediaan = "+daftarBarang[i].getPersediaan();

			saveTofile("Barang.txt", outputText, true);
		}

	}

	private static void saveTofile(String fileName, String text, boolean b) throws IOException {
		File file1 = new File(fileName);
		FileWriter fw = new FileWriter(file1, b);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(text);
		pw.close();
	}

}
