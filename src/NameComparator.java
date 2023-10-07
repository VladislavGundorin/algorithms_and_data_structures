import java.util.Comparator;

public class NameComparator implements Comparator<Minion> {
    @Override
    public int compare(Minion minion1, Minion minion2) {
        return minion1.getName().compareTo(minion2.getName());
    }
}