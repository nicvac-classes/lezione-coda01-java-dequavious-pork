//Implementare qui la classe Coda
public class Coda<T> {
    private Nodo<T> head;
    private Nodo<T> tail;

    public Coda() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(T dato) {
        Nodo<T> nuovoNodo = new Nodo<>(dato);

        if (isEmpty()) {
            head = nuovoNodo;
            tail = nuovoNodo;
        } else {
            tail.next = nuovoNodo;
            tail = nuovoNodo;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Coda vuota");
        }

        T dato = head.dato;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return dato;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Coda vuota");
        }

        return head.dato;
    }

    public int size() {
        int contatore = 0;
        Nodo<T> corrente = head;

        while (corrente != null) {
            contatore++;
            corrente = corrente.next;
        }

        return contatore;
    }
}