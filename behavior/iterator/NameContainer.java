package behavior.iterator;

public class NameContainer implements Container {
    public String[] names = {"张三", "李四", "王五", "赵六", "田七"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            throw new IndexOutOfBoundsException();
        }
    }
}
