package bogo;

public class Main {

	public static void main(String[] args) {
		Bogo heck = new Bogo();
		heck.setArray();
		System.out.println("Sorting...");
		while (!heck.isSorted()) {
			heck.sortingCancer();
			//System.out.println(heck.getIterations());
			//System.out.println(heck.getComp());
		}
		System.out.println("Hope you are happy with yourself");
		System.out.println("Final result: "+heck.getArray());
		System.out.println("Iterations: "+heck.getIterations());
		System.out.println("Comparisons: "+heck.getComp());
	}

}