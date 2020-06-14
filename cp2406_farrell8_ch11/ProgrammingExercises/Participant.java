public class Participant {
    private String name;
    private int age;
    private String address;

    public Participant(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public boolean equals(Participant otherParticipant){
        boolean result;
        if ((name == otherParticipant.name) && (age == otherParticipant.age) && (address == otherParticipant.address))
            result = true;
        else
            result = false;
        return result;
    }

    public String toString(){
        return ("Participant Information\nName: " + name + "\nAge: " + age + "\nAddress: " + address);
    }
}
