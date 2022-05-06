package singleton;

import org.springframework.stereotype.Controller;

@Controller
public class AddEmployeeController {

    private EmployeeService employeeService;

    public AddEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void addEmployee(String employee) {
        employeeService.addEmployee(employee);
    }
}
