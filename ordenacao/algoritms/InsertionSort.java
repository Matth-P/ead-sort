package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        for (int i = 1; i < sorted.length; i++){
            int valor = sorted[i];
            int j = i - 1;
            while(j >= 0 && sorted[j] > valor){
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = valor;
        }
        return sorted;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

    public static void main(String[] args) {
        InsertionSort i = new InsertionSort();
        int[] arrayOr = {3,2,1,5};
        int[] arrayOrd = i.sort(arrayOr);
        for (int j : arrayOrd) {
            System.out.println(j);
        }
        
    }

}
