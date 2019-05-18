package Fundamentals._10_Exercise_ARRAYS;

        import java.util.Arrays;
        import java.util.Scanner;

public class _9_SecondTry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();

        String [] bestDna = new String[length];

        int numberDNAtest = 0;
        int counterSequnce = 0;
        int sum = 0;
        int i =0;
        boolean zeros = false;
        int maxSequence = 0;
        int firstPositionOfSequence = 0;
        int bestNumber = 0;
        int bestSum = 0;

        while (!input.equals("Clone them!")) {
            sum = 0;
            String [] dna = input.split("!+");
            numberDNAtest++;
            counterSequnce=0;

            String sequence = input.replaceAll("!", "");
            String[] ones = sequence.split("0+");
            if (ones.length!=0) {
                for (i = 0; i < dna.length; i++) {
                    if (!dna[i].equals("0")) {
                        zeros = true;
                    }
                    if (dna[i].equals("1")) {
                        counterSequnce++;
                        sum++;
                    } else if (dna[i].equals("0")) {
                        if (counterSequnce > maxSequence) {
                            maxSequence = counterSequnce;
                            firstPositionOfSequence = i + 2 - counterSequnce;
                            bestSum = sum;
                            counterSequnce = 0;
                            bestNumber = numberDNAtest;
                            bestDna = dna;
                        } else if (counterSequnce == maxSequence && maxSequence != 0) {
                            if (bestNumber != numberDNAtest) {
                                if (firstPositionOfSequence == i + 2 - counterSequnce) {
                                    if (bestSum > sum) {
                                        continue;
                                    } else if (bestSum < sum) {
                                        bestDna = dna;
                                        bestNumber = numberDNAtest;
                                    }
                                }
                            }
                        } else if (maxSequence == 0 && counterSequnce == 0) {
                            maxSequence = counterSequnce;
                            firstPositionOfSequence = i + 2 - maxSequence;
                            bestNumber = numberDNAtest;
                            bestDna = dna;
                            bestSum = sum;


                        }
                        counterSequnce = 0;
                    }
                    if (counterSequnce > maxSequence) {
                        maxSequence = counterSequnce;
                        firstPositionOfSequence = i + 2 - maxSequence;
                        bestNumber = numberDNAtest;
                        bestDna = dna;
                        bestSum = sum;
                    } else if (counterSequnce == maxSequence) {
                        if (bestNumber != numberDNAtest) {
                            if (firstPositionOfSequence == i + 2 - counterSequnce) {
                                if (bestSum > sum) {
                                    continue;
                                } else if (bestSum < sum) {
                                    bestDna = dna;
                                    bestNumber = numberDNAtest;
                                    bestSum = sum;
                                    firstPositionOfSequence = i + 2 - counterSequnce;
                                    maxSequence = counterSequnce;
                                }
                            } else if (firstPositionOfSequence > i + 2 - counterSequnce) {
                                bestDna = dna;
                                bestNumber = numberDNAtest;
                                bestSum = sum;
                                firstPositionOfSequence = i + 2 - counterSequnce;
                                maxSequence = counterSequnce;
                            }
                        }
                    }
                }
                if (sum > bestSum) {
                    bestSum = sum;
                }
            }
            input = sc.nextLine();
        }

        if (zeros==false){
            System.out.println("Best DNA sample 1 " + " with sum: " + bestSum + ".");
            for (int j = 0; j < bestDna.length; j++) {
                System.out.print(0 + " ");
            }

        } else {
            System.out.println("Best DNA sample " + bestNumber + " with sum: " + bestSum + ".");
            for (int j = 0; j < bestDna.length; j++) {
                System.out.print(bestDna[j] + " ");
            }
        }
    }
}

