/**
 * Created by Steven on 1/30/2016.
 */
public class BeerSong {

    public static void main (String[] args) {
        Ninety_Nine_Bottles_of_Beer();

    }

    private static void Ninety_Nine_Bottles_of_Beer(){
        int count = 99;
        while (count > 1) {
            if (count == 2) { //changes bottles to bottle for better grammar of song
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer");
                count--;
                System.out.println("take one down, pass it around, " + count + " bottle of beer on the wall.\n");
            } else {
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer");
                count--;
                System.out.println("take one down, pass it around, " + count + " bottles of beer on the wall.\n");
            }
        }
        System.out.println(count + " bottle of beer on the wall, " + count + " bottle of beer\n" +
        "take one down, pass it around, no more bottles of beer on the wall. :(");


    }
}
