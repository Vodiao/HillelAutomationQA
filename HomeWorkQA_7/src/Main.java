
public class Main {

    public static void main(String[] args) {
        JavaDeveloper javaDev = new JavaDeveloper("Tom");
        AngularDeveloper angularDev = new AngularDeveloper("Bill");
        AutomationEngineer autoTester = new AutomationEngineer("Misha", "Aksani");
        ManualTestEngineer manualTester = new ManualTestEngineer("John", "Smith");
        Manager manager = new Manager("William", "Underwood");

        manager.setTeamMembers(javaDev, angularDev, autoTester, manualTester);

        printInfo(javaDev);
        printInfo(angularDev);
        printInfo(autoTester);
        printInfo(manualTester);
        printInfo(manager);

        /**
         * Написать наследование классов как на диаграмме и реализовать методы
         * таким образом чтобы код из Main.java печатал в консоль приблизительно следующую информацию:
         *
         * Tom  is a Senior Java Developer
         * Bill  is a Middle Angular Developer
         * Misha Aksani is a Senior Automation Engineer
         * John Smith is a Junior Manual Test Engineer
         * William Underwood is a Senior Manager and has a team of 4 members: [Tom, Bill, Misha, John]
         */
    }
    private static void printInfo(Employee employee) {
        System.out.println(employee.getInfo() + " " + employee.getLastName() + " is a " + employee.Seniority() + " " + employee.Position());
    }
}
