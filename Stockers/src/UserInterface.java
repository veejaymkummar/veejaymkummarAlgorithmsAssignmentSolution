import java.util.Scanner;
public class UserInterface 
{
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
		Scanner sc = new Scanner(System.in);
		Company comp[];	
		String CompanyName="";
		double SharePrice= 0.0;
		String ShareMoreorLess = "";
		int Size=0;
		while (Size ==0)
		{
			System.out.println("Enter the no of companies: ");
			Size = sc.nextInt();
			if (Size == 0 )
			{
				System.out.println("Enter Number Greater than 0.");
			}
		}
		comp = new Company[Size];
		for (int i = 0 ; i < Size ; i++)
		{
			System.out.println("Enter Company Name");
			CompanyName = sc.next();
			System.out.println("Enter current stock price of the company " + CompanyName + ": ");
			SharePrice= sc.nextDouble();
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
			Company c = new Company(CompanyName, SharePrice, ShareMoreorLess);
			comp[i] = c;
			ShareMoreorLess = "";
		}	
		int MenuOption = 1;
		while (MenuOption != 0)
		{
			ShowMenu();	
			MenuOption = sc.nextInt();
			if (MenuOption == 5)
			{
				System.out.println ("enter the key value");
				double StockValue = sc.nextDouble();
				Analysis.ShowAnalysis(comp,StockValue);
			}
			else
			{
				Analysis.ShowAnalysis(MenuOption,comp);
			}
		}
		sc.close();
	}

}
