import javax.sound.midi.Soundbank;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        // as.sort();

        Sorting bs = new BubbleSort();
        Sorting qs = new QuickSort();
        as.sort(bs);
        as.sort(qs);

//        don't need MyLambda interface bc the Sorting already has the same desired signature
//        MyLambda myLambda = () -> System.out.println("Sorting the array");
//        Sorting myLambda2 = () -> System.out.println("Sorting the array");

        Sorting noLambda = new QuickSort();
        noLambda.sort();


        Sorting quickSort = () -> System.out.println("Quick sorting");
        as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println("Bubble sorting");
        as.sort(bubbleSort);

        as.sort(() -> System.out.println("Quick sorting"));


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }

}


//interface MyLambda{
//    void print();
//
//}

