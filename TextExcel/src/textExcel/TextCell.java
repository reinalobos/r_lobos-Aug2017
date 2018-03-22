package textExcel;

public class TextCell implements Cell{
	private String input;
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
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
	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		String withQuotes = " \" + input + \"";
		return withQuotes;
	}
	
}
