import java.util.ArrayDeque;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(44);
        ad1.add(78);
        ad1.addFirst(4);
        System.out.println(ad1.getFirst());
    }
}
