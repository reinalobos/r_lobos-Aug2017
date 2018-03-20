package textExcel;

public class EmptyCell implements Cell {
	private String input;
	public String abbreviatedCellText(){
		// text for spreadsheet cell display, must be exactly length 10
		if(input.length() < 10) {
			String paddedInput = input;
			for (int i = 0; i < 10 - input.length(); i++) {
				paddedInput += " ";
			}
			return paddedInput;
		}else if (input.length() > 10) {
			String truncatedInput = input.substring(0,9);
			return truncatedInput;
		}else {
			return input;
		}
	}
	public String fullCellText() {
		// text for individual cell inspection, not truncated or padded
		return input;
	}

}
	
