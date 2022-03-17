package chapterFour;

public class StudentFile {

    private String name;
    private double average;

    public StudentFile(String name, double average){
        this.name = name;
        if(average > 0.0 && average <= 100)
        this.average = average;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAverage(double average){
        if(average < 0.0 && average >= 100)
            this.average = average;

    }

    public String getStudentGrade(){
        String studentGrade = " ";
        if (average >= 80.0)
            studentGrade = "A";
        else if(average >= 65.0)
            studentGrade = "B";
        else if(average >= 50.0)
            studentGrade = "C";
        else if (average >= 40.0)
            studentGrade = "E";
        else
            studentGrade = "F";

        return studentGrade;
    }
}
