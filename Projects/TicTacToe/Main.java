import java.util.Scanner;

class Main {
	String[][] board = {{"_|", "_|", "_|"}, {"_|", "_|", "_|"}, {"_|", "_|", "_|"}};
	int count = 0;
	
	public Main() {
		game();
	}

	public void game() {
		while(true) {
			int p1 = takeInput(1);
			boolean playerPlaced = placePlayer(1, p1);
			while(playerPlaced == false) {
				System.out.println("Place already occupied. Choose another");
				p1 = takeInput(1);
				playerPlaced = placePlayer(1, p1);
			}
			
			printBoard();
			int winner_player = win();

			if(winner_player != -1)
			{
				if(winner_player == 1)
				{
					System.out.println("Player 1 won!!!");
					break;
				}
				else {
					System.out.println("Player 2 won!!!");
					break;
				}
			}
			
			
			count++;
			if(draw()) {
				System.out.println("Draw!!! No one won.");
				break;
			}	
			
			int p2 = takeInput(2);
			playerPlaced = placePlayer(2, p2);
			while(playerPlaced == false) {
				System.out.println("Place already occupied. Choose another");
				p2 = takeInput(2);
				playerPlaced = placePlayer(2, p2);
			}
			
			printBoard();

			winner_player = win();

			if(winner_player != -1)
			{
				if(winner_player == 1)
				{
					System.out.println("Player 1 won!!!");
					break;
				}
				else {
					System.out.println("Player 2 won!!!");
					break;
				}
			}
				
			count++;
			if(draw()) {
				System.out.println("Draw!!! No one won.");
			}
		}
	}

	public boolean isOutOfBound(int position) {
		if(position < 1 || position > 9) {
			return true;
		}
		return false;
	}

	public int takeInput(int player) {
		Scanner sc = new Scanner(System.in);
		if(player == 1) {
			System.out.print("Playe 1 choose a place from 1-9: ");
		} 
		else {
			System.out.print("Player 2 choose a place from 1-9: ");
		}

		int place = sc.nextInt();
		sc.nextLine();

		while(isOutOfBound(place) == true) {
			System.out.println("Place out of board. Pleace choose from 1-9: ");
			place = sc.nextInt();
			sc.nextLine();
		}
		
		return place;
	}

	public boolean placePlayer(int player, int position) {
		int[] positions = findPosition(position);
		int i = positions[0];
		int j = positions[1];

		if(board[i][j] == "_|") {
			if(player == 1) {
				board[i][j] = "X|";
			}
			else {
				board[i][j] = "O|";
			}
			
			return true;	
		}
		else {
			return false;
		}
		
	}

	public int[] findPosition(int position) {
		int[] positions = new int[2];
		
		if(position <= 3) {
			positions[0] = 0;
			positions[1] = position - 1;
		}

		else if(position <= 6) {
			positions[0] = 1;
			positions[1] = position - 4;
		}
		else if(position <= 9) {
			positions[0] = 2;
			positions[1] = position - 7; 
		}

		return positions;
			
	}

	public boolean draw() {
		if(count >= 9) {
			return true;
		}	
		return false;
	}

	public int win() {

		//vertical matching
		if(!board[0][0].equals("_|") && 
		   board[0][0].equals(board[0][1]) && 
		   board[0][0].equals(board[0][2])) {
			return winner(board[0][0]);
		}

		else if(!board[1][0].equals("_|") && 
		   board[1][0].equals(board[1][1]) && 
		   board[1][0].equals(board[1][2])) {
			return winner(board[1][0]);
		}

		else if(!board[2][0].equals("_|") && 
		   board[2][0].equals(board[2][1]) && 
		   board[2][0].equals(board[2][2])) {
			return winner(board[2][0]);
		}
	
		//horizanta matching
		else if(!board[0][0].equals("_|") && 
		   board[0][0].equals(board[1][0]) && 
		   board[0][0].equals(board[2][0])) {
			return winner(board[0][0]);
		}

		else if(!board[0][1].equals("_|") && 
		   board[0][1].equals(board[1][1]) && 
		   board[0][1].equals(board[2][1])) {
			return winner(board[0][1]);
		}

		else if(!board[0][2].equals("_|") && 
		   board[0][2].equals(board[1][2]) && 
		   board[0][2].equals(board[2][2])) {
			return winner(board[0][2]);
		}

		//diagonally
		else if(!board[0][0].equals("_|") && 
		   board[0][0].equals(board[1][1]) && 
		   board[0][0].equals(board[2][2])) {
			return winner(board[0][0]);
		}

		else if(!board[0][2].equals("_|") && 
		   board[0][2].equals(board[1][1]) && 
		   board[0][2].equals(board[2][0])) {
			return winner(board[0][2]);
		}
			
		else {
			return -1;	 
		 }
	}

	public int winner(String player) {
		if(player.equals("X|")) {
			return 1;
		}
		else {
			return 2;
		}
		
	}

	public void printBoard() {
		System.out.println();
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.printf("%n");
		}
		System.out.println();
	}

	
	
  	public static void main(String[] args) {
		Main myGame = new Main();
  	}
}