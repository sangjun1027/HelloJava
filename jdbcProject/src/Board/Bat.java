package Board;

public class Bat {
	// field
	private String name;
	private int age;
	private int hr;
	private double avg;
	private int rb;
	private double ops;
	private double wrc;
	private double war;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRb() {
		return rb;
	}
	public void setRb(int rb) {
		this.rb = rb;
	}
	public double getOps() {
		return ops;
	}
	public void setOps(double ops) {
		this.ops = ops;
	}
	public double getWrc() {
		return wrc;
	}
	public void setWrc(double wrc) {
		this.wrc = wrc;
	}
	public double getWar() {
		return war;
	}
	public void setWar(double war) {
		this.war = war;
	}
//	public void setName(String string) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	// 생성자
	public Bat() {}		//기본생성자
	public Bat(String name, int age, int hr, double avg, 
			   int rb, double ops, double wrc, double war) {
		super();		
		this.name = name;
		this.age = age;
		this.hr = hr;
		this.avg = avg;
		this.rb = rb;
		this.ops = ops;
		this.wrc = wrc;
		this.war = war;
	}	
}
	
	// method
	
	


