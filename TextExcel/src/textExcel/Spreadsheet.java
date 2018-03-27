package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	private EmptyCell[][] spreadsheet;
	public Spreadsheet(){
		EmptyCell [][] spreadsheet= new EmptyCell [20][12];
	}
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return command;
	/*	command.toLowerCase();
		if (command.contains("="){
			command.split(" ", 3);
			
		} else if (command.contains("clear")) {
			SpreadsheetLocation clear = new SpreadsheetLocation(command.substring(6, command.length()));
			spreadsheet[clear.getRow()][clear.getCol()] = new EmptyCell();
			//return getGridText();
		}*/
	}
	public void clearAll(){
		for(int i = 0; i < getRows(); i ++){
			for(int j =0; j < getCols(); j++){
				spreadsheet[i][j] = new EmptyCell();
			} 
		}
	}
	public void clearCell() {
		
	}
	public void cellInspection(String command) {
		
	}
	public void assignCell (String command) {
		command.split(" ", 3);
	}
	@Override
	public int getRows(){
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return spreadsheet[loc.getRow()][loc.getCol()];
		

	}

	@Override
	public String getGridText(){
		// TODO Auto-generated method stub
		String grid = "";
		int rowNum = 1;
		char colCounter = 'A';
		for(int r = 1; r <= 20;r++) {
			for(int c = 1; c <= 12;c++) {
				grid += ();
			}
		}
		return grid;
	}
}
