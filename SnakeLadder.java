import java.util.Random;
class SnakeLadder
{
public static void main(String args[])
{
System.out.println("Welcome to Snake ladder game");
int Start_Position=0;
int PlayerPosition=0;

while (PlayerPosition <= 100)
{
Random rand=new Random();
int dice=(rand.nextInt(6))+1;

Random ran=new Random();
int playcheck=ran.nextInt(3);

switch(playcheck)
{
case 0:
			PlayerPosition = PlayerPosition;
			System.out.println("You can't play.");
			break;
case 1:
			PlayerPosition = dice + PlayerPosition;
			System.out.println("You got ladder,you moved by " +dice+ "position");
			break;
case 2:
			PlayerPosition = PlayerPosition - dice;
			System.out.println("ooo You are bitten by snake");
			break;
default:
			System.out.println("Invalid option"); 
}
if(PlayerPosition < 0)
{
		PlayerPosition=Start_Position;
}
}
System.out.println("Player wins");
}
}

