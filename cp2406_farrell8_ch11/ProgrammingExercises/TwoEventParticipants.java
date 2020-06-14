public class TwoEventParticipants {
    static Participant[] marathon = new Participant[8];
    static Participant[] diving = new Participant[8];

    public static void main(String[] args) {
        marathon[0] = new Participant("Jack",12,"Townsville");
        diving[0] = new Participant("John",15,"Townsville");
        marathon[1] = new Participant("Harry",21,"Townsville");
        diving[1] = new Participant("John",15,"Townsville");
        displayParticipantsinboth();
    }
    public static void displayParticipantsinboth() {
        for (int x = 0; x < diving.length; x++)
            if (diving[x].equals(marathon[x])) {
                System.out.println("These participant(s) are in both events");
                System.out.println(diving[x].toString());
            }
    }
}
