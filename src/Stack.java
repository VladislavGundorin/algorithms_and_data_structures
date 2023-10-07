import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        array = new Minion[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(T item) {
        ensureCapacity();
        array[size++] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        T item = (T) array[--size];
        array[size] = null;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = size * 2;
            array = java.util.Arrays.copyOf(array, newCapacity);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = size - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public T next() {
                return (T) array[currentIndex--];
            }
        };
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            result.append(iterator.next());
            if (iterator.hasNext()) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
