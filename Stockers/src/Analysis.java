
public class Analysis {
	public static void sortCompanies(String SortType, Company comp[])
	{
		Company c[];
		c=SortingFunctions.quicksort(comp, 0, comp.length-1, SortType );
		for (int i = 0 ;i < c.length; i++)
		{
			System.out.println (c[i].NameofCompany + " Current Shareprice = " + c[i].StockPrice + " Share Increases or Decreased :" + c[i].ShareMoreorLess);
		}
	}

	public static void ShowAnalysis(int MenuOption, Company comp[])
	{
		switch(MenuOption)
		{
		case 1:
		{
			System.out.println("Stock prices in ascending order are :");
			System.out.println("--------------------------------------");
			sortCompanies("Ascending", comp);
			System.out.println("--------------------------------------");
			System.out.println();
			break;
		}
		case 2:
		{
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
			SearchingAlgorithms.CountCompanies(comp, "true");
			System.out.println("--------------------------------------");
			System.out.println();
			break;
		}
		case 4:
		{
			System.out.println("List of Companies whose Stock prices Declined today");
			System.out.println("--------------------------------------");
			SearchingAlgorithms.CountCompanies(comp, "false");
			System.out.println("--------------------------------------");
			System.out.println();
			break;
		}
	
		case 6:
		{
			break;
		}
		default:
		{
			break;
		}
		}
	}
	public static void ShowAnalysis( Company comp[], double StockValue)
	{
		System.out.println("Stock Value : " +  StockValue + " : Details are below");
		System.out.println("--------------------------------------");
		SearchingAlgorithms.SearchCompany(StockValue, comp);
		System.out.println("--------------------------------------");
		System.out.println();
	}
}
