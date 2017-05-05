package edu.rpi.phil.legup.puzzles.shorttruthtable;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;

public class ContradictionTrueBICONDITIONALIsFalse extends Contradiction {

	public ContradictionTrueBICONDITIONALIsFalse() {
		// TODO Add imports
		setName("True BICONDITIONAL is False");
		description = "A BICONDITIONAL logical symbol cannot be marked true if the left and right valuse are different.";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}

	@Override
	public String checkContradictionRaw(BoardState state) {
		// TODO Check for true biconditional and for the left and right statements to be different values.
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

}
