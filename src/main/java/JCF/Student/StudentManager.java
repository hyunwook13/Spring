package JCF.Student;

import java.util.*;

public class StudentManager {
    private List<Student> students;
    private Set<String> studentNames;
    private Map<String, Integer> scoreMap;

    public StudentManager() {
        students = new ArrayList<>();
        studentNames = new HashSet<>();
        scoreMap = new HashMap<>();
    }

    public void addStudent(Student student, int score) {
        if (studentNames.contains(student.getName())) {
            System.out.println("이미 있는 학생");
        }

        students.add(student);
        studentNames.add(student.getName());
        scoreMap.put(student.getName(), score);
    }

    public void removeStudent(String name) {
        Student target = null;

        for (Student s: students) {
            if (name == s.getName()) {
                target = s;
                break;
            }
        }

        if (target != null) {
            students.remove(target);
            studentNames.remove(name);
            scoreMap.remove(name);
        } else {
            System.out.println("없음");
        }
    }

    public void printAllStudents() {
        System.out.println("===== 학생 목록 =====");

        for(Student s: students) {
            System.out.println(s);
        }
    }

    public void printScore(String name) {
        Integer score = scoreMap.get(name);

        if (score != null) {
            System.out.println(name + "의 점수 : " + score);
        } else {
            System.out.println("NO 점수");
        }
    }

}
