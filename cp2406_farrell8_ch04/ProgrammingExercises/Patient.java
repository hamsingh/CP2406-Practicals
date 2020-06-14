public class Patient
{
    private int id, age;
    public Patient()
    {
        //Default Constructor
        BloodData person1 = new BloodData();
        id = 0;
        age = 0;
    }
    public int getID()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
    public void setID()
    {
        this.id = id;
    }
    public void setAge()
    {
        this.age = age;
    }
}
