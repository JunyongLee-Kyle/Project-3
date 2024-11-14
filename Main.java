import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Arrays;
import java.util.Scanner;

class Main {
   public static void main(String args[]) throws Exception {
     Scanner scanner = new Scanner(System.in);
      Scanner sc = new Scanner(new BufferedReader(new FileReader("ShipPositionsPlayerOne.txt")));
      int rows = 10;
      int columns = 14;
      String [][] myArray = new String[rows][columns];
      while(sc.hasNextLine()) {
         for (int i=0; i<myArray.length; i++) {
            String line = sc.nextLine().trim();
            
            for (int j=0; j<line.length(); j++) {
               myArray[i][j] = String.valueOf(line.charAt(j));
            }
         }
      }
      System.out.println(Arrays.deepToString(myArray));
      System.out.println(myArray[2][3]);


     Scanner sc2 = new Scanner(new BufferedReader(new FileReader("ShipPositionsPlayerTwo.txt")));
       int rows1 = 10;
       int columns1 = 14;
       String [][] myArray2 = new String[rows1][columns1];
       while(sc2.hasNextLine()) {
          for (int i=0; i<myArray2.length; i++) {
             String line2 = sc2.nextLine().trim();
            
             for (int j=0; j<line2.length(); j++) {
                myArray2[i][j] = String.valueOf(line2.charAt(j));
             }
          }
       }
       System.out.println(Arrays.deepToString(myArray2));
       System.out.println(myArray2[2][13]);
     String guess = scanner.nextLine();
			
			// ensure input is upper case
			guess = guess.toUpperCase();
			//System.out.println(guess);
			
			char charInput = guess.charAt(0); 
     int coord1 = getNumber(charInput);

       
   }
  public int getNumber(char input) {
		int row = 1;
		
		switch(input){
		case 'A':
			row = 1;
			break;
		case 'B':
			row = 2;
			break;
		case 'C':
			row = 3;
			break;
		case 'D':
			row = 4;
			break;
		case 'E':
			row = 5;
			break;
		case 'F':
			row = 6;
			break;
		case 'G':
			row = 7;
			break;
		case 'H':
			row = 8;
			break;
		case 'I':
			row = 9;
			break;
		case 'J':
			row = 10;
			break;
		case 'K':
			row = 11;
			break;
		case 'L':
			row = 12;
			break;
		case 'M' :
			row = 13;
			break;
		case 'N':
			row = 14;
			break;
		case 'O':
			row = 15;
			break;
		case 'P':
			row = 16;
			break;
		case 'Q':
			row = 17;
			break;
		case 'R':
			row = 18;
			break;
		case 'S' :
			row = 19;
			break;
		case 'T':
			row = 20;
			break;
		case 'U':
			row = 21;
			break;
		case 'V':
			row = 22;
			break;
		case 'W':
			row = 23;
			break;
		case 'X':
			row = 24;
			break;
		case 'Y' :
			row = 25;
			break;
		case 'Z' :
			row = 26;
			break;
		
		}
		
		
		return row;
}

 
}