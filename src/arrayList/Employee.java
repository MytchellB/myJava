package arrayList;

public class Employee {
    private int idNum;
    private String firstName;
    private String lastName;

    public Employee(int idNum, String firstName) {
        this.idNum = idNum;
        this.firstName = firstName;
    }

    public Employee(int idNum, String firstName, String lastName) {
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idNum=" + idNum +
                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' + // Last name not currently in use.
                '}';
    }

    public int getIdNum() {
        return idNum;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof Employee ){
            Employee another = (Employee) obj;
            return (this.firstName.equals(another.firstName) && this.idNum == another.idNum);
        }
        else {
            return false;
        }
    }
}