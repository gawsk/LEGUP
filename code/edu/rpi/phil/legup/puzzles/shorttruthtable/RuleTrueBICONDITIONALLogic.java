package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleTrueBICONDITIONALLogic extends PuzzleRule {

	public RuleTrueBICONDITIONALLogic() {
		setName("True BICONDITIONAL Logic");
		description = "If a BICONDITIONAL logic value has both adjacent values that are the same, the BICONDITIONAL is true.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed BICONDITIONAL logic value is true and next to values that are the same.
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionFalseBICONDITIONALIsTrue());
		
		return null;
	}
}
