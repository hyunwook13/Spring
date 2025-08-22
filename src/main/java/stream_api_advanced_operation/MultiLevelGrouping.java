package stream_api_advanced_operation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeForGrouping {
    private String name;
    private String position;    // 예: "Manager", "Developer"
    private String department;  // 예: "HR", "IT", "Sales"

    public EmployeeForGrouping(String name, String position, String department) {
        this.name = name;
        this.position = position;
        this.department = department;
    }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }
    @Override
    public String toString() {
        return name + "(" + position + ", " + department + ")";
    }
}

public class MultiLevelGrouping {
    public static void main(String[] args) {
        List<EmployeeForGrouping> emps = Arrays.asList(
                new EmployeeForGrouping("Alice", "Manager", "HR"),
                new EmployeeForGrouping("Bob", "Developer", "IT"),
                new EmployeeForGrouping("Charlie", "Developer", "IT"),
                new EmployeeForGrouping("David", "Manager", "Sales"),
                new EmployeeForGrouping("Eve", "Developer", "Sales")
        );

        // TODO 1차: position 기준 -> 2차: department 기준
        Map<String,Map<String,List<EmployeeForGrouping>>> multiGroup = emps.stream()
                        .collect(Collectors.groupingBy(EmployeeForGrouping::getPosition,
                                Collectors.groupingBy(EmployeeForGrouping::getDepartment)));

        System.out.println(multiGroup);
    }
}
