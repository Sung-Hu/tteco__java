package basic.ch18;

public class CPU {

	String name;
	int prise;
	double vertion;
	
	void start() {
		System.out.println("CPU 작동");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public double getVertion() {
		return vertion;
	}
	public void setVertion(double vertion) {
		this.vertion = vertion;
	}
	void stop() {
		System.out.println("CPU 종료");
	}
}
