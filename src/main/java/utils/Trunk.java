package utils;

public interface Trunk {
    public static final int MAX_SIZE = 10;

    public void put(String key, Object objeto);

    public Object get(String key);

    public void remove(String key);

    public boolean isFull();

    public boolean isEmpty();

}
