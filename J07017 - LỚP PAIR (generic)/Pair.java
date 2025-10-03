public class Pair<K, V> {
    private K key;
    private V value;
    public static boolean[] prime;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    boolean nto(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    boolean isPrime() {
        return nto((Integer) key) && nto((Integer) value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}
