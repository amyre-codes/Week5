package LastDay;

import java.util.Scanner;

public class Pink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner code = new Scanner(System.in);
		int tokens = 10;
		String name = "";
		String golf = "play mini golf 8 tokens ";
		String toss = "play soda toss 5 tokens";
		String down = "knock down 3 tokens";
		String paint = "to get your face painted is 15 tokens";
		String bouncehouse = "to get in the bounce house it's FREE";
		String ring  = "to play ring toss it is 20 tokens";
		String Darts = "to play darts it is 35 tokens";
		String bingo = "to play bingo it is 40 tokens";
		String tank = "to play dunk tank it is 30 tokens";
		String candy = "";
		System.out.println("Welcome To Marathon Carnival");
	
		
		System.out.println("age limit");
		for (int x = 10; x <= 40; x++) {
			System.out.println(x);
		}
			System.out.println("enter your name");
		name = code.next();

		System.out.println("How many tokens do you have " + name);
		tokens = code.nextInt();

		if (tokens <= 50) {
			System.out.println("these are your choices ");
			System.out.println(golf);
			System.out.println(toss);
			System.out.println(down);
			System.out.println(paint);
			System.out.println(bouncehouse);

		} if( tokens >=50) {
			System.out.println("these are your choices");
			System.out.println(ring );
			System.out.println(Darts);
			System.out.println(bingo);
			System.out.println(tank);
			System.out.println(bouncehouse);
		}
		
		System.out.println("so which one do you choose?");
		code.next();
		
		System.out.println("thank you for coming " + name);
		
		
			
		}
		
	}
	

