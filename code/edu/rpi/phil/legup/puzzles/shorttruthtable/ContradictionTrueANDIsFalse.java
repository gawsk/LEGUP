package edu.rpi.phil.legup.puzzles.shorttruthtable;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;

public class ContradictionTrueANDIsFalse extends Contradiction {

	public ContradictionTrueANDIsFalse() {
		// TODO Auto-generated constructor stub
		setName("True AND is False");
		description = "An AND logical symbol cannot be marked true if there is an adjacent value marked false.";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}

	@Override
	public String checkContradictionRaw(BoardState state) {
		// TODO Check for True AND and for one of the adjacent values to be false.
		//if found, then contradiction, else return error
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

}
