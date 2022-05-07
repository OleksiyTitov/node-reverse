public class Main {
    public static void main(String[] args) {
        Node node = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
        Node copy = node;
        System.out.println("Nodes list:");
        while (copy != null) {
            System.out.print(copy.getValue() + ", ");
            copy = copy.next();
        }
        copy = node;
        Node.reverse(copy);
        System.out.println();
        System.out.println("Reversed nodes list:");
        while (node != null) {
            System.out.print(node.getValue() + ", ");
            node = node.next();
        }
    }
}
