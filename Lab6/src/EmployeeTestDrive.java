public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Жейсон", "Стетхам", -4.2f, 0.67f);
        employee1.printInformation();

        Employee employee2 = new Employee();
        employee2.setFirstName("Томас");
        employee2.setLastName("Шелбе");
        employee2.setCommissionRate(0.01f);
        employee2.setGrossSales(999f);
        employee2.printInformation();
    }
}
