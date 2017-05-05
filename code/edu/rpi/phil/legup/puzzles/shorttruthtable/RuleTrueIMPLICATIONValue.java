package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleTrueIMPLICATIONValue extends PuzzleRule {

	public RuleTrueIMPLICATIONValue() {
		setName("True IMPLICATION Value");
		description = "If an IMPLICATION logic value is True, either the left adjacent value is false, or the right adjacent value is true.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed value is false if on the right and true if on the left and next to a true IMPLICATION logic value..
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionTrueIMPLICATIONIsFalse());
		
		return null;
	}
}
