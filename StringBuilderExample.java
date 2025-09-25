public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(6, 10, "Programing");
        System.out.println("After replacing: " + sb);

        sb.delete(6, 17);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}
