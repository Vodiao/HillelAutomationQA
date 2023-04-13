public class AutomationEngineer extends Employee {
    final String lastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;

    }

    @Override
    public String getLastName() {
     return lastName;

    }

    @Override
    public String Position() {
        return "Automation Engineer";
    }

    @Override
    public String Seniority() {
        return "Senior";
    }

}
