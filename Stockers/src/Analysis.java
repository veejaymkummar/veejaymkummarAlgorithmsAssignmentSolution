
public class Analysis {
	//Method to sort the Company object array
	public static void sortCompanies(String SortType, Company comp[])
	{
		Company c[];
		//Calling the Quicksort Function from Sorting Functions Class
		c = SortingFunctions.quicksort(comp, 0, comp.length-1, SortType );
		for (int i = 0 ;i < c.length; i++)
		{
			System.out.println (c[i].NameofCompany + " Current Shareprice = " + c[i].StockPrice + " Share Increases or Decreased :" + c[i].ShareMoreorLess);
		}
	}

	public static void ShowAnalysis(int MenuOption, Company comp[])
	{
		// Using Switch to execute code basis the menu option pressed by the user
		switch(MenuOption)
		{
		case 1:
		{
			System.out.println("Stock prices in ascending order are :");
			System.out.println("--------------------------------------");
			//Calling the Sort Companies Method with the parameter of Ascending
			sortCompanies("Ascending", comp);
			System.out.println("--------------------------------------");
			System.out.println();
			break;
		}
		case 2:
		{
			//Calling the Sort Companies Method with the parameter of Descending
			System.out.println("Stock prices in Decending order are :");
			System.out.println("--------------------------------------");
			sortCompanies("Decending", comp);
			System.out.println("--------------------------------------");
			System.out.println();
			break;
		}
		case 3:
		{
			System.out.println("List of Companies whose Stock prices rose today");
			System.out.println("--------------------------------------");
			//Calling the Method to count number of stocks which have increased in there value 
			SearchingAlgorithms.CountCompanies(comp, "true");
			System.out.println("--------------------------------------");
			System.out.println();
			break;
		}
		case 4:
		{
			System.out.println("List of Companies whose Stock prices Declined today");
			System.out.println("--------------------------------------");
			//Calling the Method to count number of stocks which have declined in there value
			SearchingAlgorithms.CountCompanies(comp, "false");
			System.out.println("--------------------------------------");
			System.out.println();
			break;
		}
	
		case 6:
		{
			//No action
			break;
		}
		default:
		{
			//No Action
			break;
		}
		}
	}
	//this is Method override with one additional parameter of stock value
	public static void ShowAnalysis( Company comp[], double StockValue)
	{
		System.out.println("Stock Value : " +  StockValue + " : Details are below");
		System.out.println("--------------------------------------");
		SearchingAlgorithms.SearchCompany(StockValue, comp);
		System.out.println("--------------------------------------");
		System.out.println();
	}
}
