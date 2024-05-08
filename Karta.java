package plk;

public class Karta {
	private Pasient p;
	private Doctor d;
	private int numberCard;
	private String dateOpenCard;
	
	
	public void setP(Pasient p) {
		this.p = p;
	}
	public Pasient getP() {
		return p;
	}
	
	public void setD(Doctor d) {
		this.d = d;
	}
	public Doctor getD() {
		return d;
	}
}