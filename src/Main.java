import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tamagotchi tamagotchi = new Tamagotchi(0, 0, true,sc);


        System.out.println("Vad ska din tamagotchi heta?");
        tamagotchi.name = sc.nextLine();
        System.out.println(tamagotchi.name);

        tamagotchi.teach();


        tamagotchi.getWords();
        tamagotchi.speak();
    }

}
