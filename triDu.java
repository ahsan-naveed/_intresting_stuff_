import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.util.LinkedList;

public class triDu{
	public static void main(String[] args){
		// 3 of a kind wins over a pair
		int card_1 = Integer.parseInt(args[0]);
		int card_2 = Integer.parseInt(args[1]);
		if (card_1==card_2 || card_1 > card_2){
			System.out.println(card_1);
		}else if (card_1 < card_2){
			System.out.println(card_2);
		}

		// printing stars
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of lines:");
		// default value is 0
		int in = 0;
		in = Integer.parseInt(scanner.nextLine());
		int count = 0;
		while(in >= 0){
			for(int i=0; i<count; i++){
				System.out.print("@");
			}
			System.out.println();
			count++;
			in--;
		}


		// iterator
		Collection collection = Arrays.asList("violet", "indigo", "blue", "green",
			"yellow", "orange", "red");
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		// ArrayList
		String[] platforms = {"PS4"};
		String[] platforms2 = {"3DS", "Wii U"};
		VideoGame game1 = new VideoGame("LOZ", "E", 2017, platforms2);
		VideoGame game2 = new VideoGame("Pokemon", "E", 2016, platforms2);
		VideoGame game3 = new VideoGame("COD", "E", 2012, platforms);
		ArrayList<VideoGame> games = new ArrayList<>();
		games.add(game1);
		games.add(game2);
		games.add(0, game3);

		// LinkedList
		LinkedList num1 = new LinkedList();
		num1.add(2);
		num1.add(1);
		num1.add(6);
		num1.add(1, 0);
		
		LinkedList num2 = new LinkedList();
		num2.add(2);
		num2.add(1);
		num2.add(6);	

		LinkedList lgNum = num1.size() > num2.size() ? num1 : num2;
		LinkedList smNum = num1.size() < num2.size() ? num1 : num2;

		// prepend zeros on small Number so that smNum.size() == lgNum.size()
		int num_of_zeros = lgNum.size() - smNum.size();
		for(int i=0; i<num_of_zeros; i++){
			smNum.add(0, 0);
		}

		ListIterator iter = smNum.listIterator(smNum.size());
		System.out.println(lgNum.getFirst()+smNum.getFirst());

	}
}