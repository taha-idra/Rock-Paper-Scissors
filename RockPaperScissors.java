import java.util.Random;
import java.util.Scanner;

// Project: Rock-Paper-Scissors
// Description: A rock-paper-scissors game against the computer.
// Author: Taha Idra
// Version: 0.1

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"حجر", "ورقة", "مقص"};

        System.out.println("اختر: (0) حجر، (1) ورقة، (2) مقص");
        int playerChoice = scanner.nextInt();

        int computerChoice = random.nextInt(3);

        System.out.println("اخترت: " + choices[playerChoice]);
        System.out.println("اختار الكمبيوتر: " + choices[computerChoice]);

        if (playerChoice == computerChoice) {
            System.out.println("تعادل!");
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                   (playerChoice == 1 && computerChoice == 0) ||
                   (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("لقد فزت!");
        } else {
            System.out.println("لقد خسرت!");
        }

        scanner.close();
    }
}
