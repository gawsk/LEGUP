package edu.rpi.phil.legup.puzzles.shorttruthtable;

import javax.swing.ImageIcon;
import edu.rpi.phil.legup.BoardState;
import edu.rpi.phil.legup.ConnectedRegions;
import edu.rpi.phil.legup.Contradiction;
import edu.rpi.phil.legup.puzzles.shorttruthtable.ShortTruthTable;

public class ContradictionTrueORIsFalse extends Contradiction{
	
	ContradictionTrueORIsFalse()
	{
		setName("True OR is False");
		description = "An OR logical symbol cannot be marked true if both adjacent statements are marked false.";
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
    	
    	//Check for a true OR and for both adjacent values to be false.
    	//If true, then contradiction is good, else error.
    	
    	return null;
    }

}
