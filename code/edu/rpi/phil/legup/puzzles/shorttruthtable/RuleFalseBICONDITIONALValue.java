package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleFalseBICONDITIONALValue extends PuzzleRule {

	public RuleFalseBICONDITIONALValue() {
		setName("False BICONDITIONAL Value");
		description = "If a BICONDITIONAL logic value is False, and an adjacent value is known, the other adjacent value is different.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed values are different and next to a false BICONDITIONAL logic value..
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionFalseBICONDITIONALIsTrue());
		
		return null;
	}
}
