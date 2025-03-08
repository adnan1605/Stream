package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilService {

    // find student and their totalMarks

    public static Map<String,Integer>findStudentWithMarks(List<Student>studentList){
        return studentList.stream()
                .collect(Collectors.toMap(student->student.getStudentName(),student -> student.getMarks()
                                .values()
                                .stream()
                                .reduce(0,(a,b)->a+b),(a,b)->a>b?a:b));
    }

    public static List<Student>sortStudentListByRollNumber(List<Student>studentList){
        return studentList.stream()
                .sorted(Comparator.comparingInt(Student::getRollNumber))
                .collect(Collectors.toList());

    }


    public static List<String>getStudentByNameThenByMarks(List<Student>studentList){
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getStudentName)
                        .thenComparing((student -> student.getMarks().values().stream().reduce(0,(a,b)->a+b))))
                .map(student -> student.getStudentName())
                .collect(Collectors.toList());
    }

    public static int findMaxMarks(List<Student>studentList){
        return studentList.stream()
                .map(student -> student.getMarks().values().stream().reduce(Integer::sum).get())
                .distinct()
                .reduce((a,b)->b>a?b:a)
                .get();
    }


    public static int findSecondMaxMarks(List<Student>studentList){
        return studentList.stream()
                .map(student -> student.getMarks().values().stream().reduce(0,(a,b)->a+b))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .reduce(Integer::max)
                .get();
    }


    public int findSecondMax(int[] inputs) {
        return Arrays.stream(inputs)
                .distinct()
                .mapToObj(i -> i)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(0);
    }

    public static String reverseWords(String word) {
        char ch[]=word.toCharArray();
        return Arrays.stream(word.split(""))
                .reduce("",(a,b)->b+a);

    }


    // flatMap

    public int findSumAllRanges(List<List<Integer>>list){
        return list.stream()
                .flatMap(a->a.stream())
                .reduce(Integer::sum)
                .get();
    }

    public static Map<String, Integer> findCountofString(List<Student> list) {
        return list.stream()
                .collect(Collectors.toConcurrentMap(str -> str.getStudentName(), str -> 1, (a, b) -> a + 1));

    }

    public static Map<Integer, Integer> findFreq(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(a->a))
                .collect(Collectors.toMap(a->a,a->1,Integer::sum));
    }


}
