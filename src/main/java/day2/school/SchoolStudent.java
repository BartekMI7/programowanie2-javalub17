package day2.school;

public class SchoolStudent extends Student {
    private String schoolName;

    public SchoolStudent(){

    }

    public SchoolStudent(Student student, String schoolName){
        this.name=student.getName();
        this.surname=student.getSurname();
        this.pesel=student.getPesel();
        this.schoolName=schoolName;
    }

    public SchoolStudent(SchoolStudent schoolStudent){
        this.name=schoolStudent.getName();
        this.surname=schoolStudent.getSurname();
        this.pesel=schoolStudent.getPesel();
        this.schoolName=schoolStudent.getSchoolName();
    }


    public String getSchoolName() {

        return schoolName;
    }

    public void setSchoolName(String schoolName) {

        this.schoolName = schoolName;
    }
}
