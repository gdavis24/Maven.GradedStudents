package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.logging.Logger;

public class ClassroomTest {
    private static final Logger LOGGER = Logger.getLogger(ClassroomTest.class.getName());
    @Test
    public void TestGetAvgExamScore(){
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;
        Classroom classroom = new Classroom(students);

        // When
        Double actualOutput = classroom.getAverageExamScore();
        Double expectedOutput = 250.0;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void TestAddStudent(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        String preEnrollment = classroom.getStudents().toString();
        classroom.addStudent(student);
        String postEnrollment = classroom.getStudents().toString();


        // Then
        String preEnrollmentAsString = preEnrollment;
        String postEnrollmentAsString = postEnrollment;
//        System.out.println("===========================");
//        System.out.println(preEnrollmentAsString);
//        System.out.println("===========================");
//        System.out.println(postEnrollmentAsString);

    }
    @Test
    public void TestRemoveStudent(){
        int maxNumberOfStudents = 3;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores1 = { 100.0, 150.0, 250.0, 0.0 };
        Student student1 = new Student("Leon", "Hunter", examScores1);
        Double[] examScores2 = { 100.0, 150.0, 250.0, 0.0 };
        Student student2 = new Student("Jim", "Smith", examScores2);
        Student student3 = new Student("Sara", "Hill", examScores2);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        String before = classroom.getStudents().toString();
        //classroom.removeStudent("Jim", "Smith");
        String after = classroom.getStudents().toString();
        //LOGGER.info(before);
        //LOGGER.info(after);
    }
    @Test
    public void TestGetStudentsByScore(){
        int maxNumberOfStudents = 3;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores1 = { 100.0, 150.0, 250.0, 0.0 };
        Student student1 = new Student("Leon", "Hunter", examScores1);
        Double[] examScores2 = { 50.0, 150.0, 250.0, 0.0 };
        Student student2 = new Student("Jim", "Smith", examScores2);
        Double[] examScores3 = { 100.0, 150.0, 250.0, 0.0 };
        Student student3 = new Student("Sara", "Hill", examScores3);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        Double student1Score = student1.getAverageExamScore();//125.00 leon
        Double student2Score = student2.getAverageExamScore();//112.5 jim
        Double student3Score = student3.getAverageExamScore();//125.00 sara

//    String expected = student1.toString() + student3.toString() + student2.toString();
        // String actual =
        classroom.getStudentsByScore();

        //LOGGER.info(classroom.getStudents().toString());

        //LOGGER.info(before);
        //LOGGER.info(after);
    }

    @Test
    public void TestGetGradeBook() {
        int maxNumberOfStudents = 3;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores1 = {100.0, 150.0, 250.0, 10.0};
        Student student1 = new Student("Leon", "Hunter", examScores1);
        Double[] examScores2 = {50.0, 150.0, 100.0, 10.0};
        Student student2 = new Student("Jim", "Smith", examScores2);
        Double[] examScores3 = {11.0, 15.0, 10.0, 10.0};
        Student student3 = new Student("Sara", "Hill", examScores3);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        Double student1Score = student1.getAverageExamScore();//125.00 leon

        Double student2Score = student2.getAverageExamScore();//112.5 jim

        Double student3Score = student3.getAverageExamScore();//125.00 sara


//    String expected = student1.toString() + student3.toString() + student2.toString();
        // String actual =

        System.out.println(classroom.getGradeBook());

        //LOGGER.info(classroom.getStudents().toString());

        //LOGGER.info(before);
        //LOGGER.info(after);
    }

}