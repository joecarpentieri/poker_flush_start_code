import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PokerGame {

    public PokerGame() {

    }

    public boolean checkIfFlush(String[] cards) {
//        write code here
        char suit = cards[0].charAt(cards[0].length()-1);
        for (int i = 1; i < cards.length; i++) {
            if (cards[i].charAt(cards[i].length()-1) == suit){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}