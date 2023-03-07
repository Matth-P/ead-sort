package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        //int num = 1;
        //int start, mid, end;
        //while (num < sorted.length){
        //    start = 0;
        //    while (start + num < sorted.length){
        //        mid = start + num;
        //        end = start + 2 * num;
        //        if (end > sorted.length){
        //            end = sorted.length
        //        }
        //    }
        //}
        return sorted;
    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
