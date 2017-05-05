package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleFalseANDLogic extends PuzzleRule {

	public RuleFalseANDLogic() {
		setName("False AND Logic");
		description = "If an AND logic value has an adjacent value that is False, the AND Logic Value is False.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed AND logic value is false and that one of the adjacent values is also false.
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionTrueANDIsFalse());
		
		return null;
	}
}
