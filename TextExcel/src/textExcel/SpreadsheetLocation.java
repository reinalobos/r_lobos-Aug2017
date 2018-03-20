package textExcel;
import java.util.*;
//Update this file with your own code.

public class SpreadsheetLocation implements Location{
	private int rowNum;
 	private int columnNum;
	private String location;
	private String identifier;
	public SpreadsheetLocation(String cellName){
		// TODO: Fill this out with your own code
		char rowLetter = cellName.charAt(0);
    			int columnNum = Integer.valueOf(cellName.substring(1 ,  cellName.length() - 1));
    			for(char col = 'a'; col < (char) ('a' + 20); col++) {
    				if(rowLetter == col) {
    					this.rowNum = rowLetter - 96;
    			}
    		}
    		for(int col = 0; col < 12; col++) {
    				if(columnNum == col) {
    					this.columnNum = columnNum;
    				}
    			}
    			
    			location = cellName.toUpperCase();
    }
    @Override
    public int getRow(){
        // TODO Auto-generated method stub
    	this.rowNum = Integer.parseInt(location.substring(1-location.length()));
    			return rowNum - 1;
    }

    @Override
    public int getCol() {
        // TODO Auto-generated method stub
    	this.columnNum = location.charAt(0);
    	return columnNum - 65;
    }
}
