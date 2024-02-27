package com.daniyar.mathscore_task_4;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> score = Arrays.asList(6.5, 6.5, 6.5, 6.5, 6.5, 6.5); // Average math score is: 6.0
        //List<Double> score = Arrays.asList(6.5, -6.5, 6.5, 6.5, 6.5, 6.5); // com.daniyar.mathscore_task_4_2.NegativeAmountException: NegativeAmountException!!!
        //List<Double> score = Arrays.asList();// com.daniyar.mathscore_task_4_2.EmptyArrayException: EmptyArrayException!!!
        MathScore mathScore = new MathScore();
        try {
            mathScore.calculateAverageMathScore(score);
        } catch (EmptyArrayException e) {
            throw new RuntimeException(e);
        } catch (NegativeAmountException e) {
            throw new RuntimeException(e);
        }
    }
}
