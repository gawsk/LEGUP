package edu.rpi.phil.legup.puzzles.shorttruthtable;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;

public class ContradictionTrueIMPLICATIONIsFalse extends Contradiction {

	public ContradictionTrueIMPLICATIONIsFalse() {
		// TODO Add imports
		setName("True IMPLICATION is False");
		description = "An IMPLICATION logical symbol cannot be marked true if the left value is true and the right value is false.";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}

	@Override
	public String checkContradictionRaw(BoardState state) {
		// TODO Look for True IMPLICATION STATEMENT.  If the left value is true and the right value is false, it's a contradiction.
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

}
