public class BSTreeTest {
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        tree.add(5);
        tree.add(6);
        tree.add(4);
        tree.add(7);
        tree.addAll(new int[]{2, 9, 10, 19, 50, 3});

        System.out.println("----Remove methods----");
        System.out.print("Should be FALSE: ");
        System.out.println(tree.remove(123));
        System.out.print("Should be TRUE: ");
        System.out.println(tree.remove(9));
        System.out.print("Should be FALSE: ");
        System.out.println(tree.remove(9));
        System.out.print("Should be TRUE: ");
        System.out.println(tree.remove(5));
        System.out.println("--------");

        System.out.println("----Size method----");
        System.out.print("Should be 8: ");
        System.out.println(tree.size());
        System.out.println("--------");

        System.out.println("----ExistsInTree Methods ----");
        System.out.print("Should be TRUE: ");
        System.out.println(tree.existsInTree(7));
        System.out.print("Should be FALSE: ");
        System.out.println(tree.existsInTree(1237));
        System.out.println("--------");

        System.out.println("---- Nearest smaller than ----");
        System.out.print("Should be 6: "); System.out.println(tree.findNearestSmallerThan(7));
        System.out.print("Should be 4: "); System.out.println(tree.findNearestSmallerThan(5));
        System.out.print("Should be 2: "); System.out.println(tree.findNearestSmallerThan(3));
        System.out.println("---- Nearest smaller than ----");

        int[] list = tree.sortedArray();

        System.out.println("---- Sorted array ----");
        for (int i : list) {
            System.out.println("Sorted: " + i);
        }
        System.out.println("--------");

        int[] range = tree.findInRange(1, 7);

        System.out.println("---- Range between 2 and 7 ----");
        for (int i : range) {
            System.out.println(i);
        }
        System.out.println("--------");
    }
}