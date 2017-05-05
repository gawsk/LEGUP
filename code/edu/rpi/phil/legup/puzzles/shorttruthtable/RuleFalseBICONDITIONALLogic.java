package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.PuzzleRule;

public class RuleFalseBICONDITIONALLogic extends PuzzleRule {

	public RuleFalseBICONDITIONALLogic() {
		setName("False BICONDITIONAL Logic");
		description = "If a BICONDITIONAL logic value has adjacent values that are different, the BICONDITIONAL is false.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed BICONDITIONAL logic value is false and next to different values.
		//Also check that if a changed result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionTrueBICONDITIONALIsFalse());
		
		return null;
	}
}
