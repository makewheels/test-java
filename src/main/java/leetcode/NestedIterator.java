package leetcode;

import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {

    private final NestedIterator nestedIterator;

    public NestedIterator(List<NestedIterator> nestedList) {
        nestedIterator = new NestedIterator(nestedList);
    }

    @Override
    public Integer next() {
        return nestedIterator.next();
    }

    @Override
    public boolean hasNext() {
        return nestedIterator.hasNext();
    }

    public static void main(String[] args) {

    }
}
