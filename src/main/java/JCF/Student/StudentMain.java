package JCF.Student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("=== 메뉴 ===\n" +
                    "1. 학생 등록\n" +
                    "2. 학생 삭제\n" +
                    "3. 학생 목록 보기\n" +
                    "4. 학생 점수 조회\n" +
                    "5. 종료");
            System.out.println("선택: ");

            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("이름 입력: ");
                    String name = sc.next();
                    System.out.println("나이 입력 : ");
                    int age = sc.nextInt();
                    System.out.println("학번 입력: ");
                    String id  = sc.next();
                    System.out.println("점수 입력: ");
                    int score = sc.nextInt();

                    Student newStudent = new Student(name, age, id);
                    manager.addStudent(newStudent, score);
                    break;

                case 2:
                    System.out.println("삭제할 학생 이름: ");
                    String delName = sc.nextLine();
                    manager.removeStudent(delName);
                    break;
                case 3:
                    manager.printAllStudents();
                    break;
                case 4:
                    System.out.println("조회할 학생 이름 : ");
                    String searchName = sc.nextLine();
                    manager.printScore(searchName);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("잘못된 입력");
                    break;
            }
        }
        sc.close();
    }
}
