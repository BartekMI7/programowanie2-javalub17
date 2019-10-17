package day2.school;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassStudentTest {
    @Test
    public void testConstructorClassStudent() {
        //given
        ClassStudent givenClassStudent = new ClassStudent();

        //when
        givenClassStudent.setSchoolName("Staszic");
        givenClassStudent.setName("Jan");
        givenClassStudent.setSurname("Kowalski");
        givenClassStudent.setPesel("02070803628");
        givenClassStudent.setClassNr(3);


        //then
        assertEquals("Jan", givenClassStudent.getName());
        assertEquals("Kowalski", givenClassStudent.getSurname());
        assertEquals("02070803628", givenClassStudent.getPesel());
        assertEquals("Staszic", givenClassStudent.getSchoolName());
        assertEquals(3, givenClassStudent.getClassNr());
    }

    @Test
    public void testConstructorClassStudent2(){
        //given
        Student givenStudent = new Student("Jan", "Kowalski", "02070803628");
        SchoolStudent givenSchoolStudent = new SchoolStudent(givenStudent, "Staszic");
        ClassStudent givenClassStudent = new ClassStudent(givenSchoolStudent, 3);

        //when
        //then
        assertEquals("Jan",givenClassStudent.getName());
        assertEquals("Kowalski",givenClassStudent.getSurname());
        assertEquals("02070803628",givenClassStudent.getPesel());
        assertEquals("Staszic",givenClassStudent.getSchoolName());
        assertEquals(3,givenClassStudent.getClassNr());


    }

}