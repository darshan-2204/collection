package com.xworkz.collection.tester;

import com.xworkz.collection.constants.MachineType;
import com.xworkz.collection.constraints.Machine;

public class MachineTester {

	public static void main(String[] args) {
		
		Machine mac1=new Machine("Lathe", "Om International Machine Tools", 8, 2d, MachineType.MANUAL, true);
		Machine mac2=new Machine("Lathe", "Darshan Machine Tools", 8, 2.5d, MachineType.MANUAL, true);
		Machine mac3=new Machine("Lathe", "Ganesh Machine Tools", 8, 3d, MachineType.MANUAL, true);
		
		
	}

}
