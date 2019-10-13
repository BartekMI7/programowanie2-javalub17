package day2.school;

import day1.validators.PeselValidator;
import lombok.Getter;

@Getter
public class Student {
    private String name;
    private String surname;
    private String pesel;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        PeselValidator peselValidator = new PeselValidator();
        boolean validate = peselValidator.validate(pesel);
        if (validate) {
            this.pesel = pesel;
        } else {
            throw new IllegalArgumentException("Niepoprawny pesel");
        }

    }


}
