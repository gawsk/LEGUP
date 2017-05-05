package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleFalseIMPLICATIONLogic extends PuzzleRule {

	public RuleFalseIMPLICATIONLogic() {
		setName("False IMPLICATION Logic");
		description = "If an IMPLICATION logic value has the left adjacent value as True and the right adjacent value as False, the IMPLICATION logic value is False.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed value is false and next to a true value on the left and a false value on the right.
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionTrueIMPLICATIONIsFalse());
		
		return null;
	}
}
