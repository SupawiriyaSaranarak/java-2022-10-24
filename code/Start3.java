
public class Start3 {
    public static void main(String[] data) {
        Student s = new Student();
        s.name = "Hermione G";
        s.gender = Gender.FEMALE;
        System.out.println(s.gender);
        Player p = new Player("David B", 7);
        var q = new Player("SSs",9);
        
    }
}

//Enumeration - can be classified
enum Direction {North, East, South, West}
enum Gender {MALE, FEMALE}
enum Suit {HEART, SPADE, DIAMOND, CLUB}
enum WorkDay {MON,TUE,WED,THU,FRI}
class Student {
    String name;
    Gender gender;
}

// Record is Class but short form
record Player(String name, int number) {}