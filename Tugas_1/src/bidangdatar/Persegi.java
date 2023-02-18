package bidangdatar;

public class Persegi {
	public static void main(String[] args) {
			
	}
	
	private String persegi;
	private double kelilingpersegi;
	private double luaspersegi;
	
			public Persegi(String persegi, double kelilingpersegi, double luaspersegi) {
				this.persegi = persegi;
				this.kelilingpersegi = kelilingpersegi;
				this.luaspersegi = luaspersegi;
			}
			
			public String getPersegi() {
				return this.persegi;
			}
			public void setPersegi(String persegi) {
				this.persegi = persegi;
			}
				
			public double getKelilingPersegi() {
				return kelilingpersegi;
			}
			public void setKelilingPersegi(double kelilingpersegi) {
				this.kelilingpersegi = kelilingpersegi;
			}
			
			public double getLuasPersegi() {
				return this.luaspersegi;
			}
			public void setLuasPersegi(double luaspersegi) {
				this.luaspersegi = luaspersegi;
			}
			
			public String toString() {
				return "nama:"+this.persegi+
						", keliling:"+this.kelilingpersegi+
						", luas:"+this.luaspersegi
						;
		}
	}