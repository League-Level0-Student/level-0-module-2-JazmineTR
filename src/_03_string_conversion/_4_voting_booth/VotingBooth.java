package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
	String ageAsString = JOptionPane.showInputDialog("How old are you?");
	 int ageAsInt = Integer.parseInt(ageAsString);
	 
	if(ageAsInt > 18) {
		JOptionPane.showInputDialog("Who do you think should be the next president?");
	}
	else {
		JOptionPane.showMessageDialog(null, "No one cares what you think.");
	}
	}

}
