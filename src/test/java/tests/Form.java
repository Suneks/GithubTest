package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.FormPage;
import static com.codeborne.selenide.Selenide.*;

public class Form {

    FormPage FormPage = new FormPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }

    @Test
    void successFillTest() {
        String firstName = "Alex";
        String lastName = "Lesli";
        String gender = "Male";
        String email = "alex@company.com";
        String phone = "6464645645";
        String day = "1";
        String month = "June";
        String year = "1992";
        String hobby1 = "Music";
        String address = "Saint-P";
        String state = "NCR";
        String city = "Noida";
        String letter = "b";

        String subject = "Biology";
        String photoPathName = "1.png";

        FormPage.openPage()
                .setFirstName(firstName)
        .setLastName(lastName)
                .setUserEmail(email)
                .setGender(gender)
                .setUserNumber(phone)
                .setBirthDate( month, year, day  )
                .setSubjects(subject, letter)
                .setHobbies(hobby1)
                .uploadPicture(photoPathName)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmit()
                .checkTableRightData(firstName, lastName, email,
                gender, phone, day, month, year, subject, hobby1,
                photoPathName, address, state, city);
    }
}
