package coursworking;

public class Main {
    private static final Employee[] employyes = {
            new Employee("Иванов Иван Васильевич", 1100, 1),
            new Employee("Семенов Семен Семеныч", 1000, 2),
            new Employee("Пупкин Вадим Николаевич", 2000, 3),
            new Employee("Сидоров Ибрагим Иванович", 4000, 2),
            new Employee("Доскиев Ибрагим Равильевич", 5000, 3),
            new Employee("Муслимов Ильяс Равильевич", 3500, 2),
            new Employee("Таибов Салман Тельманович", 2500, 3),
            new Employee("Богач Алексей Алексеевич", 2000, 1),
            new Employee("Уханов Роман Вячесловович", 1300, 1),
            new Employee("Шутова Наталья Александровна", 1500, 1)
    };

    public static void main(String[] args) {
        System.out.println("БАЗОВАЯ СЛОЖНОСТЬ");
        System.out.println("#1");
        printEmployees();
        System.out.println("#2");
        System.out.println(calculateTotalSalarySum());
        System.out.println("#3");
        System.out.println(employeeWithMinSalary());
        System.out.println("#4");
        System.out.println(employeeWithMaxnSalary());
        System.out.println("#5");
        System.out.println(calculateMiddleSalarySum());
        System.out.println("#6");
        printFullNames();
        System.out.println("----------------------------");
        System.out.println("ПОВЫШЕННАЯ СЛОЖНОСТЬ");
        System.out.println("#1");
        increaseSalary(10);
        printEmployees();
        System.out.println("#2");
        System.out.println(employeeWithMinSalaryInDepartament(1));
        System.out.println("#3");
        System.out.println(employeeWithMaxSalaryInDepartament(1));
        System.out.println("#4");
        System.out.println(calculateTotalSalarySum(2));
        System.out.println("#5");
        System.out.println(calculateMiddleSalarySumOfDepartament(2));
        System.out.println("#6");
        increaseSalaryOfDepartament(10,1);
        printEmployees(1);
        System.out.println("#7");
        printEmployeesWithMoreSalary(4000);
        System.out.println("#8");
        printEmployeesWithLessSalary(2000);
    }

    //Базовая сложность
    private static void printEmployees() {
        for (Employee employye : employyes) {
            System.out.println(employye);
        }
    }

    private static int calculateTotalSalarySum() {
        int sum = 0;
        for (Employee employye : employyes) {
            sum += employye.getSalary();
        }
        return sum;
    }

    private static Employee employeeWithMinSalary() {
        Employee results = employyes[0];
        for (Employee employye : employyes) {
            if (employye.getSalary() < results.getSalary()) {
                results = employye;
            }
        }
        return results;
    }

    private static Employee employeeWithMaxnSalary() {
        Employee results = employyes[0];
        for (Employee employye : employyes) {
            if (employye.getSalary() > results.getSalary()) {
                results = employye;
            }
        }
        return results;
    }

    private static float calculateMiddleSalarySum() {
        return (float) calculateTotalSalarySum() / employyes.length;
    }

    private static void printFullNames() {
        for (Employee employye : employyes) {
            System.out.println(employye.getFullname());
        }
    }

    // Повышенная сложность
    private static void increaseSalary(int percent) {
        for (Employee employye : employyes) {
            int currentSalary = employye.getSalary();
            employye.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }
    private static Employee employeeWithMinSalaryInDepartament(int departmentId) {
        int minSalary = Integer.MAX_VALUE;
        Employee results = null;
        for (Employee employye : employyes) {
            if (employye.getDepartamentId() != departmentId) {
                continue;
            }
            if (employye.getSalary() < minSalary) {
                results = employye;
                minSalary = employye.getSalary();

            }
        }
        return results;
    }

    private static Employee employeeWithMaxSalaryInDepartament(int departmentId) {
        int maxSalary = Integer.MIN_VALUE;
        Employee results = null;
        for (Employee employye : employyes) {
            if (employye.getDepartamentId() != departmentId) {
                continue;
            }
            if (employye.getSalary() > maxSalary) {
                results = employye;
                maxSalary = employye.getSalary();

            }
        }
        return results;
    }
    private static int calculateTotalSalarySum(int departamenId) {
        int sum = 0;
        for (Employee employye : employyes) {
            if (employye.getDepartamentId() == departamenId) {
                sum += employye.getSalary();
            }
        }
        return sum;
    }

    public static int calculateMiddleSalarySumOfDepartament(int departamentId){
        int sum = 0;
        int members= 0;
        for (Employee employye : employyes) {
            if (employye.getDepartamentId() == departamentId) {
                sum += employye.getSalary();
                members++;
            }
        }
        return sum/members;
    }
    private static void increaseSalaryOfDepartament(int percent, int departamentId) {
        for (Employee employye : employyes) {
            if (employye.getDepartamentId() == departamentId){
                int currentSalary = employye.getSalary();
                employye.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }
    private static void printEmployees(int  departamentId) {
        for (Employee employye : employyes) {
            if (employye.getDepartamentId() == departamentId){
                System.out.println(employye);
            }
        }
    }
    private static void printEmployeesWithMoreSalary(int salary){
        for (Employee employye : employyes) {
            if (employye.getSalary()>=salary);
            System.out.println(employye.getId()+" " + employye.getFullname()+ " " + employye.getSalary());
        }
    }
    private static void printEmployeesWithLessSalary(int salary){
        for (Employee employye : employyes) {
            if (employye.getSalary()<salary);
            System.out.println(employye.getId()+" " + employye.getFullname()+ " " + employye.getSalary());
        }
    }

}
