package day2.school;

public class ClassStudent extends SchoolStudent {
    private int classNr;

    public ClassStudent(){

    }

    public ClassStudent(SchoolStudent schoolStudent, int classNr) {
        super(schoolStudent);
        this.classNr=classNr;
    }

    public void setClassNr(int classNr) {
        this.classNr = classNr;
    }

    public int getClassNr() {
        return classNr;
    }
}
