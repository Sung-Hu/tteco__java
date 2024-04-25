package basic.exercise.toy;

public class ToyMachineTest {

	// 코드 테스트 
	public static void main(String[] args) {
		

		ToyMachine toyMachine1 = new Poketmon();
		ToyMachine toyMachine2 = new SailorMoon();
		
		toyMachine1.showInfo();
		toyMachine2.showInfo();
		
		System.out.println("----------------------");
		
		ToyMachine[] toyMachines = new ToyMachine[2];
		toyMachines[0] = toyMachine1; 
		toyMachines[1] = toyMachine2;
		
		System.out.println("----------------------");
		toyMachines[0].showInfo();
		System.out.println(((Poketmon)toyMachines[0]).origin);
		((Poketmon)toyMachines[0]).pika();
		
		System.out.println("----------------------");
		toyMachines[1].showInfo();
		System.out.println(((SailorMoon)toyMachines[1]).Type);
		((SailorMoon)toyMachines[1]).magic();
		
		for(int i = 0; i < toyMachines.length; i++) {
			if(toyMachines[i] instanceof Poketmon) {
				((Poketmon)toyMachines[i]).pika();
			}
			else {
				toyMachines[i].showInfo();
			}
			for(int o = 0; o < toyMachines.length; o++) {
				if(toyMachines[o] instanceof SailorMoon) {
					((SailorMoon)toyMachines[o]).magic();
				}
				else {
					toyMachines[o].showInfo();
				}
			}
		}
	} // end of main 

} // end of class 