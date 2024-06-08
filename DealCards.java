import java.util.Random;

class Card {
	
	//Create empty string attributes for constructor
	private String faceValue, suit;
	
	//A constructor that takes numbers and converts them to faceValue and suit using a Setter method
	public Card(int faceNum, int suitNum) {
		setFaceValue(faceNum);
		setSuit(suitNum);
	}
	
	//Setter method using Switch statement to convert number to new string faceValue
	private void setFaceValue(int num) {
		switch(num) {
			case 1:
				faceValue = "Ace";
				break;
			case 2:
				faceValue = "Two";
				break;
			case 3:
				faceValue = "Three";
				break;
			case 4:
				faceValue = "Four";
				break;
			case 5:
				faceValue = "Five";
				break;
			case 6:
				faceValue = "Six";
				break;
			case 7:
				faceValue = "Seven";
				break;
			case 8:
				faceValue = "Eight";
				break;
			case 9:
				faceValue = "Nine";
				break;
			case 10:
				faceValue = "Ten";
				break;
			case 11:
				faceValue = "Jack";
				break;
			case 12:
				faceValue = "Queen";
				break;
			case 13:
				faceValue = "King";
				break;
		}
	}
	
	//Setter method using Switch statement to convert number to new string suit
	private void setSuit(int num) {
		switch(num) {
			case 1:
				suit = "Clubs";
				break;
			case 2:
				suit = "Diamonds";
				break;
			case 3:
				suit = "Hearts";
				break;
			case 4:
				suit = "Spades";
				break;
		}
	}
	
	//Getter method for string suit
	public String getSuit() {
		return suit;
	}
	
	//Getter method for string faceValue
	public String getFaceValue() {
		return faceValue;
	}
	
	//Override toString method to output attribute data as formatted string.
	public String toString() {
		return getFaceValue() + " of " + getSuit();
	}
	
}



//Driver class
public class DealCards {	
	
	public static void main(String[] args) {
		
		//Constants
		final int FaceMax = 13;
		final int SuitMax = 4;
		Random generator = new Random();
		
		
		//Instantiate 5 card objects using random numbers within FaceMax and SuitMax ranges.
		Card card1 = new Card(generator.nextInt(FaceMax) + 1, generator.nextInt(SuitMax) + 1);
		Card card2 = new Card(generator.nextInt(FaceMax) + 1, generator.nextInt(SuitMax) + 1);
		Card card3 = new Card(generator.nextInt(FaceMax) + 1, generator.nextInt(SuitMax) + 1);
		Card card4 = new Card(generator.nextInt(FaceMax) + 1, generator.nextInt(SuitMax) + 1);
		Card card5 = new Card(generator.nextInt(FaceMax) + 1, generator.nextInt(SuitMax) + 1);
		
		//Display data
		System.out.println("Your cards are: ");
		System.out.println(card1 + ", " + card2 + ", " + card3 + ", " + card4 + ", " + card5);	
		
	}

}
