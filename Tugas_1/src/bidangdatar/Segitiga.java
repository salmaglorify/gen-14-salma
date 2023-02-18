package bidangdatar;

public class Segitiga {
	public static void main(String[] args) {
			
	}
	private String segitiga;
	private static double kelilingsegitiga;
	private static double luassegitiga;
	
			public Segitiga(String segitiga, double kelilingsegitiga, double luassegitiga) {
				this.segitiga = segitiga;
				this.kelilingsegitiga = kelilingsegitiga;
				this.luassegitiga = luassegitiga;
			}
			
			public String getSegitiga() {
				return this.segitiga;
			}
			public void setSegitiga(String segitiga) {
				this.segitiga = segitiga;
			}
				
			public double getKelilingSegitiga() {
				return kelilingsegitiga;
			}
			public void setKelilingSegitiga(double kelilingsegitiga) {
				this.kelilingsegitiga = kelilingsegitiga;
			}
			
			public double getLuasSegitiga() {
				return this.luassegitiga;
			}
			public void setLuasSegitiga(double luassegitiga) {
				this.luassegitiga = luassegitiga;
			}
			
			public String toString() {
				return "nama:"+this.segitiga+
						", keliling:"+this.kelilingsegitiga+
						", luas:"+this.luassegitiga
						;
		}
	}