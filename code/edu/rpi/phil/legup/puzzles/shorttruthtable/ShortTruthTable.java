//
//  TreeTent.java
//  LEGUP
//
//  Created by Morgan Larkin on April, 2017.
//
//



package edu.rpi.phil.legup.puzzles.shorttruthtable;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JDialog;

import edu.rpi.phil.legup.*;

public class ShortTruthTable extends PuzzleModule
{
	public static int CELL_UNKNOWN = 0, CELL_TRUE = 1, CELL_FALSE = 2, CELL_SPACE = 3;

    public Map<String, Integer> getSelectableCells()
    {
        Map<String, Integer> tmp = new LinkedHashMap<String, Integer>();
        tmp.put("initial", CELL_UNKNOWN);
        tmp.put("true", CELL_TRUE);
        tmp.put("false", CELL_FALSE);
        return tmp;
    }
    
    public Map<String, Integer> getUnselectableCells()
    { 
    	Map<String, Integer> tmp = new LinkedHashMap<String, Integer>(); 
    	tmp.put("space", CELL_SPACE);
    	return tmp; 
    }


	Vector <PuzzleRule> ruleList;
	Vector <Contradiction> contraList;
	Vector <CaseRule> caseList;
	
	public ShortTruthTable()
	{
		
		ruleList = new Vector <PuzzleRule>();
		contraList = new Vector <Contradiction>();
		caseList = new Vector <CaseRule>();
		
		//add the different rules as you make them.
		
	}
	
	
	//This is currently the nurikabe implementation, with some small adjustments
	//change to a library of values, alphabet, logic symbols, etc.
	public void drawCell( Graphics2D g, int x, int y, int state ){
		if( state != 0 ){
			g.setColor( (state == 1) ? Color.green : Color.red );
			g.fill( getCellBounds(x,y) );
			if( state > 10 )
				drawText( g, x, y, String.valueOf(state - 10) );
		}
	}
	
	public boolean checkGoal(BoardState currentBoard, BoardState goalBoard){
		return currentBoard.compareBoard(goalBoard);
	}
	
	public void initBoard(BoardState state)
	{
		// gotta figure this one out
	}
	
	public Vector<PuzzleRule> getRules()
	{
		return ruleList;
	}

	public Vector<Contradiction> getContradictions()
	{
		return contraList;
	}

	public Vector<CaseRule> getCaseRules()
	{
		return caseList;
	}

	
	
	
	
	
}
