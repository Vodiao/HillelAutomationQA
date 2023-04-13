public class ManualTestEngineer extends Employee{
    final String lastName;

    public ManualTestEngineer (String name, String lastName){
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String Position() {
        return "Junior";
    }

    @Override
    public String Seniority() {
        return "Manual Test Engineer";
    }
}
