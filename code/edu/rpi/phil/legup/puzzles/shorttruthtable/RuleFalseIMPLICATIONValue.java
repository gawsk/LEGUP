package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleFalseIMPLICATIONValue extends PuzzleRule {

	public RuleFalseIMPLICATIONValue() {
		setName("False IMPLICATION Value");
		description = "If an IMPLICATION logic value is False, the left adjacent value is true and the right adjacent value is false.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the left changed value is true, the right changed value is false, and next to a false IMPLICATION logic value..
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionFalseIMPLICATIONIsTrue());
		
		return null;
	}
}
