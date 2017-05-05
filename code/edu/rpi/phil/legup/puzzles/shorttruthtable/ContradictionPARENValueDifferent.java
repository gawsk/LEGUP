package edu.rpi.phil.legup.puzzles.shorttruthtable;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;


public class ContradictionPARENValueDifferent extends Contradiction {

	public ContradictionPARENValueDifferent()  {
		// TODO add imports
		
		setName("PARENTHESES Value different from logical value");
		description = "Parentheses value cannot be different from the logic symbol they're holding.";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}

	
	@Override
	public String checkContradictionRaw(BoardState state) {
		// TODO Check left Parentheses, if the value of it is different than the next logic symbol, contradiction.
		return null;
	}

	@Override
	public String getImageName() {
		// TODO Auto-generated method stub
		return null;
	}
}
