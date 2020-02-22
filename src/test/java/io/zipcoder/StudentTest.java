package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void TestGetExamScores(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
//        String actualOutput = student.getExamScores();
//        String expectedOutput = "100.0, 95.0, 123.0, 96.0";
        // Then
        //Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestAddExamScores(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double expectedOutput= 100.0;
        Double actualOutput = student.addExamScore(100.0);
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestSetExamScores(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actualOutput =  student.setExamScore(0, 150.0);

        String expectedOutput = "1 150.0";
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestGetAvgExamScores(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double actualOutput = student.getAverageExamScore();
        Double expectedOutput = 125.0;
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println(actualOutput);
    }

    @Test
    public void TestToString(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actualOutput = student.toString();
        String expectedOutput = "Student Name: Leon Hunter\n> Average Score: 125.0\n>Exam Scores:\n" +
                "100.0, 150.0, 250.0, 0.0";
        Assert.assertEquals(expectedOutput, actualOutput);
    }


}