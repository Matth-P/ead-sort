package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        mergesort(sorted);
        return sorted;
    }

    private static void mergesort(int[] sorted){
        int tam = sorted.length;
        if (tam < 2){
            return;
        }
        int mid = tam/2;
        int[] midLeft = new int[mid];
        int[] midRight = new int[tam - mid];
        for (int i = 0; i < mid; i++){
            midLeft[i] = sorted[i];
        }
        for (int i = mid; i < tam; i++){
            midRight[i - mid] = sorted[i];
        }
        mergesort(midLeft);
        mergesort(midRight);
        merge(sorted, midLeft, midRight);

    }
    private static int[] merge(int[] array, int[] midLeft, int[] midRight){
        int tamLeft = midLeft.length, tamRight = midRight.length;
        int i = 0, j = 0, k = 0;
    
        while (i < tamLeft && j < tamRight){
            if (midLeft[i] <= midRight[j]){
                array[k] = midLeft[i];
                i++;
            }
            else {
                array[k] = midRight[j];
                j++;
            }
            k++;
        }
        while (i < tamLeft){
            array[k] = midLeft[i];
            i++;
            k++;
        }
        while (j < tamRight){
            array[k] = midRight[j];
            j++;
            k++;
        }
        return array;
    }

    

    @Override
    public String getName() {
        return "MergeSort";
    }

    public static void main(String[] args) {
        MergeSort i = new MergeSort();
        int[] arrayOr = {3,2,1,5};
        int[] arrayOrd = i.sort(arrayOr);
        for (int j : arrayOrd) {
            System.out.println(j);
        }
        
    }

}
