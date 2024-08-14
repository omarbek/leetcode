package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DevGenuis {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("qwe", "java", 1000));
        employees.add(new Employee("asd", "java", 200));
        employees.add(new Employee("zxc", "c++", 300));
        Map<String, List<Employee>> map = new DevGenuis().groupByJobTitle(employees);
        System.out.println(new DevGenuis().calculateAverage(employees));
    }

    public Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
        Map<String, List<Employee>> resultMap = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            List<Employee> employeeSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<Employee>());
            employeeSubList.add(employee);
            resultMap.put(employee.getTitle(), employeeSubList);
        }
        return resultMap;
    }

    public double calculateAverage(List<Employee> employeeList) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            sum += employee.getSalary();
            count++;
        }
        return (double) sum / count;
    }

}
