package Recursion;

public class rec {
	
	 private static void recurse(int i) {
	        try {
		    recurse(i+1);
		} catch (java.lang.StackOverflowError e) {
		    System.out.print("Recursion depth on this system is " + i + ".");
		}
	    }
	 
	    public static void main(String[] args) {
	        recurse(0);
	    }
	}
	 

