package service;

import domain.Employee;

public interface EmployeeService {
    Employee getHighestPaidEmployee(int employeeCategory);
}
