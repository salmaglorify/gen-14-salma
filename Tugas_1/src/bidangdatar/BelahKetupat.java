package bidangdatar;

public class BelahKetupat {
	public static void main(String[] args) {
			
	}
	
	private String belahketupat;
	private double kelilingbelahketupat;
	private double luasbelahketupat;
	
			public BelahKetupat(String belahketupat, double kelilingbelahketupat, double luasbelahketupat) {
				this.belahketupat = belahketupat;
				this.kelilingbelahketupat = kelilingbelahketupat;
				this.luasbelahketupat = luasbelahketupat;
			}
			
			public String getBelahKetupat() {
				return this.belahketupat;
			}
			public void setBelahKetupat(String belahketupat) {
				this.belahketupat = belahketupat;
			}
				
			public double getKelilingBelahKetupat() {
				return kelilingbelahketupat;
			}
			public void setKelilingBelahKetupat(double kelilingbelahketupat) {
				this.kelilingbelahketupat = kelilingbelahketupat;
			}
			
			public double getLuasBelahKetupat() {
				return this.luasbelahketupat;
			}
			public void setLuasBelahKetupat(double luasbelahketupat) {
				this.luasbelahketupat = luasbelahketupat;
			}
			
			public String toString() {
				return "nama:"+this.belahketupat+
						", keliling:"+this.kelilingbelahketupat+
						", luas:"+this.luasbelahketupat
						;
		}
	}