package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleTrueORValue extends PuzzleRule {

	public RuleTrueORValue() {
		setName("True OR Value");
		description = "If an OR value is True and has an adjacent value that is False, the other adjacent value is True.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed value is next to a True OR logic value and the other value adjacent to the OR is false..
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionTrueORIsFalse());
		
		return null;
	}
}

