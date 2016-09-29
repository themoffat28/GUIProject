package popups.controller;

import popups.view.PopupViewer;

public class PopupController
{
	
	private PopupViewer display;
	
	public PopupController()
	{
		display = new PopupViewer();
	}
	
	public void start()
	{
		String answer = "sample";
		while(answer != null && !isDouble(answer))
		{
			answer = display.collectResponse("Sorry, you need to type in a number.");
		}
	}
		
	/**
	 * Checks if the supplied String can be parsed to a double value.
	 * @param potentialValue : The string to test.
	 * @return Whether the value could be parsed.
	 */

	private boolean isDouble(String potentialValue)
	{
		boolean isParseble = false;
		
		try
		{
			double test = Double.parseDouble(potentialValue);
			isParseble = true;
		}
		catch(NumberFormatException notDouble)
		{
			display.displayMessage("This is not a valid value!");
		}
		
		return isParseble; 
	}
	/**
	 * Checks that the suppled string is parseble to an integer value.
	 * @param potentialNumber : The string to test for parsing.
	 * @return Whether it could be parsed as an integer.
	 */
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseble = false;
		
		try
		{
			int test = Integer.parseInt(potentialNumber);
			isParseble = true;
		}
		catch(NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage());
			display.displayMessage("Type in a number next time!");
		}
		
		return isParseble;
	}
	
	
}
