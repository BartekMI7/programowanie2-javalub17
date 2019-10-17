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

}