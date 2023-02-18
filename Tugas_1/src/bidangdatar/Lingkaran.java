package bidangdatar;

public class Lingkaran {
	public static void main(String[] args) {
		
		}

	private String lingkaran;
	private double kelilinglingkaran;
	private double luaslingkaran;
	
			public Lingkaran(String lingkaran, double kelilinglingkaran, double luaslingkaran) {
				this.lingkaran = lingkaran;
				this.kelilinglingkaran = kelilinglingkaran;
				this.luaslingkaran = luaslingkaran;
			}
			
			public String getLingkaran() {
				return this.lingkaran;
			}
			public void setLingkaran(String lingkaran) {
				this.lingkaran = lingkaran;
			}
				
			public double getKelilingLingkaran() {
				return kelilinglingkaran;
			}
			public void setKelilingLingkaran(double kelilinglingkaran) {
				this.kelilinglingkaran = kelilinglingkaran;
			}
			
			public double getLuasLingkaran() {
				return this.luaslingkaran;
			}
			public void setLuasLingkaran(double luaslingkaran) {
				this.luaslingkaran = luaslingkaran;
			}
			
			public String toString() {
				return "nama:"+this.lingkaran+
						", keliling:"+this.kelilinglingkaran+
						", luas:"+this.luaslingkaran
						;
		}
	}