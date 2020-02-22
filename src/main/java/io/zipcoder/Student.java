package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Student {
    private static final Logger LOGGER = Logger.getLogger(Student.class.getName());
    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;


        for(Double score : examScores) {
            this.examScores.add(score);
        }


    }



    @Override
    public String toString() {
        String result1;
        String result2;
        result1 = String.format("Student Name: %s %s\n> Average Score: %s\n>Exam Scores:\n%s"
                ,getFirstName(), getLastName(), getAverageExamScore().toString(), getExamScores());

        return result1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores(){
        String scoreString = "";
        for(Double score : examScores) {
            if(score == examScores.get(examScores.size() -1)){
                scoreString += score;
            }
            else{
                scoreString += score + ", ";
            }
        }

        return scoreString;
    }

//    public ArrayList<Double> getExamScores(){
//        ArrayList<Double> arr = new ArrayList<>();
//        int i = 0;
//        for(Double score : examScores) {
//            arr.set(i,score);
//            i++;
//        }
//
//        return arr;
//    }

    public Double addExamScore(Double score) {
        examScores.add(score);
        return score;
    }

    public String setExamScore(Integer index, Double newScore) {
        String result = "";

        examScores.set(index, newScore);
        result = (index+1) + " " + newScore;

        return result;
    }

    public Double getAverageExamScore() {
        Double avg;
        Double sum = 0.0;
        for(Double d : examScores) {
            sum += d;
        }
        avg = sum/examScores.size();
        return avg;
    }

    public Double sumExamScores(){
        Double sum = 0.0;
        for(Double d : examScores) {
            sum += d;
        }
        return sum;
    }

    public static   Double getMaxValue(Double[] numbers){
        Double maxValue = numbers[0];
        for(int i=0;i < numbers.length-1;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public Double getHighestScore(String scores) {
        Double result = 0.0;
        Double[] arr = new Double[examScores.size()];
        String[] stringScores = scores.split(",");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(stringScores[i]);
        }
        result = getMaxValue(arr);

        return result;

    }


}