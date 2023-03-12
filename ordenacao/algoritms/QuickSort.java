package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        quicksort(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private static void quicksort(int[] sorted, int start, int end){
        if (start >= end){
            return;
        }
        int pivo = sorted[end];
        int pL = partição(sorted, start, end, pivo);
        quicksort(sorted, start, pL - 1);
        quicksort(sorted, pL + 1, end);

    }

    private static int partição(int[] sorted, int start, int end, int pivo) {
        int pL = start; 
        int pR = end; 
        while (pL < pR){
            while (sorted[pL] <= pivo && pL < pR){
                pL++;
            }
            while (sorted[pR] >= pivo && pL < pR){
                pR--;
            }
            swap(sorted, pL, pR);
        }
        swap(sorted, pL, end);
        return pL;
    }

    private static void swap (int [] array, int ind1, int ind2){
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    @Override
    public String getName() {
        return "QuickSort";
    }

    public static void main(String[] args) {
        QuickSort i = new QuickSort();
        int[] arrayOr = {3,2,1,5};
        int[] arrayOrd = i.sort(arrayOr);
        for (int j : arrayOrd) {
            System.out.println(j);
        }
        
    }

}
