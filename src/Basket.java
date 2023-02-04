import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket {

    private List<String> fruits;

    public Basket() {

        fruits = new ArrayList<>();
    }

    public Basket(String[] initialFruits) {
        fruits = new ArrayList<>();
        for (String initialFruit : initialFruits) {
            fruits.add(initialFruit);
        }
    }

    public boolean find(String fruit) {
        boolean foundfruit;
        foundfruit = fruits.contains(fruit);
        return foundfruit;
    }

    public boolean remove(String fruit) {
        if (find(fruit) == true) {
            fruits.remove(fruit);
            return true;
        } else {
            return false;
        }

    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct(){
        return new ArrayList<>(fruits);
    }
}

