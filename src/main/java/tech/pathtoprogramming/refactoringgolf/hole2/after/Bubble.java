package tech.pathtoprogramming.refactoringgolf.hole2.after;

class Bubble extends Sorter {

    @Override
    protected int[] doSort(int[] input) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    swap(input, i, i + 1);
                    sorted = false;
                }
            }
        }
        return input;
    }
}
