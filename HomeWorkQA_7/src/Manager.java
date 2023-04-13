import java.util.Arrays;

public class Manager extends Employee {
    final String lastName;
    Employee[]  team;
    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String Position() {
        return "Manager" +" and has a team of " + team.length +  " members: " + Arrays.toString(team);
    }

    @Override
    public String Seniority() {
        return "Senior";
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public void setTeamMembers(Employee... employees){
       team = employees;
    }

}
