package edu.rpi.phil.legup.puzzles.shorttruthtable;

import javax.swing.ImageIcon;

import java.awt.Point;
import java.util.Set;
import java.util.LinkedHashSet;

import javax.swing.ImageIcon;

import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.PuzzleRule;
import edu.rpi.phil.legup.puzzles.nurikabe.ContradictionIsolatedBlack;
import edu.rpi.phil.legup.Contradiction;

public class RuleTrueValue extends PuzzleRule {

	RuleTrueValue()
	{
		setName("True Value");
		description = "A value set to true will be true everywhere.";
		image = null;//new ImageIcon("images/nurikabe/rules/NoBlackSquare.png");
	}

	public String getImageName()
	{
		return "";
	}
	
	protected String checkRuleRaw(BoardState destBoardState)
	{
		//check if the changed value are all one value and all changed to the same one.
		//Also check that if a result is negated, that it'll create a contradiction
		
		Set<Contradiction> contras = new LinkedHashSet<Contradiction>();
		contras.add(new ContradictionTrueAndFalseValue());
		
		return null;
	}
}
