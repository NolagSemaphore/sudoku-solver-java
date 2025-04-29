import java.io.*;


public class SodukuGame 
{
	
	SodokuBoard myBoard;

	boolean[][] presetSpots;
	
	public void getUserInputChoices()
	{
		String typedValue = "";
		System.out.println("Welcome to the Instant Sodoku Solver!");
		
		boolean gettingInput = true;
		
		
		
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
		while(gettingInput)
		{	
		
			try
			{
				System.out.println
					("Enter Row number of preset sodoku square(1-9 from top to bottom:(press 99 to exit and get your solution) ");
				
				typedValue = keyboard.readLine();
				Integer myRowChoice = new Integer(typedValue);
	        	int myIntRowChoice = myRowChoice.intValue();
	        	
	        	if(myIntRowChoice == 99)
	        	{
	        		gettingInput = false;
	        	}
	        	else
	        	{
	        		System.out.println("Enter Column number of preset sodoku square(1-9 from top to bottom: ");
					
				
					typedValue = keyboard.readLine();
					Integer myColumnChoice = new Integer(typedValue);
		        	int myIntColChoice = myColumnChoice.intValue();
		        	
		        	System.out.println("Enter Preset choice for this square: ");
					
					
					typedValue = keyboard.readLine();
					Integer myValueChoice = new Integer(typedValue);
		        	int myIntValueChoice = myValueChoice.intValue();
		        	myBoard.setInitialSquareValue(myIntRowChoice, myIntColChoice, myIntValueChoice);
		        	presetSpots[myIntRowChoice][myIntColChoice] = true;
	        	}
	        	
	        	
			}
			catch( IOException e )
		    {
				System.out.println("Error!");
		    } 
		    catch(java.lang.NumberFormatException e)
		    {
		        System.out.println("only type numbers and then press enter");
		        	
		    }
		}// end while
		
		for(int row = 1; row < 10; row++)
		{
			for(int col = 1; col < 10; col++)
			{
				if(!presetSpots[row][col])
				{
					myBoard.setInitialSquareValue(row, col, 10);
				}
				
				
			}
			
		}
	}
	
	// Constructor
	public SodukuGame()
	{
		presetSpots = new boolean[10][10];
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				presetSpots[i][j] = false;
			}
			
		}
		myBoard = new SodokuBoard();
		this.getUserInputChoices();
		
	}

	
	public void solve()
	{
			myBoard.solve();
	}
}