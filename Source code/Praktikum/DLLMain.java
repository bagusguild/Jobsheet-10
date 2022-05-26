public class DLLMain {

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("============================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());

        System.out.println("-------------------------------------");

        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("============================");
        dll.removeFIrst();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("============================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("============================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+dll.size());

        System.out.println("-------------------------------------");

        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("============================");
        System.out.println("Data awal pada linked list adalah : "+dll.getFirst());
        System.out.println("Data akhir pada linked list adalah : "+dll.getLast());
        System.out.println("Data indeks ke-i pada linked list adalah : "+dll.get(1));
    }
}