package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		
	Random randomN = new Random();
	String lotto = "";
	for(int i=0; i<6; i=i+1) {
	int randomNumber = randomN.nextInt(6 - 0) + 1;
	lotto  += randomNumber;
	}
	JOptionPane.showMessageDialog(null,lotto);
}
}
