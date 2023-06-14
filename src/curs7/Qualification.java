package curs7;

public class Qualification extends Teacher{
    public static void main(String[] args) {
         Qualification qualification = new Qualification("Java",4,"Afternoon");
         qualification.verify();



    }
    public Qualification(String course, int experienceYears, String schedule) {
        super(course, experienceYears, schedule);
    }

    public void verify(){
        if (experienceYears > 3 && course.equals("Java") && schedule.equals("Afternoon")){
        isQualified(true);
        }else
            isQualified(false);
    }
}
