package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if (numberToSkip > lastInRow) System.out.println("number to skip is bigger then the last");
        else if (lastInRow < 0) System.out.println("last number in row is negative");
        else {
            int sumOfSkipped = 0;
            int sumOfContinued = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if (i <= numberToSkip) sumOfSkipped += i;
                else sumOfContinued += i;
            }
            System.out.println("skipped sum is " + sumOfSkipped + "\ncounted sum is " + sumOfContinued);
        }
    }
}
