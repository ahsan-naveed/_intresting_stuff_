import java.util.*;
import java.util.stream.*;
import java.io.*;

public class fileIO{
	public static void main(String[] args){
		try{
			File inFile = new File("input.txt");
			Scanner input = new Scanner(inFile);
			String answer = "";
			while(!answer.equals("testing")){
				answer = input.nextLine();
				System.out.println(answer);
            }
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
