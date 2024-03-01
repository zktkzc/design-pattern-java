package behavior.iterator;

public class Test {
    public static void main(String[] args) {
        Container container = new NameContainer();
        for (Iterator iterator = container.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
