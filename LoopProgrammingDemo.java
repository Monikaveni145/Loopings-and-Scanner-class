package tamilnadu.chennai;

public class LoopProgrammingDemo {
	public static void main(String[] args) {

		LoopProgrammingDemo pd = new LoopProgrammingDemo();

		pd.learn_if();
		pd.learn_if2();
		pd.learn_if3();
		pd.loopLearning();
	}

	private void learn_if() {
		int no1 = 59, no2 = 55;
		if (no1 > no2) {
			System.out.println(no1);
		} else if (no2 > no1) {
			System.out.println(no2);
		} else {
			System.out.println(no1 + "equals" + no2);
		}
	}

	private void learn_if2() { // TODO Auto-generated method stub
		boolean school = true;
		boolean raining = false;

		if (school == true && raining == true) {
			System.out.println("Tacke umbrella");
		} else {
			System.out.println("not nesscesary");
		}
	}

	private void learn_if3() {
		// TODO Auto-generated method stub
		int amount = 160;
		int petrol = 104;
		if (amount > 150) {
			if (petrol == 90 && amount >= 160) {// both conditions are true the statement is execute otherwise not
												// execute go to the nest statement
				System.out.println("fill petrol");
			} else {
				System.out.println("don't fill petrol today");
			}
		} else {
			System.out.println("go home");
		}
		if (amount > 150 || petrol <= 104) {// if any one condition is true the statement is execute
			System.out.println("Fill petrol");
		}

	}

	private void loopLearning() { // TODO Auto-generated method stub
		int first = 2;
		int second = first * 2;
		int third = second * 2;
		int total = first + second + third;
		System.out.println(total);
	}
}
