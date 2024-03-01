public class Main {

   private static final Employee [] employees = {
           new Employee("Петрова Мария Александровна", 3000, 1),
           new Employee("Журавлева Василиса Ивановна", 5000, 2),
           new Employee("Иванов Кирилл Иванович", 6700, 3),
           new  Employee("Карпов Алексей Сергеевич", 3400, 4),
           new Employee("Сазонова Екатерина Ивановна", 5800, 5),
           new Employee("Петров Петр Петрович", 4700, 1),
           new Employee("Тимаков Андрей Васильевич", 5800, 2),
           new Employee("Максимов Максим Иванович", 10000, 3),
           new Employee("Север Макр Евгеньевич", 6700, 4),
           new Employee("Пищулин Василий Сергеевич", 5300, 5)

   };

   private static void printEmployee() {
       for (Employee employee : employees) {
           System.out.println(employee);
       }
   }
   private static int calculateTotalSalarySum () {
       int sum = 0;
       for (Employee employee : employees) {
           sum+= employee.getSalary();
       }
       return sum;
   }

private static Employee findEmployeeMinSalary(){
       Employee result = employees [0];
    for (Employee employee : employees) {
        if (employee.getSalary()<result.getSalary()) {
            result = employee;
        }
    }
    return  result;
}
    private static Employee findEmployeeMaxSalary(){
        Employee result = employees [0];
        for (Employee employee : employees) {
            if (employee.getSalary()>result.getSalary()) {
                result = employee;
            }
        }
        return  result;
    }


private static float calculateMiddlSalary(){
       return (float)calculateTotalSalarySum()/employees.length;
}

private static void printFullName (){
    for (Employee employee : employees) {
        System.out.println(employee.getFullName());
    }
}

    public static void main(String[] args) {
        printEmployee ();
        System.out.println("Сумма затрат на зарплаты в месяц " + calculateTotalSalarySum());
        System.out.println("Сотрудник с минимальной зарплатой - "+ findEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой - "+ findEmployeeMaxSalary());
        System.out.println("Среднее значение зарплат - " + calculateMiddlSalary());
        System.out.println(".........................");
        System.out.println("ФИО сотрудников");
        printFullName ();
    }
}