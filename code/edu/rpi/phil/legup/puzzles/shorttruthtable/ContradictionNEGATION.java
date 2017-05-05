package edu.rpi.phil.legup.puzzles.shorttruthtable;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;

public class ContradictionNEGATION extends Contradiction {

	public ContradictionNEGATION() {
		// TODO add import
		setName("NEGATION");
		description = "A Negation symbol cannot have the same value to the right of it.";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}

	@Override
	public String checkContradictionRaw(BoardState state) {
		// TODO Check NEGATION values, if value to the right of it is the same, contradiction
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

}
