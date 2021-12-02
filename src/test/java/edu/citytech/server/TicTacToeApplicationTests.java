package edu.citytech.server;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TicTacToeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("For Loop.....Standard code vs Functional code")
	void e01(){
		System.out.println("Welcome Unit testing");
//			var g = new Winner().getWinnerStatus("hdfhdj3");
//			System.out.println(g.toString());
		String moves = "hello273";

	}

	@Test
	@DisplayName("check numbers")
	void e02(){
		String moves = "XNNNNNNNN";


		String data[] = moves.split("");


		if(data[0].equals(data[1]) && data[0].equals(data[2]) && !data[0].equals("N")){
			System.out.println("Winner Found");
		}else if(data[3].equals(data[4]) && data[3].equals(data[5]) && !data[3].equals("N")){
			System.out.println("Winner Found");
		}else if(data[6].equals(data[7]) && data[6].equals(data[8]) && !data[6].equals("N")){
			System.out.println("Winner Found");
		}else if(data[0].equals(data[3]) && data[0].equals(data[2]) && !data[0].equals("N")){
			System.out.println("Winner Found");
		}else if(data[0].equals(data[1]) && data[0].equals(data[2]) && !data[0].equals("N")){
			System.out.println("Winner Found");
		}else if(data[0].equals(data[1]) && data[0].equals(data[2]) && !data[0].equals("N")){
			System.out.println("Winner Found");
		}else if(data[0].equals(data[1]) && data[0].equals(data[2]) && !data[0].equals("N")){
			System.out.println("Winner Found");
		}else if(data[0].equals(data[1]) && data[0].equals(data[2]) && !data[0].equals("N")){
			System.out.println("Winner Found");
		}else {
			System.out.println("Winner Not Found");
		}

	}
	public static boolean checkMoves (int p1, int p2, int p3, String[] data){
		boolean result;
		if (data[p1].equals(data[p2]) && data[p1].equals(data[p3]) && !data[p1].equals("N")){
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
