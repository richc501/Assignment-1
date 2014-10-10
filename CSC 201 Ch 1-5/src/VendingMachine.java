//Richard Cunningham
//The vending machine offers 5 products
//The vending machine accepts coins, 1 dollar bills, and 5 dollar bills
//The change is always given in coins, with maximum possible number of coins in each value: 25, 10, 5 or 1 cent.
//The selections available for user are numbers from 1 to 5.
//The user enters the money – simulate the action through a loop that ends when the user enters 0. Each coin, or paper bill will be read individually.
//The user makes the selection, and the machine allows a maximum 4 other selections if the amount entered doesn’t cover the price of the item.
//Once an item is delivered, the machine gives the change in coins.
//There is no increment for the money during one selection.
//The user can stop the selection at any time by entering 0 for the product selection.
//If the user chooses to cancel the selection, the machine returns the initial amount in coins.
//Display the outcome of the operation for each alternative you consider possible for the vending machine.
//Make sure that the machine returns the correct change at all times.

//Output 5 products with price
//Ask for input money
//output products with amount entered
//Let user select options
//check if amount is enough to pay for item 
//subtract total from amount
//loop till hit max of 4 items
//give change
import java.util.Scanner;
public class VendingMachine {
	private static int selection, dollar, quarter, dime, nickel, penny;
	private static double amountInserted=0, total, item1=1.30, item2=1.00, item3=0.34, item4=0.85, item5=1.55; 
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[]args)
	{
		boolean restartProgram=false;
		String optionYesOrNo=null;
		do
		{
			MachineOuput();
			MachineInputCash();
			MachineInputSelection();
			//Makes change to coin
			System.out.println(total);
			total = total*100;//changes total to int
			int change = (int) total;
			dollar = change/100;
			change = change%100;
			quarter = change/25;
			change = change%25;
			dime = change/10;
			change = change%10;
			nickel = change/5;
			change = change%5;
			penny = change;
			//divides dollars to quarters
			quarter = quarter+((dollar*100)/25);
			OutputChange();
			System.out.println("Do you want to restart? (NO/YES)");
			optionYesOrNo = keyboard.next();
			if (optionYesOrNo.equalsIgnoreCase("Yes"))//restarts program
			{
				amountInserted = 0;//resets variables
				total = 0;
				restartProgram=true;
			}
			else if (optionYesOrNo.equalsIgnoreCase("No"))
				restartProgram=false;
			else
				System.out.println("Invalid input.");
		}while(restartProgram==true);
	}
	private static void MachineOuput() //prints out machine
	{
		System.out.println("1. Dorritos     $1.30");//item1
		System.out.println("2. Snickers     $1.00");//item2
		System.out.println("3. Gum          $0.34");//item3
		System.out.println("4. Sour Patch   $0.85");//item4
		System.out.println("5. Fuirt Snacks $1.55");//item5
		System.out.println("Please input coins or bill."+"   Amount Entered: "+total);
	}
	private static void OutputChange()
	{
		System.out.println("Quarters: "+quarter);//prints out change
		System.out.println("Dimes: "+dime);
		System.out.println("Nickels: "+nickel);
		System.out.println("Pennies: "+penny);
	}
	private static double MachineInputCash()
	{
		double sum=0;
		
		do//inputs coins and bills 
		{
			System.out.println("Press 0 when done entering coins and bills");
			System.out.println("Amount Entered: "+sum);
			amountInserted=keyboard.nextDouble();
			
			if (amountInserted==5||amountInserted==1||amountInserted==0.25||amountInserted==0.10||amountInserted==0.05||amountInserted==0.01)
			{
				sum=amountInserted+sum;
				// from http://stackoverflow.com/questions/5710394/round-double-to-two-decimal-places-in-java/21225595#21225595
				sum=Math.round(sum*100);//brings double to two decimals
				sum=sum/100;
			}
			else if(amountInserted>5)
				System.out.println("Please enter in decimal form at once $5, $1, $0.25, $0.10, $0.05, $0.01");
			else if (amountInserted!=5&&amountInserted!=1&&amountInserted!=0.25&&amountInserted!=0.10&&amountInserted!=0.05)
				System.out.println("Invalid Input please try again.");
		}while (amountInserted!=0||amountInserted==5||amountInserted==1||amountInserted==0.25||amountInserted==0.10||amountInserted==0.05||amountInserted==0.01);
		amountInserted=sum;
		return amountInserted;	
	}
	private static double MachineInputSelection()
	{
		int limit=0;
		total = amountInserted;
		while(limit<4)
		{
			MachineOuput();
			System.out.println("Please select a item. Press 0 to cancel transaction, or -1 to comfirm transaction");
			selection = keyboard.nextInt();
			switch(selection)
			{
			case -1:
				limit=4;
				break;
			case 0:
				double spentMoney = amountInserted-total;
				total = total+spentMoney;
				// from http://stackoverflow.com/questions/5710394/round-double-to-two-decimal-places-in-java/21225595#21225595
				total = Math.round(total*100);//makes double to two decimal places
				total = total/100;
				limit=4;
				break;
			case 1:
				System.out.println("Item selcted");
				if (total>=item1)
				{
					total = total-item1;
					// from http://stackoverflow.com/questions/5710394/round-double-to-two-decimal-places-in-java/21225595#21225595
					total = Math.round(total*100);//makes double to two decimal places
					total = total/100;
					limit++;
				}
				else if (total<item1)
					System.out.println("Transaction failed");
				break;
			case 2:
				System.out.println("Item selcted");
				if (total>=item2)
				{
					total = total-item2;
					// from http://stackoverflow.com/questions/5710394/round-double-to-two-decimal-places-in-java/21225595#21225595
					total = Math.round(total*100);//makes double to two decimal places
					total = total/100;
					limit++;
				}
				else if (total<item2)
					System.out.println("Transaction failed");
				break;
			case 3:
				System.out.println("Item selcted");
				if (total>=item3)
				{
					total = total-item3;
					// from http://stackoverflow.com/questions/5710394/round-double-to-two-decimal-places-in-java/21225595#21225595
					total = Math.round(total*100);//makes double to two decimal places
					total = total/100;
					limit++;
				}
				else if (total<item3)
					System.out.println("Transaction failed");
				break;
			case 4:
				System.out.println("Item selcted");
				if (total>=item4)
				{
					total = total-item4;
					// from http://stackoverflow.com/questions/5710394/round-double-to-two-decimal-places-in-java/21225595#21225595
					total = Math.round(total*100);//makes double to two decimal places
					total = total/100;
					limit++;
				}
				else if (total<item4)
					System.out.println("Transaction failed");
				break;
			case 5:
				System.out.println("Item selcted");
				if (total>=item5)
				{
					total = total-item5;
					// from http://stackoverflow.com/questions/5710394/round-double-to-two-decimal-places-in-java/21225595#21225595
					total = Math.round(total*100);//makes double to two decimal places
					total = total/100;
					limit++;
				}
				else if (total<item5)
					System.out.println("Transaction failed");
				break;
			}
		}
		return total;
	}
	//Getters and setters
	public int getSelection() {
		return selection;
	}
	public void setSelection(int selection) {
		this.selection = selection;
	}
	public int getDollar() {
		return dollar;
	}
	public void setDollar(int dollar) {
		this.dollar = dollar;
	}
	public int getQuarter() {
		return quarter;
	}
	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}
	public int getDime() {
		return dime;
	}
	public void setDime(int dime) {
		this.dime = dime;
	}
	public int getNickel() {
		return nickel;
	}
	public void setNickel(int nickel) {
		this.nickel = nickel;
	}
	public int getPenny() {
		return penny;
	}
	public void setPenny(int penny) {
		this.penny = penny;
	}
	public double getAmountInserted() {
		return amountInserted;
	}
	public void setAmountInserted(double amountInserted) {
		this.amountInserted = amountInserted;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getItem1() {
		return item1;
	}
	public void setItem1(double item1) {
		this.item1 = item1;
	}
	public double getItem2() {
		return item2;
	}
	public void setItem2(double item2) {
		this.item2 = item2;
	}
	public double getItem3() {
		return item3;
	}
	public void setItem3(double item3) {
		this.item3 = item3;
	}
	public double getItem4() {
		return item4;
	}
	public void setItem4(double item4) {
		this.item4 = item4;
	}
	public double getItem5() {
		return item5;
	}
	public void setItem5(double item5) {
		this.item5 = item5;
	}
	
}

