package Fundamentals._16_ListExersiceAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class _10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputSchedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        List<String> newSchedule = new ArrayList<>();
        List<String> justForExercise1 = new ArrayList<>();
        List<String> justForExercise2 = new ArrayList<>();

        String firstCommand = scanner.nextLine();

        int firstCount = 0;
        int secondCount = 0;

        while (!firstCommand.equals("course start")) {
            String[] command = firstCommand.split(":");

            switch (command[0]) {
                case "Add":
                    String lessonTitle = command[1];
                    if (inputSchedule.contains(lessonTitle)) {

                    } else {
                        inputSchedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    String insertTitle = command[1];
                    int insertIndex = Integer.parseInt(command[2]);
                    String withExerciseInsert = insertTitle + "-Exercise";
                    if (inputSchedule.contains(insertTitle)) {

                    } else {
                        inputSchedule.add(insertIndex, insertTitle);
                    }

                    break;
                case "Remove":
                    String removeTitle = command[1];
                    String withExerciseRemove = removeTitle + "-Exercise";
                    if (inputSchedule.contains(removeTitle)) {
                        if (inputSchedule.contains(withExerciseRemove)) {
                            inputSchedule.remove(withExerciseRemove);
                            inputSchedule.remove(removeTitle);
                        } else {
                            inputSchedule.remove(removeTitle);
                        }
                    }
                    break;
                case "Swap":
                    String firstTitleSwap = command[1];
                    String secondTitleSwap = command[2];

                    String with1ExerciseSwap = firstTitleSwap + "-Exercise";
                    String with2ExerciseSwap = secondTitleSwap + "-Exercise";

                    if (inputSchedule.contains(firstTitleSwap) && (inputSchedule.contains(secondTitleSwap))) {
                        if (!inputSchedule.contains(with1ExerciseSwap) && !inputSchedule.contains(with2ExerciseSwap)) {
                            int indexForFirst = inputSchedule.indexOf(firstTitleSwap);
                            int indexForSecond = inputSchedule.indexOf(secondTitleSwap);

                            Collections.swap(inputSchedule, indexForFirst, indexForSecond);
                        } else if (inputSchedule.contains(with1ExerciseSwap) && !inputSchedule.contains(with2ExerciseSwap)) {
                            int indexForFirst = inputSchedule.indexOf(firstTitleSwap);
                            int indexForSecond = inputSchedule.indexOf(secondTitleSwap);

                            Collections.swap(inputSchedule, indexForFirst, indexForSecond);
                            int indexExer = inputSchedule.indexOf(with1ExerciseSwap);
                            inputSchedule.add(indexForSecond + 1, inputSchedule.remove(indexExer));

                        } else if (!inputSchedule.contains(with1ExerciseSwap) && inputSchedule.contains(with2ExerciseSwap)) {

                            int indexForFirst = inputSchedule.indexOf(firstTitleSwap);
                            int indexForSecond = inputSchedule.indexOf(secondTitleSwap);

                            Collections.swap(inputSchedule, indexForFirst, indexForSecond);


                            int indexExer = inputSchedule.indexOf(with2ExerciseSwap);
                            inputSchedule.add(indexForFirst + 1, inputSchedule.remove(indexExer));

                        } else if (inputSchedule.contains(with1ExerciseSwap) && inputSchedule.contains(with2ExerciseSwap)) {

                            int indexForFirst = inputSchedule.indexOf(firstTitleSwap);
                            int indexForSecond = inputSchedule.indexOf(secondTitleSwap);

                            int indexExer = inputSchedule.indexOf(with1ExerciseSwap);
                            int index2Exer = inputSchedule.indexOf(with2ExerciseSwap);

                            Collections.swap(inputSchedule, indexForFirst, indexForSecond);
                            Collections.swap(inputSchedule, indexExer, index2Exer);


                        }
                    }
                    break;
                case "Exercise":
                    String titleExersice = command[1];

                    String withExercise = titleExersice + "-Exercise";
                    if (inputSchedule.contains(titleExersice)) {
                        if (!inputSchedule.contains(withExercise)){
                            int indexEx = inputSchedule.indexOf(titleExersice);
                            inputSchedule.add(indexEx+1,withExercise);
                        }


                    } else {
                        inputSchedule.add(titleExersice);
                        inputSchedule.add(withExercise);
                    }

                    break;
            }
            firstCommand = scanner.nextLine();
        }
        for (int i = 1; i <= inputSchedule.size(); i++) {
            System.out.println(i + "." + inputSchedule.get(i - 1));
        }

    }
}

