public class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node next() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static Node reverse(Node node) {
        Node copy = node;
        int nodeCount = 0;
        while (copy != null) {
            copy = copy.next();
            nodeCount++;
        }
        copy = node;
        for (int i = 0; i < nodeCount - 1; i++) {
            switchFirstToLast(copy);
            copy = copy.next();
        }
        return node;
    }

    private static void switchFirstToLast(Node node) {
        Node copy = node;
        if (copy.next() != null && copy.next().next() != null) {
            reverse(copy.next());
        }
        int copyValue = copy.getValue();
        copy.setValue(copy.next().getValue());
        copy.next().setValue(copyValue);
    }
}
