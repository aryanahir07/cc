public class MergeTwoLink {

    public static void main(String[] args) {
        // Create two sorted linked lists
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList list2 = new LinkedList();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        // Merge the two linked lists
        LinkedList mergedList = mergeSortedLinkedLists(list1, list2);

        // Print the merged linked list
        while (mergedList.size() > 0) {
            System.out.print(mergedList.removeFirst() + " ");
        }
    }

    /**
     * Merges two sorted linked lists into a single sorted linked list.
     *
     * @param list1 The first sorted linked list.
     * @param list2 The second sorted linked list.
     * @return The merged sorted linked list.
     */
    public static LinkedList mergeSortedLinkedLists(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();

        while (!list1.isEmpty() && !list2.isEmpty()) {
            int list1Value = list1.getFirst();
            int list2Value = list2.getFirst();

            if (list1Value <= list2Value) {
                mergedList.add(list1Value);
                list1.removeFirst();
            } else {
                mergedList.add(list2Value);
                list2.removeFirst();
            }
        }

        // Add any remaining elements from list1
        while (!list1.isEmpty()) {
            mergedList.add(list1.removeFirst());
        }

        // Add any remaining elements from list2
        while (!list2.isEmpty()) {
            mergedList.add(list2.removeFirst());
        }

        return mergedList;
    }
}