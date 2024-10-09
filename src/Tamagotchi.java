import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    private int hunger;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive;
    private Random random = new Random();
    String name;
    Scanner scan ;


    public Tamagotchi(int hunger, int boredom, boolean isAlive,Scanner scan) {
        this.hunger = hunger;
        this.boredom = boredom;
        this.isAlive = isAlive;
        this.scan=scan;
    }

    public void tick(){


    }
    public void feed(){
        hunger -= 1;
    }
    public void speak(){
        //random.nextInt(words.size());

        System.out.println(words.get(random.nextInt(words.size())));


        reduceBoredom();
    }
    public void teach(){
        System.out.println("Vilket ord vill du lära "+name+"?");
        words.add(scan.nextLine());


        reduceBoredom();
    }
    public void printStats(){

    }
    public boolean getAlive(){

        return isAlive;
    }
    private void reduceBoredom(){
        boredom -= 1;
    }

    public ArrayList<String> getWords() {
        return words;
    }
}
