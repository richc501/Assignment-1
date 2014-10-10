//Richard Cunningham
//Consider the problem, design an algorithm (or algorithms) that would solve the problem, and then implement the algorithm in Java.
//Please insert the algorithm written in pseudocode as a comment in the beginning of your program.
//Submit the source code, along with snapshots of your running program - you can take snapshots using PrintScreen, making sure that the console window in which you run the program appears on the screen.
//Copy the snapshot in a word processing program of your choosing. If your program has different outcomes, take snapshots of each variation.
//Upload your screenshots in Blackboard using the Assignment Upload area below.

//define current hardware then display;
//prompt user for upgrades on each part
//Make user select different Upgrades
import java.util.Scanner;
public class ComputerConfiguration 
{
	public static Scanner keyboard = new Scanner(System.in);
	//current build
	private static String currentCPU = "AMD FX 8350";
	private static String currentGPU = "EVGA GeForce GTX 780 3GB";
	private static String currentRam = "16GB - G.SKILL Sniper 8GB(2x4GB)";
	private static String currentHardDisk = "Western Digital Blue 500GB HDD";
	private static String currentAudio = "Realtek ALC887";
	//upgrade parts
	private static String betterCPU = "";
	private static String betterGPU = "";
	private static String betterRam = "";
	private static String betterHardDisk = "";
	private static String betterAudio = "";
	private static int upgrade, amountOfRamGB, amountOfRamCards;
	public static double cpuUpgradePrice, gpuUpgradePrice, ramUpgradePrice, hardDiskUpgradePrice, audioUpgradePrice;
	public static void main(String[]args)
	{
		boolean computerUpgrade=false;
		DisplayCurrentRig();
		//Prompt User
		System.out.println("Do you want to upgrade your PC?(NO/YES)");
		String optionYesOrNO = keyboard.next();
		if (optionYesOrNO.equalsIgnoreCase("No"))
			System.exit(0);
		else if (optionYesOrNO.equalsIgnoreCase("Yes"))
		{
			upgrade=1;//initializes variable, keeps track of part
			while(computerUpgrade==false)
			{
				switch (upgrade)
				{
				case 1://upgrade 1 CPU
					System.out.println("Do you wish to upgrade your CPU? (NO/YES)");
					optionYesOrNO = keyboard.next();
					if (optionYesOrNO.equalsIgnoreCase("Yes"))
					{
						CPUUpgrade();
						upgrade++;
					}
					else if(optionYesOrNO.equalsIgnoreCase("NO"))//if no moves to next part
					{
						betterCPU=currentCPU;
						cpuUpgradePrice=0;
						upgrade++;
					}
					break;
				case 2://upgrade 2 GPU
					System.out.println("Do you wish to upgrade your GPU? (NO/YES)");
					optionYesOrNO = keyboard.next();
					if (optionYesOrNO.equalsIgnoreCase("Yes"))
					{
						GPUUpgrade();
						upgrade++;
					}
					else if(optionYesOrNO.equalsIgnoreCase("NO"))//if no moves to next part
					{
						betterGPU=currentGPU;
						gpuUpgradePrice=0;
						upgrade++;
					}
					break;
				case 3://upgrade 3 Ram
					System.out.println("Do you wish to upgrade your Ram? (NO/YES)");
					optionYesOrNO = keyboard.next();
					if (optionYesOrNO.equalsIgnoreCase("Yes"))
					{
						RAMUpgrade();
						upgrade++;
					}
					else if(optionYesOrNO.equalsIgnoreCase("NO"))//if no moves to next part
					{
						betterRam=currentRam;
						ramUpgradePrice=0;
						upgrade++;
					}
					break;
				case 4://upgrade 4 hard disk
					System.out.println("Do you wish to upgrade your Hard Disk? (NO/YES)");
					optionYesOrNO = keyboard.next();
					if (optionYesOrNO.equalsIgnoreCase("Yes"))
					{
						HardDiskUpgrade();
						upgrade++;
					}
					else if(optionYesOrNO.equalsIgnoreCase("NO"))//if no moves to next part
					{
						betterHardDisk=currentHardDisk;
						hardDiskUpgradePrice=0;
						upgrade++;
					}
					break;
				case 5://upgrade 5 audio
					System.out.println("Do you wish to upgrade your Audio Card? (NO/YES)");
					optionYesOrNO = keyboard.next();
					if (optionYesOrNO.equalsIgnoreCase("Yes"))
					{
						AudioUpgrade();
						computerUpgrade=true;
					}
					else if(optionYesOrNO.equalsIgnoreCase("NO"))//if no ends loop
					{
						betterAudio=currentAudio;
						audioUpgradePrice=0;
						computerUpgrade=true;
					}
					break;
				default:
					upgrade++;
				}
			}
			PrintUpgradesAndPrices(); 
		}
	}
	//Displays current PC setup
	private static void DisplayCurrentRig() //displays current build
	{
		System.out.println("Processor: "+ currentCPU);
		System.out.println("Video Card: "+currentGPU);
		System.out.println("Ram: "+ currentRam);
		System.out.println("Hard Disk: "+currentHardDisk);
		System.out.println("Auio Card: "+ currentAudio);
	}
	private static void PrintUpgradesAndPrices() //prints upgrades chosen
	{
		System.out.println("Upgraded CPU: "+betterCPU+" Price: "+cpuUpgradePrice);
		System.out.println("Upgraded GPU: "+betterGPU+" Price: "+gpuUpgradePrice);
		System.out.println("Upgraded Ram: "+betterRam+" Price: "+ramUpgradePrice);
		System.out.println("Upgraded Hard Disk: "+betterHardDisk+" Price: "+hardDiskUpgradePrice);
		System.out.println("Upgraded Audio Card: "+betterAudio+" Price: "+audioUpgradePrice);
		double totalUpgradePrice = cpuUpgradePrice+gpuUpgradePrice+ramUpgradePrice+hardDiskUpgradePrice+audioUpgradePrice;
		System.out.println("Total Upgrade Price: "+totalUpgradePrice);
	}
	private static String CPUUpgrade() //provides options for cpu upgrades with prices
	{
		System.out.println("Your CPU Upgrade Options are:");
		System.out.println("1. AMD FX-9590 Vishera-Price: $329.99");
		System.out.println("2. Intel Core i7-4770 Haswell-Price: $309.99");
		System.out.println("3. AMD FX-9370 Vishera-Price: 299.99");
		System.out.println("Please Select better Cpu");
		int upgrade = keyboard.nextInt();
		switch(upgrade)
		{
		case 1:
			betterCPU = "AMD FX-9590";
			cpuUpgradePrice=329.99;
			break;
		case 2:
			betterCPU = "Intel Core i7-4770 Haswell";
			cpuUpgradePrice=309.99;
			break;
		case 3:
			betterCPU = "AMD FX-9370 Vishera";
			cpuUpgradePrice=299.99;
			break;
		}
		return betterCPU;
	}
	private static String GPUUpgrade() //provides options for gpu upgrades with prices
	{
		System.out.println("Your GPU Upgrade Options are:");
		System.out.println("1. EVGA Geforce GTX 780 6GB-Price: $589.99");
		System.out.println("2. EVGA GeForce GTX Ti Superclocked 3GB-Price: $729.99");
		System.out.println("3. EVGA GeForce Titan Black Superclocked 6GB-Price: $1099.99");
		System.out.println("Please Select better Gpu.");
		int upgrade = keyboard.nextInt();
		switch(upgrade)
		{
		case 1:
			betterGPU = "EVGA Geforce GTX 780 6GB";
			gpuUpgradePrice=589.99;
			break;
		case 2:
			betterGPU = "EVGA GeForce GTX Ti Superclocked 3GB";
			gpuUpgradePrice=729.99;
			break;
		case 3:
			betterGPU = "EVGA GeForce Titan Black Superclocked 6GB";
			gpuUpgradePrice=1099.99;
			break;
		}
		return betterGPU;
	}
	private static String RAMUpgrade() //provides options for ram upgrades with prices
	{
		int quanitityOfCardGB=1;
		System.out.println("Your Ram Upgrade Options are:");
		System.out.println("1. G.Skill Ripsaws X 8GB-Price: $81.99(Per card)");
		System.out.println("2. Crucial Ballisstix Tactical 16GB(2x8GB)-Price: $179.99(Per 2 cards)");
		System.out.println("3. Corsair Dominator Platinum 16GB(2x8GB)-Price: $229.99(Per 2 cards)");
		System.out.println("Please Select better Ram.");
		int upgrade = keyboard.nextInt();
		switch(upgrade)
		{
		case 1:
			betterRam = "G.Skill Ripsaws X 8GB";
			quanitityOfCardGB=1*8;
			gpuUpgradePrice=81.99;
			break;
		case 2:
			betterRam = "Crucial Ballisstix Tactical 16GB(2x8GB)";
			quanitityOfCardGB=2*8;
			gpuUpgradePrice=179.99;
			break;
		case 3:
			betterRam = "Corsair Dominator Platinum 16GB(2x8GB)";
			quanitityOfCardGB=2*8;
			gpuUpgradePrice=229.99;
			break;
		}
		System.out.println("How many GB of Ram do you want?");
		do
		{
			amountOfRamGB = keyboard.nextInt();
			if(amountOfRamGB%4!=0)
				System.out.println("Amount of ram must be % by 4.");
		}while(amountOfRamGB%4!=0);
		amountOfRamCards=amountOfRamGB/quanitityOfCardGB;
		ramUpgradePrice=amountOfRamCards*gpuUpgradePrice;

		return betterRam;
	}
	private static String HardDiskUpgrade() //provides options for hard disk upgrades with prices
	{
		System.out.println("Your Hard Disk Upgrade Options are:");
		System.out.println("1. Western Digital Black 2TB HDD-Price: $217.95");
		System.out.println("2. Western Digital Black 4TB HDD-Price: $277.99");
		System.out.println("3. Samsung 840 Pro 512GB SSD-Price: $499.99");
		System.out.println("Please Select better Hard Disk.");
		int upgrade = keyboard.nextInt();
		switch(upgrade)
		{
		case 1:
			betterHardDisk = "Western Digital Black 2TB HDD";
			hardDiskUpgradePrice=217.95;
			break;
		case 2:
			betterHardDisk = "Western Digital Black 4TB HDD";
			hardDiskUpgradePrice=277.99;
			break;
		case 3:
			betterHardDisk = "Samsung 840 Pro 512GB SSD";
			hardDiskUpgradePrice=499.99;
			break;
		}
		return betterHardDisk;
	}
	private static String AudioUpgrade() //provides options for audio upgrades with prices
	{
		System.out.println("Your Hard Disk Upgrade Options are:");
		System.out.println("1. Vantec UGT-S110-Price: $45.99");
		System.out.println("2. Creative Sound Blaster Audigy RX-Price: $58.99");
		System.out.println("3. ASUS Xonar DX-Price: $99.99");
		System.out.println("Please Select better Hard Disk.");
		int upgrade = keyboard.nextInt();
		switch(upgrade)
		{
		case 1:
			betterAudio="Vantec UGT-S110";
			audioUpgradePrice=45.99;
			break;
		case 2:
			betterAudio="Creative Sound Blaster Audigy";
			audioUpgradePrice=58.99;
			break;
		case 3:
			betterAudio="ASUS Xonar DX";
			audioUpgradePrice=99.99;
			break;
		}
		return betterAudio;
	}
	//Getters and Setters
	public String getCurrentCPU() 
	{
		return currentCPU;
	}
	public void setCurrentCPU(String currentCPU) {
		this.currentCPU = currentCPU;
	}

