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
    public void testConstructor2(){
        //given
        Student givenStudent = new Student("Jan","Kowalski","02070803628");
        //when
        //then
        assertEquals("Jan", givenStudent.getName());
        assertEquals("Kowalski", givenStudent.getSurname());
        assertEquals("02070803628",givenStudent.getPesel());
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestConstructorWithIncorrectPesel(){
        //given
        Student givenStudent = new Student("Jan","Kowalski","02070803626");
    }







}