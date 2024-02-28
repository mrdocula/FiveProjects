package com.daniyar.mathscore_task_4;

import java.util.List;

public class MathScore {
    public void calculateAverageMathScore (List<Double> list) throws EmptyArrayException, NegativeAmountException{
        if (list.isEmpty()){
            throw new EmptyArrayException("EmptyArrayException!!!");
        }

        double temp = 0.0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) < 0){
                throw new NegativeAmountException("NegativeAmountException!!!");
            }
            temp += list.get(i);
        }
        double averageScore = temp / size;
        System.out.println("Average math score is: " + averageScore);


    }
}
