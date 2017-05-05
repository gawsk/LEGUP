package edu.rpi.phil.legup.puzzles.shorttruthtable;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;

public class ContradictionFalseBICONDITIONALIsTrue extends Contradiction {

	public ContradictionFalseBICONDITIONALIsTrue() {
		// TODO Add imports
		setName("False BICONDITIONAL is True");
		description = "A BICONDITIONAL logical symbol cannot be marked false if the left and right values are the same.";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}

	@Override
	public String checkContradictionRaw(BoardState state) {
		// TODO Check for false BICONDITIONAL, if both values are the same then contradiction.
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

}
