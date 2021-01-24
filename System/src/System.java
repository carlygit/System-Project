/*version 07.06.2020 
 * Algorithms and Data Structures Assessment (Part B)
 * Class name: System
 */

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner; 

public class System {
	
	/*Attributes listed below. Encapsulation used to conceal variables within this class.
	 * This means that if another variable with the same name was created in another class, the System would never confuse the two instances).
	 */
	private String make = "HP";
	private String model = "Pavilion";
	private int speed = 3; //GHz
	private int MB = 16000; //Memory size
	private double GB = 1000; //Hard Disk size
	private double purchaseCost = 999.99; //£GBP
	private boolean goodMemory = true;
	
	Scanner scanner =new Scanner(java.lang.System.in);


	//Class constructor
	public System (String makeIn, String modelIn, int speed) {
			
		this.make = makeIn;
		this.model = modelIn;
		this.speed = speed;
	}

	//Getters and Setters - For each instance variable, the getter method will return the value whilst the setter method updates the value.
	public void setMemory () 
	{
             
		java.lang.System.out.println("Please set the system memory.");
		this.MB = scanner.nextInt();
		java.lang.System.out.println();
		
		while (MB <= 0 || MB > 16000) {
            java.lang.System.out.println("Size out of range");
            
            //If the user inputs 0 or more than 16000, the prompt will show "Size out of range".
            java.lang.System.out.println ("Enter a valid number in range 0 to 16000"); 
            MB = scanner.nextInt();
            java.lang.System.out.println();
        }
		
	}
        
	public void setHardDisk () 
	{
		
		java.lang.System.out.println("Now set the Hard Disk.");
		this.GB = scanner.nextDouble();
		java.lang.System.out.println();
		
		while (GB <= 0 || GB > 1000) {
            java.lang.System.out.println("Size out of range");
            
            //If the user inputs a number less than 0 or more than 1000, the prompt will show "Size out of range".
            java.lang.System.out.println ("Enter a valid number in range 0 to 1000"); 
            GB = scanner.nextInt();
            java.lang.System.out.println();
		}
	}
	
	public void setPurchaseCost (double costIn) 
	{
		
	 costIn +=  purchaseCost;
	 java.lang.System.out.println("Now set the Purchase Cost (GBP).");
		costIn = scanner.nextDouble();
		java.lang.System.out.println("You have now set the purchase cost to £"+costIn+ "\n");
		
		while (costIn <= 0 || costIn == 0) {
            java.lang.System.out.println("Please enter an amount above zero."); 
            costIn  = scanner.nextDouble();
		}
	}
	
	public String getMake (String makeIn) 
	{
		make = makeIn;
		
		makeIn = scanner.nextLine();
		java.lang.System.out.println("Enter your system make.");
		makeIn = scanner.nextLine();
		java.lang.System.out.println("Make = "+makeIn);
		java.lang.System.out.println("Press ENTER to continue.");
	
		while (scanner.hasNextLine() == false) {
			java.lang.System.out.println("\"Please enter a value.\"");
			//If the user inputs no value, the system will prompt "Please enter a value.".
			makeIn = scanner.nextLine(); }
		return makeIn;
		
	}

	public String getModel (String modelIn) 
	{
		model = modelIn;
		
		modelIn = scanner.nextLine();
		java.lang.System.out.println("Enter your system model.");
		modelIn = scanner.nextLine();
		java.lang.System.out.println("Model = "+modelIn);
		java.lang.System.out.println("Press ENTER to continue.");
	
		while (scanner.hasNextLine() == false) {
			java.lang.System.out.println("\"Please enter a value.\"");
			//If the user inputs no value, the system will prompt "Please enter a value.".
			modelIn = scanner.nextLine(); }
		return modelIn;
	}
	
	public int getProcessorSpeed ()
	{
		return speed;
	}
	
	public String displayDetails ()
	{
		java.lang.System.out.println("***System details***");
		java.lang.System.out.println("Your system make is " + (make) + (". Your system model is ") + (model) + ("."));
		java.lang.System.out.println("Your processor speed is " + getProcessorSpeed() + ("GHz") + (" with ") + MB + (" MB of Memory and ") + GB + (" GB of Hard Drive space."));
		return (make + model + speed);
	}
	
