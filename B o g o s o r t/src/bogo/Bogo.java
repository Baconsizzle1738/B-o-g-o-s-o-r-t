package bogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Bogo {
	private ArrayList<Integer> ree = new ArrayList<>();
	private int iter = 0;
	private int comp = 0;
	public int getComp() {
		return comp;
	}
	public ArrayList<Integer> getArray() {
		return ree;
	}
	public int getIterations() {
		return iter;
	}
	public void setArray() {
		Scanner scan = new Scanner(System.in);
		int len = 0;
		System.out.println("How much do you want your pc to suffer?");
		try {
			len = scan.nextInt();
		}
		catch (Exception e) {
			System.out.println("Are you dumb use an int value >:(");
		}
		for (int i = 0; i<len; i++) {
			ree.add((int)(Math.random()*10001));
		}
	}
	public void sortingCancer() {
		ArrayList<Integer> temp = new ArrayList<>();
		while (ree.size()>0) {
			temp.add(ree.remove((int)(Math.random()*ree.size())));
		}
		iter++;
		ree = temp;
	}
	public boolean isSorted() {
		for (int i = 0; i<ree.size()-1; i++) {
			comp++;
			if (ree.get(i)>ree.get(i+1)) {
				return false;
			}
		}
		return true;
	}
}