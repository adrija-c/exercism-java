import java.util.NoSuchElementException;

public class SimpleLinkedList<T> {
    private Cell<T> head;

    public SimpleLinkedList(T[] values) {
        for (T value : values)
            push(value);
    }

    public SimpleLinkedList() {
    }

    public int size() {
        if (head == null)
            return 0;

        int size = 1;
        for (Cell<T> ptr = head; ptr.next != null; ptr = ptr.next)
            size ++;

        return size;
    }

    public T pop() {
        if (head == null)
            throw new NoSuchElementException();

        T data = head.data;
        head = head.next;

        return data;
    }

    public void push(T data) {
        head = new Cell<>(data, head);
    }

    public void reverse() {
        if (head == null)
            return;

        Cell<T> ptr = head;
        head = null;

        do {
            head = new Cell<T>(ptr.data, head);
        } while((ptr = ptr.next) != null);
    }

    public Object[] asArray(Class klass) {
        Object[] result = new Object[size()];

        int index = 0;
        for (Cell<T> ptr = head; ptr != null; ptr = ptr.next)
            result[index ++] = klass.cast(ptr.data);

        return result;
    }

    private class Cell<T> {
        private final T data;
        private final Cell<T> next;

        Cell (T data, Cell<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}