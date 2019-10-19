import java.util.Scanner;

public class bruh {
    public static void main(String[] agrs) {
        System.out.println("1.Play \n2.Exit\n3.play the room you want");
        // press 1 to play, press 2 to exit
        boolean invalid = true;
        while (invalid == true) {
            int choice;
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("spawn in room 4,\n" +
                        "   in order to win the game, you have to have a key to the entrance door.\n");

                System.out.println(" BIG WARNNING !!!");
                System.out.println("please choose a valid choices. most of the choices being chosen by pressing number."+
                        " If you type a word, the program will end immediately and you have to play all over again.");
                System.out.println("-There are some sounds (remember to turn on the volume), and images in the game. Remember to press the X button to close the image in order to continue the program");
                System.out.println("\n\n                            BEGIN                                   ");
                Attic.Attic();
                break;
                //this statement will call to class Attic when press 1.
            }
            else if (choice == 2) {
                System.exit(0);
                break;
                //this statement will end program when press 2
            }
            else if (choice == 3){
                Incase.incase();
            }
            else {
                System.out.println("choose again. 1, 2 or 3");
                invalid = true;
                //invalid input loop
            }
        }
    }
}
