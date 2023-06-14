package curs7;

public class Teacher {

    String course;
    int experienceYears;
    String  schedule;

    public Teacher(String course, int experienceYears, String schedule) {
        this.course = course;
        this.experienceYears = experienceYears;
        this.schedule = schedule;
    }
    public void isQualified(boolean qualified){
        if (qualified ==  true){
            System.out.println("You qualify to teach at this school");
        }else
            System.out.println("You don't qualify");
    }
}
