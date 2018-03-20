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
				grid
			}
		}
		return grid;
	}

}
