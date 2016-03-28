package domain;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal salary;
    
    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return name + " ($" + salary + ")"; 
    }
}
