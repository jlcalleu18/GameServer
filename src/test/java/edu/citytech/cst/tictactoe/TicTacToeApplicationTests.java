package edu.citytech.cst.tictactoe;

import edu.citytech.cst.tictactoe.businessobject.Winner;
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
		String moves = "XNNOXOXNX";
		//data[0]!="N" &&
		//&& data[0]==data[8]

		String data[] = moves.split("");

		if(checkMoves(0,1,2, data)){
			System.out.println("Winner Found");
		}else if(checkMoves(3,4,5, data)){
			System.out.println("Winner Found");
		}else if(checkMoves(6,7,8, data)){
			System.out.println("Winner Found");
		}else if(checkMoves(0,3,6, data)){
			System.out.println("Winner Found");
		}else if(checkMoves(1,4,7, data)){
			System.out.println("Winner Found");
		}else if(checkMoves(2,5,8, data)){
			System.out.println("Winner Found");
		}else if(checkMoves(0,4,8, data)){
			System.out.println("Winner Found");
		}else if(checkMoves(2,4,8, data)){
			System.out.println("Winner Found");
		}else {
			System.out.println("Winner Not Found");
		}

	}
	public static boolean checkMoves (int p1, int p2, int p3, String[] data){
		boolean result;
		if (data[0].equals(data[1]) && data[0].equals(data[3]) && !data[p1].equals("N")){
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
