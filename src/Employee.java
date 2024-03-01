import java.util.Objects;

public class Employee {
    private final int id;
    private final String fullName;
    private int salary;
    private int departmentId;
    private static int idCounter = 1;

    public Employee(String fullName, Integer salary, Integer departmentId) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(fullName, employee.fullName) && Objects.equals(salary, employee.salary) && Objects.equals(departmentId, employee.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, salary, departmentId);
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "id - " + id +
                ", ФИО '" + fullName + '\'' +
                ", зарплата " + salary +
                ", отдел " + departmentId +
                '}';
    }
}
