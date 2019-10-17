package day2.school;

import org.junit.Test;

import static org.junit.Assert.*;

public class SchoolStudentTest {
    @Test
    public void testConstructorSchoolStudent() {
        //given
        SchoolStudent givenSchoolStudent = new SchoolStudent();

        //when
        givenSchoolStudent.setSchoolName("Staszic");
        givenSchoolStudent.setName("Jan");
        givenSchoolStudent.setSurname("Kowalski");
        givenSchoolStudent.setPesel("02070803628");

        //then
        assertEquals("Jan", givenSchoolStudent.getName());
        assertEquals("Kowalski", givenSchoolStudent.getSurname());
        assertEquals("02070803628", givenSchoolStudent.getPesel());
        assertEquals("Staszic", givenSchoolStudent.getSchoolName());

    }
    @Test
    public void testConstructorSchoolStudent2(){
        //given
        Student givenStudent = new Student("Jan", "Kowalski", "02070803628");
        SchoolStudent givenSchoolStudent = new SchoolStudent(givenStudent,"Staszic");
        //when

        //then
        assertEquals("Jan",givenSchoolStudent.getName());
        assertEquals("Kowalski",givenSchoolStudent.getSurname());
        assertEquals("02070803628",givenSchoolStudent.getPesel());
        assertEquals("Staszic",givenSchoolStudent.getSchoolName());


    }


    @Test
    public void testConstructorSchoolStudent3(){
        //given
        Student givenStudent = new Student("Jan", "Kowalski", "02070803628");
        SchoolStudent givenSchoolStudent = new SchoolStudent(givenStudent,"Staszic");
        SchoolStudent givenSchoolStudent2 = new SchoolStudent(givenSchoolStudent);
        //when
        //then

        assertEquals("Jan",givenSchoolStudent2.getName());
        assertEquals("Kowalski",givenSchoolStudent2.getSurname());
        assertEquals("02070803628",givenSchoolStudent2.getPesel());
        assertEquals("Staszic",givenSchoolStudent2.getSchoolName());
    }

}