	public String checkHDStatus ()
	{
		java.lang.System.out.println();
		java.lang.System.out.println("***Check Hard Drive Status***.");
		
		if(GB >2) 
			java.lang.System.out.println("Hard disk status is OK." + "\n");//Added print statement as return does not return any output without it.
		//If the hard disk size is above 2GB, the system will return "Hard disk status is OK".
		
		else if (GB < 2)  {
			java.lang.System.out.println("Hard disk status is LOW.");//Added print statement as return does not return any output without it.
		//If the hard disk size is below 2GB, the system will return "Hard disk status is LOW"
	
		java.lang.System.out.println("End of Hard Drive status check" + "\n"); 
	}	
		return "End of Hard Drive Status Check"+ "\n"; 
		
	}
	
	public boolean goodMemorySize ()
	{
		java.lang.System.out.println("***Good Memory Size Check***.");
		if (this.MB > 128)//If the hard disk size is above 128GB
			java.lang.System.out.println(goodMemory);
		
		else 
		java.lang.System.out.println(false + "\n");	//Added print statement as return does not return any output without it.
	{
		return false;
			}
	}
	
	public String diagnoseSystem ()
	{
		java.lang.System.out.println("\n" + "***Diagnose System***.");
		return (checkHDStatus()) + (goodMemorySize());
	}
	
	public static void displaySystemProperties() {
		String osName = java.lang.System.getProperty("os.name");
		
		if (osName.contains("Windows 10")) {
		java.lang.System.out.println("Your Operating system is the best and you know it!" + "\n");
	
		} else if (osName.contains("Linux")) {
		java.lang.System.out.println("Your Operating system sucks!" + "\n");
		
		} else {
		java.lang.System.out.println("Your Operating system is average, but not the best!" + "\n"); 
		
		}
	}
	//Part C - Textual menu
		private void printHeader() {
			
			java.lang.System.out.println("+---------------------------------------------------+");
			java.lang.System.out.println("|                                                   |");
			java.lang.System.out.println("|             System Properties Menu                |");
			java.lang.System.out.println("|                                                   |");
			java.lang.System.out.println("+---------------------------------------------------+");
		}
		
		private void printSystemMenu() {
			
			java.lang.System.out.println("\n" + "Please choose from the following options: ");
			java.lang.System.out.println("Choice 1) Print System Details");
			java.lang.System.out.println("Choice 2) Display System Properties");
			java.lang.System.out.println("Choice 3) Diagnose System");
			java.lang.System.out.println("Choice 4) Set Details");
			java.lang.System.out.println("Choice 5) Quit the program");
			
			}
		
		boolean exit = false;

		public void getChoice(int choice) throws Exception {
			
			switch(choice) {
				case 1:
					displayDetails();
					break;
					
				case 2:
					//Part B - System Properties
					java.lang.System.out.println("\n" + "***System properties***" + "\n");
					FileInputStream propFile = new FileInputStream ("/Library/Java/JavaVirtualMachines/myProperties.txt");
					Properties p = new Properties(java.lang.System.getProperties());
					
					//set system properties
					java.lang.System.setProperties(p);
					
			        //display new properties
			        java.lang.System.getProperties().list(java.lang.System.out);
					p.load(propFile);
					break;
					
				case 3:
					diagnoseSystem();
					break;
					
				case 4: 
					setMemory();setHardDisk();
					break;
					
				case 5:
					java.lang.System.exit(0);
					break;
			
				default:
					java.lang.System.out.println("An unknown error has occurred.");
					
			} while (exit);
				java.lang.System.out.println("\n" + "Have a nice day!");
			
		}

		private int choiceIn() {
		@SuppressWarnings("resource")
		java.util.Scanner scanner = new Scanner(java.lang.System.in);
			int choice = 0;
			while(choice < 1 || choice > 5) /*While loop will only move on and show the menu if a choice between 1 and 5 is selected. Any number that is out of bounds will
				cause the loop to continue until the correct range is entered. */
				try {
					java.lang.System.out.println("\n" + "Select a choice between 1 and 5.");
					choice = Integer.parseInt(scanner.nextLine());
				}
				catch(NumberFormatException e) { //NumberFormatException to throw a message when a String is entered instead of a numerical choice.
					java.lang.System.out.println("Your selection is invalid, please select a numerical option between 1 and 5.");
				}
			
			return (choice);
			
		}

		public void runMenu() throws Exception 
		{
			
			printHeader();
			while (!exit) {
				printSystemMenu();
				int choice = choiceIn();
				getChoice(choice);
			
			}
		}
	}