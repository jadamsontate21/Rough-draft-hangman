import java.util.Scanner;
public class hangman1 {
    
    public static void main(String[] args) {
        System.out.println("The game has begun"); // first thing player sees

        //next line I will create an array of words for my small word bank

       
        String[] wordchoices = new String[] { "shoes", "cinnamon", "flowers", "cat", "star", "applesauce", "granola", "water", "fan", "computer", "mall", "movie"};
// I am hoping to create a 2 player game for the final where the opposing player can type in their own word
// for now I am using a small word bank and it is one player 

String randomword = wordchoices[(int) (Math.random() * wordchoices.length)]; // gives you a random word from the array
char[] letters = new char[randomword.length()];

       
        int livesleft = 8; // amount of guesses based on the body I will create with characters
        //  0
        // /|\\
        //_/ \_     this is the body I am hoping to have

        Scanner scanner = new Scanner(System.in);

        while (livesleft > 0) {
            System.out.println("your lives left: "); // these two lines are to show amount of x's left as long as the player hasn't failed yet

            for (int i = 0; i < livesleft; i++) {
                System.out.println("x"); // using x for lives for rough draft instead of body because I'm still working on that
            }
            System.out.println();
            System.out.println("guess your letter: "); // message asking for input
            String input = scanner.nextLine();

            for (int i = 0; i < letters.length; i++) {
                System.out.println(letters[i]);
            }
            System.out.println();

        }

    }
}
// I still need to create the body
// I also need to make this a two player game without a word bank
// I need to take away an x when the person is incorrect (it will be adding a body part)
// I also need messages for winning or failure depending on how the player does
// this is a very rough/basic draft of my final project but it's a start and I tried to explain what I've done so far