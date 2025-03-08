package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("Adnan");
        student1.setRollNumber(13);
        student1.setAddress(new Address("Phulwaria",841245,"Siwan"));

        Map<Subject,Integer>student1Marks=new HashMap<>();
        student1Marks.put(Subject.CHEMISTRY,84);
        student1Marks.put(Subject.PHYSICS,94);
        student1Marks.put(Subject.ENGLISH,83);
        student1Marks.put(Subject.MATHS,98);
        student1Marks.put(Subject.HINDI,90);

        student1.setMarks(student1Marks);


        Student student2 = new Student();
        student2.setStudentName("Avinash");
        student2.setRollNumber(3);
        student2.setAddress(new Address("Chapra",841246,"Chapra"));

        Map<Subject,Integer>student2Marks=new HashMap<>();
        student2Marks.put(Subject.CHEMISTRY,84);
        student2Marks.put(Subject.PHYSICS,84);
        student2Marks.put(Subject.ENGLISH,73);
        student2Marks.put(Subject.MATHS,98);
        student2Marks.put(Subject.HINDI,70);

        student2.setMarks(student2Marks);


        Student student3 = new Student();
        student3.setStudentName("Vats");
        student3.setRollNumber(33);
        student3.setAddress(new Address("Bhagwanpur",841246,"Chapra"));

        Map<Subject,Integer>student3Marks=new HashMap<>();
        student3Marks.put(Subject.CHEMISTRY,77);
        student3Marks.put(Subject.PHYSICS,88);
        student3Marks.put(Subject.ENGLISH,99);
        student3Marks.put(Subject.MATHS,67);
        student3Marks.put(Subject.HINDI,70);

        student3.setMarks(student3Marks);

        Student student4 = new Student();
        student4.setStudentName("Adnan");
        student4.setRollNumber(33);
        student4.setAddress(new Address("Bhagwanpur",841246,"Chapra"));

        Map<Subject,Integer>student4Marks=new HashMap<>();
        student4Marks.put(Subject.CHEMISTRY,77);
        student4Marks.put(Subject.PHYSICS,88);
        student4Marks.put(Subject.ENGLISH,99);
        student4Marks.put(Subject.MATHS,67);
        student4Marks.put(Subject.HINDI,70);

        student4.setMarks(student4Marks);

        List<Student>studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println("student and their marks");
        System.out.println(UtilService.findStudentWithMarks(studentList));
        System.out.println("-------------------------------------");

        System.out.println("get highest marks ");
        System.out.println(UtilService.findMaxMarks(studentList));
        System.out.println("-------------------------------------");

        System.out.println("get student by marks and then by lexicographically");
        System.out.println(UtilService.getStudentByNameThenByMarks(studentList));
        System.out.println("-------------------------------------");

        System.out.println("get second highest marks");
        System.out.println(UtilService.findSecondMaxMarks(studentList));
        System.out.println("-------------------------------------");


        System.out.println("Student By Roll Number");
        System.out.println(UtilService.sortStudentListByRollNumber(studentList));
        System.out.println("-------------------------------------");


        System.out.println("Reverse word Adnan using stream");
        System.out.println(UtilService.reverseWords("Adnan"));
        System.out.println("-------------------------------------");





    }




}



