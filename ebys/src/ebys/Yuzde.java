package ebys;
public class Yuzde {

	private double yuzde;
	private String type;
	
	public Yuzde(double yuzde, String type){
		this.yuzde=yuzde;
		this.type=type;
	}
	public double getyuzde() {
		return yuzde;
	}
	public void setyuzde(double yuzde) {
		this.yuzde = yuzde;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
