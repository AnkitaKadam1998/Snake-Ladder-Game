import java.util.Random;

public class SnakeLadder
{
	public static void main(String args[])
	{	
	
		System.out.println("Welcome to snake and ladder game!");
		
		
		int player1StartPoint = 0, player2StartPoint = 0;

		int player1Position = 0, player2Position = 0, player1PreviousPoint = 0, player2PreviousPoint = 0, dice1Count = 0, dice2Count = 0;

		
		while ((player1Position <= 100) && (player2Position <= 100)) {

			
      	Random rand1 = new Random();
      	int dice1Roll = (rand1.nextInt(6))+1;
			dice1Count = dice1Count + 1;

			
         Random rand2 = new Random();
         int dice2Roll = (rand2.nextInt(6))+1;
         dice2Count = dice2Count + 1;

      	Random ran1 = new Random();
      	int playCheck1 = ran1.nextInt(3);

         Random ran2 = new Random();
         int playCheck2 = ran2.nextInt(3);
	
			player1PreviousPoint = player1Position;
			player2PreviousPoint = player2Position;
			 
			switch (playCheck1) {
				case 0:
					player1Position = player1Position;
					break;

				case 1:
					player1Position = dice1Roll + player1Position;
					
					Random random1 = new Random();
         		int extraDice1 = (random1.nextInt(6))+1;
         		dice1Count = dice1Count + 1;
				
					player1Position = player1Position + extraDice1; 				

					break;
			
				case 2:
					player1Position = player1Position - dice1Roll;
					break;
			
				default:
					System.out.println("Invalid Option");

			}
         switch (playCheck2) {
            case 0:
               player2Position = player2Position;
               break;

            case 1:
               player2Position = dice2Roll + player2Position;
      			
					Random random2 = new Random();
               int extraDice2 = (random2.nextInt(6))+1;
               dice2Count = dice2Count + 1;

               player2Position = player2Position + extraDice2;         
		
					break;

            case 2:
               player2Position = player2Position - dice2Roll;
               break;

            default:
               System.out.println("Invalid Option");

         }
								
			if (player1Position < 0){
				player1Position = player1StartPoint;
			}else if (player1Position > 100){
				player1Position = player1Position - player1PreviousPoint;
			}else if (player1Position == 100){
				break;
			}

			if (player2Position < 0){
            player2Position = player2StartPoint;
         }else if (player2Position > 100){
            player2Position = player2Position - player2PreviousPoint;
         }else if (player2Position == 100){
            break;
         }

		}
	
		if(player1Position == 100){
		System.out.println("Player 1 wins!, Game Over.");
		} else if (player2Position == 100){
		System.out.println("Player 2 wins!, Gamer Over.");
		}
	}
}

