package basic.ch18;

public class Computer {
	
	String name;
	int prise;
	CPU cpu;
	
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
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Computer() {
		cpu = new CPU();
	}
	public void startComputer() {
		cpu.start();
		System.out.println(name + "시작");
	}
	public void stopComputer() {
		cpu.stop();
		System.out.println(name + "종료");
	}
}
