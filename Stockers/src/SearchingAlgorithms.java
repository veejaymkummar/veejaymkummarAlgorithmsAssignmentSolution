//Searching Algorithms
public class SearchingAlgorithms 
{
	//Method to count the companies by traversing through the array and increasing the counter basis the condition

	public static void CountCompanies(Company comp[], String Condition)
	{
		int counter = 0 ;
		boolean condition = false ;
		System.out.println();
	//basis the condition running the loop to count the stocks which has increased
		if (Condition.equals("true"))
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
		//basis the condition running the loop to count the stocks which has declined
		if (Condition.equals("false"))
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
		//Displaying messages basis the condition
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
		// if no stock found with the condition then display message basis the condition
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
	//This is the method to search a company with a specific stock value
	 public static void SearchCompany(double StockValue, Company comp[])
	 {
		 boolean found = false;
		 int i;
		 for ( i = 0; i < comp.length; i++)
		 {
			double StockPrice= comp[i].StockPrice;
			if (StockPrice == StockValue) 
			{//if found then displaying the company detail for that particular stock value
				found = true;
				System.out.println();
				System.out.println("Name of Company: " + comp[i].NameofCompany);
				System.out.println("Share Price: " + comp[i].StockPrice);
				System.out.println("Did the Share prices increased : " + comp[i].ShareMoreorLess);
				System.out.println();
				break;
			}
		 }
		 //if not found then displaying not found message
		if (found == false)
		 {
			 System.out.println("No Stock with " + StockValue + " Stock Value found");
		 }
	 }
}
