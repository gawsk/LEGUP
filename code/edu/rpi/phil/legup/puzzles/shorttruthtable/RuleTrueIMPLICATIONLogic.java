package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleTrueIMPLICATIONLogic extends PuzzleRule {

	public RuleTrueIMPLICATIONLogic() {
		setName("True IMPLICATION Logic");
		description = "If an IMPLICATION logic value has either a left adjacent value that is false or a right adjacent value that is true, then the Implication value is true.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed value is true and next to either a false value on the left or a true value on the right.
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionFalseIMPLICATIONIsTrue());
		
		return null;
	}
}
