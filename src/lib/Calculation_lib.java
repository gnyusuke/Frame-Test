package lib;

public class Calculation_lib {
     private int m,n;

	public Calculation_lib(int m, int n) {//ローカル変数
		this.m = m;//thisがついたらフィールド下も
		this.n = n;
		
	}
     
	public int getPlus() {
		return this.m + this.n;
	}	
	public int getMinus() {
			return this.m - this.n;
	}
	 
	public int getTime() {
			return this.m * this.n;
	}	
	 public int getDivide() {
			return this.m / this.n;
	}	
	 
	public int getMod() {
			return this.m % this.n;
	}	

}
