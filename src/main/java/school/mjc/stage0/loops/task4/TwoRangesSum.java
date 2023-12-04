package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int numberSumBeforeSkip = 0;
        int numberSumAfterSkip = 0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else  if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else {
            for (int i = 0; i <= lastInRow; i++) {
                if (i <= numberToSkip) {
                    numberSumBeforeSkip += i;
                } else {
                    numberSumAfterSkip += i;
                }
            }
        }
        if(numberSumAfterSkip != 0 || numberSumBeforeSkip != 0)
            System.out.println("skipped sum is "+numberSumBeforeSkip+"\ncounted sum is "+numberSumAfterSkip);
    }
}
