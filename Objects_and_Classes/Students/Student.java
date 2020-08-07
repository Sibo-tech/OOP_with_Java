package Objects_and_Classes.Students;
public class Student
{
    private String firstName;
    private String middleName;
    private String lastName;

    public void setNames(String first, String middle, String last)
    {
        this.firstName   = first;
        this.middleName  = middle;
        this.lastName    = last;
    }
    public String getFullName()
    {
        return firstName + " "+middleName.charAt(0)+". " + lastName ;

    }
}
