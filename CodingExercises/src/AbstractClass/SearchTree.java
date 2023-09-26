package AbstractClass;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already in list");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(ListItem item, ListItem parentItem) {
        if (item.next() == null) {
            if (parentItem.next() == item) {
                parentItem.setNext(item.previous());
            } else if (parentItem.previous() == item) {
                parentItem.setPrevious(item.previous());
            } else {
                root = item.previous();
            }
        } else if (item.previous() == null) {
            if (parentItem.next() == item) {
                parentItem.setNext(item.next());
            } else if (parentItem.previous() == item) {
                parentItem.setPrevious(item.previous());
            } else {
                root = item.next();
            }
        } else {
            ListItem currentItem = item.next();
            ListItem leftParentItem = item;
            while (currentItem.previous() != null) {
                leftParentItem = currentItem;
                currentItem = currentItem.previous();
            }
            item.setValue(currentItem.getValue());
            if (leftParentItem == item) {
                item.setNext(currentItem.next());
            } else {
                leftParentItem.setPrevious(currentItem.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
