package Latihan;

public class BinaryTreeArrayMain26 {
    public static void main(String[] args) {
        BinaryTreeArray26 bta = new BinaryTreeArray26();
        
        int[] initialData = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0, 0};
        int idxLast = 9;  
        bta.populateData(initialData, idxLast);

        System.out.print("Inorder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.print("Preorder Traversal: ");
        bta.traversePreOrder(0);
        System.out.println("\n");

        System.out.print("Postorder Traversal: ");
        bta.traversePostOrder(0);
        System.out.println("\n");

        bta.add(23);

        System.out.print("Inorder Traversal setelah menambahkan 23: ");
        bta.traverseInOrder(0);
        System.out.println();
    }
}