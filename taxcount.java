import java.util.*;
import java.io.*;

class taxcount
{
	public static void main(String ar[])
	{
		System.out.println("Enter your annual income : ");
		Scanner sc = new Scanner(System.in); // take income from user 
		double income = sc.nextDouble();
		double ttax = 0, cess = 0, perc = 0, tax = 0; // ttax = total tax, cess = cess tax count, perc = percentage tax on income, tax = without cess tax
		if(income <= 250000) // if income is less then 2.5lac
		{
			ttax = 0; // less then or equal to 2.5k income then not have to pay tax 
		}
		else if(income > 250000 && income <= 500000) // income upto 2.5 lac to 5.0 lac
		{
			income = income - 250000;
			tax = (income * 5) / 100; // they have to pay 5% tax in amount above 2.5 lac till 5.0 lac
			cess = (tax * 4) / 100; // cess tax which is 4% of tax amount
			ttax = tax + cess; // here we doing tax + cess so we can get total amount of tax
		}
		else if(income > 500000 && income <= 750000) // income upto 5.0 lac to 7.5 lac
		{
			income = income - 500000;
			perc = (income * 10) / 100; // they have to pay 10% tax in amount above 5.0 lac till 7.5 lac
			tax = perc + 12500; // below amount 5.0 lac they have to pay 12500 rs tax
			cess = (tax * 4) / 100; // cess tax which is 4% of tax amount
			ttax = tax + cess; // here we doing tax + cess so we can get total amount of tax
		}
		else if(income > 750000 && income <= 100000) // income upto 7.5 lac to 10.0 lac
		{
			income = income - 750000;
			perc = (income * 15) / 100; // they have to pay 15% tax in amount above 7.5 lac till 10.0 lac
			tax = perc + 37500; // below amount 7.5 lac they have to pay 37500 rs tax
			cess = (tax * 4) / 100; // cess tax which is 4% of tax amount
			ttax = tax + cess; // here we doing tax + cess so we can get total amount of tax
		}
		else if(income > 100000 && income <= 1250000) // income upto 10.0 lac to 12.5 lac
		{
			income = income - 100000;
			perc = (income * 20) / 100; // they have to pay 20% tax in amount above 10.0 lac till 12.5 lac
			tax = perc + 75000; // below amount 10.0 lac they have to pay 75000 rs tax
			cess = (tax * 4) / 100; // cess tax which is 4% of tax amount
			ttax = tax + cess; // here we doing tax + cess so we can get total amount of tax
		}
		else if(income > 1250000 && income <= 1500000) // income upto 12.5 lac to 15.0 lac
		{
			income = income - 125000;
			perc = (income * 25) / 100; // they have to pay 25% tax in amount above 12.5 lac till 15.0 lac
			tax = perc + 125000; // below amount 12.5 lac they have to pay 125000 rs
			cess = (tax * 4) / 100; // cess tax which is 4% of tax amount
			ttax = tax + cess; // here we doing tax + cess so we can get total amount of tax
		}
		else // more then 15.0 lac
		{
			income = income - 1500000; 
			perc = (income * 30) / 100; // they have to pay 30% tax in amount above 15.0 lac
			tax = perc + 187500; // below amount 15.0 lac they have to pay 187500 rs tax
			cess = (tax * 4) / 100; // cess tax which is 4% of tax amount
			ttax = tax + cess; // here we doing tax + cess so we can get total amount of tax
		}
		System.out.println("You income tax is : "+tax);
		System.out.println("Your cess amount is : "+cess);
		System.out.println("Your total income tax amount is : "+ttax);
		
	}
}