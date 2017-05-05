package edu.rpi.phil.legup.puzzles.shorttruthtable;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;

public class ContradictionFalseIMPLICATIONIsTrue extends Contradiction {

	public ContradictionFalseIMPLICATIONIsTrue() {
		// TODO Add imports
		setName("False IMPLICATION is True");
		description = "An IMPLICATION logical symbol can only be marked false if the left value is True and the right value is False.";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}

	@Override
	public String checkContradictionRaw(BoardState state) {
		// TODO Check for False Implication and for the left value to be true and the right to be false.
		//If in that form, there's an error, otherwise a contradiction.
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

}
