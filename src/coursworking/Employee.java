package coursworking;

import java.util.Objects;

public class Employee {
    private final Integer id;
    private final String fullname;
    private  Integer salary;
    private  Integer departamentId;
    private static Integer idCounter =1;

    public Employee(String fullname, Integer salary, Integer departamentId) {
        this.id = idCounter++;
        this.fullname = fullname;
        this.salary = salary;
        this.departamentId = departamentId;
    }

    public Integer getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartamentId() {
        return departamentId;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartamentId(Integer departamentId) {
        this.departamentId = departamentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(fullname, employee.fullname) && Objects.equals(salary, employee.salary) && Objects.equals(departamentId, employee.departamentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullname, salary, departamentId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", salary=" + salary +
                ", departamentId=" + departamentId +
                '}';
    }
}
