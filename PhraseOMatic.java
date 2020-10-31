public class PhraseOMatic {
    public static void main (String[] args) {

        //make three sets of words to choose from. Add your own!
        String[] wordListOne = {"24/7", "multi-Tier", "bazinga", "bingo bongo",
        "alienation", "chicken", "wings", "fatness", "eyes", "wild", "lizard"};
        
        String[] wordListTwo = {"random", "fryer", "exemption", "velocity", 
        "terminal", "gaming", "bizarre", "wicked", "multi-faceted", "elevation"};

        String[] wordListThree = {"organic", "mental", "severed", "unhinged",
        "drastic", "feral", "feverish", "titanic", "vital", "dangerous", "disgust"};

        //find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //print out the phrase
        System.out.println("What we need is a/an " + phrase);
    }
}