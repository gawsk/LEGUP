package edu.rpi.phil.legup.puzzles.shorttruthtable;

import javax.swing.ImageIcon;
import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.ConnectedRegions;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.puzzles.shorttruthtable.ShortTruthTable;


public class ContradictionTrueAndFalseValue extends Contradiction {
	
	ContradictionTrueAndFalseValue()
	{
		setName("True and False Value");
		description = "The same value cannot be both true and false";
		image = null;//new ImageIcon("images/nurikabe/contradictions/BlackArea.png");
	}

	public String getImageName()
	{
		return "";//"images/nurikabe/contradictions/BlackArea.png";
	}

	 /**
     * Checks if the contradiction was applied correctly to this board state
     *
     * @param state The board state
     * @return null if the contradiction was applied correctly, the error String otherwise
     */
    public String checkContradictionRaw(BoardState state)
    {
    	
    	//Implement alphabet, separate values for True and False values and check for a common attribute.
    	//If there is one, then contradiction is good, else error.
    	
    	return null;
    }

}
