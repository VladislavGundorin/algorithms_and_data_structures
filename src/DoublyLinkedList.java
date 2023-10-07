import java.util.Iterator;

public class DoublyLinkedList <T> implements Iterable<T>{
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }
    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }

    }

    public void removeByAge(int targetAge) {
        Node<T> current = head;

        while (current != null) {
            T data = current.getData();

            if (data instanceof Minion) {
                int age = ((Minion) data).getAge();

                if (age == targetAge) {
                    Node<T> prevNode = current.getPrev();
                    Node<T> nextNode = current.getNext();

                    if (prevNode != null) {
                        prevNode.setNext(nextNode);
                    } else {
                        head = nextNode;
                    }

                    if (nextNode != null) {
                        nextNode.setPrev(prevNode);
                    } else {
                        tail = prevNode;
                    }
                    current = null;
                }
            }
            if (current != null) {
                current = current.getNext();
            }
        }
    }

    public void editByMinionName(String targetName, int newAge) {
        Node<T> current = head;

        while (current != null) {
            T data = current.getData();

            if (data instanceof Minion) {
                String name = ((Minion) data).getName();

                if (name.equals(targetName)) {
                    ((Minion) data).setAge(newAge);
                }
            }

            current = current.getNext();
        }
    }
    public void show(){
        if (head == null){
            System.out.println("ничего нет");
            return;
        }
        Node<T> current = head;
        System.out.println("Связанный список: ");

        while (current != null){
            System.out.println(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    public void deleteFirst() {
        Node<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData() instanceof Minion) {
                Minion minion = (Minion) currentNode.getData();
                if (currentNode == head && currentNode == tail) {
                    head = null;
                    tail = null;
                } else if (currentNode == head) {
                    head = currentNode.getNext();
                    head.setPrev(null);
                    break;
                }
            }
            currentNode = currentNode.getNext();
        }
    }
    public void deleteLast() {
        Node<T> currentNode = tail;

        while (currentNode != null) {
            if (currentNode.getData() instanceof Minion) {
                Minion minion = (Minion) currentNode.getData();
                if (currentNode == head && currentNode == tail) {
                    head = null;
                    tail = null;
                } else if (currentNode == tail) {
                    tail = tail.getPrev();
                    tail.setNext(null);
                }
                break;
            }
            currentNode = currentNode.getNext();
        }
    }
    public void clear() {
        head = null;
        tail = null;
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.getData();
                current = current.getNext();
                return data;
            }
        };
    }


    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}


