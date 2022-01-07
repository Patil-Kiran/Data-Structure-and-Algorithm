package com.app.Recursion;

public class TowerOfHonoi {

	
	public static void towerOfHonoi(int disks,char fromRod,char toRod,char auxRod) {
		if(disks==1) {
			System.out.println("Moving Disk1 from "+fromRod+" to the "+toRod+" rod.");
		}else {
			towerOfHonoi(disks-1, fromRod, auxRod, toRod);
			System.out.println("Moving Disk"+disks+" from "+fromRod+" to the "+toRod+" rod.");
			towerOfHonoi(disks-1, auxRod, toRod, fromRod);
		}
		
	}
	public static void main(String[] args) {
		towerOfHonoi(4, 'X', 'Y', 'Z');
	}

}
