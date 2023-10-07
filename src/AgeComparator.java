import java.util.Comparator;

public class AgeComparator implements Comparator<Minion> {
    @Override
    public int compare(Minion minion2, Minion minion1) {
        return Integer.compare(minion1.getAge(), minion2.getAge());
    }
}