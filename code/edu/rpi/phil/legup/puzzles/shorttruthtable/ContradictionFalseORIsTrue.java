package edu.rpi.phil.legup.puzzles.shorttruthtable;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;

public class ContradictionFalseORIsTrue extends Contradiction {

	ContradictionFalseORIsTrue()
	{
		setName("False OR is True");
		description = "An OR logical symbol cannot be marked false if there is an adjacent statement that is marked true.";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}
	@Override
	public String checkContradictionRaw(BoardState state) {
		// TODO Search for False OR and for one of the adjacent values to be True.
		//if found, then contradiction, else, no good.
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

}
