/*version 07.06.2020 
 * Algorithms and Data Structures Assessment (Part B)
 * Class name: SystemTest
 */

import java.awt.event.ActionEvent;

public class SystemTest {

	private static final double costIn = 0;
	private static ActionEvent e;
	public static void main(String[] args) throws Exception {
		
		System s = new System("HP","Pavilion", 3); //s = new HP Pavilion system with and integer value for processor speed in GHz.
		System m = new System("HP","Pavilion", 3); 
		SystemTestGUI gui = new SystemTestGUI();
				
		//Part A - New System Project with Methods
		s.setMemory();
		s.setHardDisk();
		s.setPurchaseCost(costIn);
		s.displayDetails();
		s.checkHDStatus();
		s.goodMemorySize();
		s.diagnoseSystem();

		//Part B - System Properties (Code embedded into System Class under getChoice method with constructor.
		
		//Part C - Access Textual menu (runMenu method).
		m.runMenu();
		
		//Part D - SystemTestGUI
		gui.actionPerformed(e);
					
		}
		
	}
	