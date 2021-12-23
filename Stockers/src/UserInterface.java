import java.util.Scanner;
public class UserInterface 
{
	//Method to show menu
	public static void ShowMenu()
	{
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		
	}
	
	public static void main(String[] args) 
	{
		//Initialise Scanner for getting user inputs 
		Scanner sc = new Scanner(System.in);
		//Initialise Company object to capture details of company
		Company comp[];	
		String CompanyName="";
		double SharePrice= 0.0;
		String ShareMoreorLess = "";
		int Size=0;
		
		//While loop to continue to recieve input on size until its greater that zero
		while (Size ==0)
		{
			System.out.println("Enter the no of companies: ");
			Size = sc.nextInt();
			if (Size == 0 )
			{
				System.out.println("Enter Number Greater than 0.");
			}
		}
		//basis the Size initialize the company object array
		comp = new Company[Size];
		
		//Outer loop to receive user input on company details and store in the company array
		for (int i = 0 ; i < Size ; i++)
		{
			System.out.println("Enter Company Name");
			CompanyName = sc.next();
			System.out.println("Enter current stock price of the company " + CompanyName + ": ");
			SharePrice= sc.nextDouble();
			//this loop validates the true and false inputs as the need to be very specific
			while (ShareMoreorLess.equals(""))
			{
				System.out.println("Whether company's stock price rose today compare to yesterday? (true / false): ");
				ShareMoreorLess = sc.next();
				if (!(ShareMoreorLess.equals("true")|| ShareMoreorLess.equals("false") || ShareMoreorLess.equals("True") || ShareMoreorLess.equals("False")))
				{
					ShareMoreorLess="";
				}
				else
				{
					if (ShareMoreorLess.equals("True") || ShareMoreorLess.equals("true"))
					{
						ShareMoreorLess = "true";
					}
					if (ShareMoreorLess.equals("False") || ShareMoreorLess.equals("false"))
					{
						ShareMoreorLess = "false";
					}
				}
			}
			//after receiving the inputs store the values in new object and assign to the ith location in array
			Company c = new Company(CompanyName, SharePrice, ShareMoreorLess);
			comp[i] = c;
			//reset ShareMoreorLess string
			ShareMoreorLess = "";
		}	
		int MenuOption = 1;
		// while loop to show menu till user input is 0
		while (MenuOption != 0)
		{
			//calling show menu method 
			ShowMenu();	
			MenuOption = sc.nextInt();
			//Menu option 5 needs additional user input
			if (MenuOption == 5)
			{
				System.out.println ("enter the key value");
				double StockValue = sc.nextDouble();
				//Calling the Show analysis Method in the Analysis class
				Analysis.ShowAnalysis(comp,StockValue);
			}
			else
			{
				//Calling the Show Analysis Method in the Analysis Class
				Analysis.ShowAnalysis(MenuOption,comp);
			}
		}
		sc.close();
	}

}
