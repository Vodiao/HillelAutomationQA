public class AngularDeveloper extends Employee {

    public AngularDeveloper(String name) {
        super(name);
    }

    @Override
    public String Position() {
        return "Middle";
    }

    @Override
    public String Seniority() {
        return "Angular Developer";
    }

}
