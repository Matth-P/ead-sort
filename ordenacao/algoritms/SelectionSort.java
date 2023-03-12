package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        int minV, minI, t = 0;
        for (int i = 0; i < sorted.length; i++){
            minV = sorted[i];
            minI = i;
            for(int j = i; j < sorted.length; j++){
                if (sorted[j] < minV){
                    minV = sorted[j];
                    minI = j;
                }
            }
            if (minV < sorted[i]){
                t = sorted[i];
                sorted[i] = sorted[minI];
                sorted[minI] = t;
            }
        }
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }

    public static void main(String[] args) {
        SelectionSort i = new SelectionSort();
        int[] arrayOr = {3,2,1,5};
        int[] arrayOrd = i.sort(arrayOr);
        for (int j : arrayOrd) {
            System.out.println(j);
        }
        
    }
}
