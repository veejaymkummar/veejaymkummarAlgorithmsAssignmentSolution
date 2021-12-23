
public class SearchingAlgorithms 
{
	public static void CountCompanies(Company comp[], String Condition)
	{
		int counter = 0 ;
		boolean condition = false ;
		System.out.println();
		if (Condition =="true")
		{
			condition=true;
			for (int i = 0 ; i < comp.length; i++)
			{
				if (comp[i].ShareMoreorLess.equals("true"))
				{
					counter++;
					System.out.println (counter + ". " + comp[i].NameofCompany + " Current Shareprice = " + comp[i].StockPrice + " Share Increases or Decreased :" + comp[i].ShareMoreorLess);
				}
			}
		}
		if (Condition =="false")
		{
			condition = false;
			for (int i = 0 ; i < comp.length; i++)
			{
				if (comp[i].ShareMoreorLess.equals("false"))
				{
					counter++;
					System.out.println (counter + ". " + comp[i].NameofCompany + " Current Shareprice = " + comp[i].StockPrice + " Share Increases or Decreased :" + comp[i].ShareMoreorLess);
				}
			}
		}
		System.out.println();
		if (counter > 0 )
		{
			if (!condition)
			{
				System.out.println("Total no of companies whose stock price declined today " + Integer.toString(counter));
			}
			if (condition)
			{
				System.out.println("Total no of companies whose stock price rose today: " + Integer.toString(counter));
			}
		}
		if (counter == 0 )
		{
			if (!condition)
			{
				System.out.println("There are no companies whose stock have declined");
			}
			if (condition)
			{
				System.out.println("There are no companies whose stock rose today");
			}
		}
	 }
	 public static void SearchCompany(double StockValue, Company comp[])
	 {
		 boolean found = false;
		 int i;
		 for ( i = 0; i < comp.length; i++)
		 {
			double StockPrice= comp[i].StockPrice;
			if (StockPrice == StockValue) 
			{
				found = true;
				System.out.println();
				System.out.println("Name of Company: " + comp[i].NameofCompany);
				System.out.println("Share Price: " + comp[i].StockPrice);
				System.out.println("Did the Share prices increased : " + comp[i].ShareMoreorLess);
				System.out.println();
				break;
			}
		 }
		if (found == false)
		 {
			 System.out.println("No Stock with " + StockValue + " Stock Value found");
		 }
	 }
}