	public String getCurrentGPU() {
		return currentGPU;
	}

	public void setCurrentGPU(String currentGPU) {
		this.currentGPU = currentGPU;
	}

	public String getCurrentRAM() {
		return currentRam;
	}

	public void setCurrentRAM(String currentRAM) {
		this.currentRam = currentRAM;
	}

	public String getCurrentHardDisk() {
		return currentHardDisk;
	}

	public void setCurrentHardDisk(String currentHardDisk) {
		this.currentHardDisk = currentHardDisk;
	}

	public String getCurrentAudio() {
		return currentAudio;
	}

	public void setCurrentAudio(String currentAudio) {
		this.currentAudio = currentAudio;
	}
	public String getBetterCPU() {
		return betterCPU;
	}
	public void setBetterCPU(String betterCPU) {
		this.betterCPU = betterCPU;
	}
	public String getBetterGPU() {
		return betterGPU;
	}
	public void setBetterGPU(String betterGPU) {
		ComputerConfiguration.betterGPU = betterGPU;
	}
	public String getBetterRam() {
		return betterRam;
	}
	public void setBetterRam(String betterRam) {
		this.betterRam = betterRam;
	}
	public String getBetterHardDisk() {
		return betterHardDisk;
	}
	public void setBetterHardDisk(String betterHardDisk) {
		this.betterHardDisk = betterHardDisk;
	}
	public String getBetterAudio() {
		return betterAudio;
	}
	public void setBetterAudio(String betterAudio) {
		this.betterAudio = betterAudio;
	}
	public int getUpgrade() {
		return upgrade;
	}
	public void setUpgrade(int upgrade) {
		this.upgrade = upgrade;
	}
	public double getCpuUpgradePrice() {
		return cpuUpgradePrice;
	}
	public void setCpuUpgradePrice(double cpuUpgradePrice) {
		this.cpuUpgradePrice = cpuUpgradePrice;
	}
	public double getGpuUpgradePrice() {
		return gpuUpgradePrice;
	}
	public void setGpuUpgradePrice(double gpuUpgradePrice) {
		this.gpuUpgradePrice = gpuUpgradePrice;
	}
	public double getRamUpgradePrice() {
		return ramUpgradePrice;
	}
	public void setRamUpgradePrice(double ramUpgradePrice) {
		this.ramUpgradePrice = ramUpgradePrice;
	}
	public double getHardDiskUpgradePrice() {
		return hardDiskUpgradePrice;
	}
	public void setHardDiskUpgradePrice(double hardDiskUpgradePrice) {
		this.hardDiskUpgradePrice = hardDiskUpgradePrice;
	}
	public double getAudioUpgradePrice() {
		return audioUpgradePrice;
	}
	public void setAudioUpgradePrice(double audioUpgradePrice) {
		this.audioUpgradePrice = audioUpgradePrice;
	}
	public String getCurrentRam() {
		return currentRam;
	}
	public void setCurrentRam(String currentRam) {
		this.currentRam = currentRam;
	}
	public int getAmountOfRamGB() {
		return amountOfRamGB;
	}
	public void setAmountOfRamGB(int amountOfRamGB) {
		this.amountOfRamGB = amountOfRamGB;
	}
	public int getAmountOfRamCards() {
		return amountOfRamCards;
	}
	public void setAmountOfRamCards(int amountOfRamCards) {
		this.amountOfRamCards = amountOfRamCards;
	}
}