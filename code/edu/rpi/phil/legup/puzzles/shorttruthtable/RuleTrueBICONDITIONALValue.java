package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleTrueBICONDITIONALValue extends PuzzleRule {

	public RuleTrueBICONDITIONALValue() {
		setName("True BICONDITIONAL Value");
		description = "If a BICONDITIONAL logic value is True, and an adjacent value is known, the other value is the same.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed values are the same next to a true BICONDITIONAL logic value..
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionTrueBICONDITIONALIsFalse());
		
		return null;
	}
}
