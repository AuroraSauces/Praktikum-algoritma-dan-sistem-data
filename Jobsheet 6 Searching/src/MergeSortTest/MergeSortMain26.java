package MergeSortTest;

public class MergeSortMain26 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting26 mSort = new MergeSorting26();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.MergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}