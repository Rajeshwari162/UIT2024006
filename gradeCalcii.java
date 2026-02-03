package UIT2024006;

public class gradeCalcii {
    public String grade(int percent)
    {
        String grade=" ";
        if(percent<=0)
            System.out.println("Invalid Input");
        else if(percent<40)
            grade="F";
        else if(percent<50)
            grade="D";
        else if(percent<60)
            grade="C";
        else if(percent<70)
            grade="B";
        else if(percent<80)
            grade="A";
        else if(percent<90)
            grade="A+";
        else
            grade="O";
        return grade;
    }
}
