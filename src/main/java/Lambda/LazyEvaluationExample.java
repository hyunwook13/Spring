package Lambda;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluationExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jerry", "kim","TobsDay", "David");

        System.out.println("스트림 생성 및 중간 연산 정의");

        var stream = names.stream()
                .filter(name -> {
                    System.out.println("filter 호출" + name); ;
                    return name.length() > 3;
                });

        System.out.println("아직 아무것도 실행 안됨");

        System.out.println("연산 시작");
        stream.forEach(name -> System.out.println("결과 출력: " + name));


    }
}

