package lesson3.finalenum;

import java.util.Scanner;
enum Month {JAN, FEB, MAR, APR, MAY, JUN,
	JUL, AUG, SEP, OCT, NOV, DEC};

public class EnumDemo1 {
	public static void main(String[] args) {
		// values() returns an array containing all the values
		// of the enum in the order they are declared
		for (Month mon : Month.values()) {
			System.out.println("Month Name : " + mon.name() + " and position :" + mon.ordinal());
		}
	}
}
		
				
		