public class Student {
    private String name;
    private int gradeLevel;
    private String school;

    public Student (String n, int g, String s) {
        name = n;
        gradeLevel = g;
        school = s;
    }
    public Student (String n, int g) {
        name = n;
        gradeLevel = g;
        if (g >= 9 && g <=12) {
            school = "high school";
        }
        else if (g >= 6 && g <= 8) {
            school = "middle school";
        }
        else {
            school = "elementary school";
        }
    }

    public String toString()
    {
        return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
}


