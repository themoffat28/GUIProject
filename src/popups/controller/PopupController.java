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
		while(answer != null && !answer.equals(""))
		{
			display.displayMessage("*Child Screams*");
		    answer = display.collectResponse("ARE WE THERE YET?");
			display.displayMessage("You tell the child " + answer);
		
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
			display.displayMessage("This is not a double value! ");
		}
		
		return isParseble; 
	}
	
	
	
	
}
