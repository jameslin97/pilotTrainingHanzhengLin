import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String employeeId;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setEmployeeId(String newEmployeeId){
        employeeId = newEmployeeId;
    }
}
