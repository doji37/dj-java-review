import javax.sound.midi.Soundbank;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        // as.sort();

        Sorting bs = new BubbleSort();
        Sorting qs = new QuickSort();
        as.sort(bs);
        as.sort(qs);


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
