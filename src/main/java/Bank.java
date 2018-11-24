import java.util.Hashtable;

public class Bank {

    private Hashtable rates = new java.util.Hashtable();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        return (Integer) rates.get(new Pair(from, to));
    }

}
