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

}
