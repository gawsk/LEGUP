package edu.rpi.phil.legup.puzzles.shorttruthtable;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;

public class ContradictionFalseANDIsTrue extends Contradiction {

	public ContradictionFalseANDIsTrue() {
		// TODO add imports at top
		setName("False AND is True");
		description = "An AND logical symbol cannot be marked false if both adjacent statements are marked true.";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}

	@Override
	public String checkContradictionRaw(BoardState state) {
		// TODO Check for AND symbol marked false with both adjacent values marked true.
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}

}
