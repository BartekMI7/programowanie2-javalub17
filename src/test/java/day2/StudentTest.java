package day2;

import day2.school.ClassStudent;
import day2.school.SchoolStudent;
import day2.school.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StudentTest {
    @Test
    public void testConstructorPass() {
        //given

        Student currentStudent = new Student();

        //when
        currentStudent.setName("Witek");
        currentStudent.setSurname("Pazio");
        currentStudent.setPesel("02070803628");


        //then
        assertEquals("Witek", currentStudent.getName());
        assertEquals("Pazio", currentStudent.getSurname());
        assertEquals("02070803628", currentStudent.getPesel());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorValid() {
        //given

        Student currentStudent = new Student();

        //when
        currentStudent.setName("Witek");
        currentStudent.setSurname("Pazio");
        currentStudent.setPesel("02070803624");


        //then
        //assertEquals("Witek", currentStudent.getName());
        //assertEquals("Pazio", currentStudent.getSurname());
        //assertEquals("02070803624", currentStudent.getPesel());
        assertFalse(true); //tak jest bo juz wczesniej odrzuca bledny pesel.

    }


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


}