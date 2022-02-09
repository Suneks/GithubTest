package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Form {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillTest() {
        String firstName = "Alex";
        String lastName = "Lesli";
        String gender = "Male";
        String email = "alex@company.com";
        String phone = "6464645645";
        String month = "June";
        String year = "1992";
        String hobby1 = "Music";
        String hobby2 = "Reading";
        String photoPath = "src/test/java/resources/1.png";
        String address = "Saint-P";
        String state = "NCR";
        String city = "Noida";

        String subject = "Biology";
        String photoPathName = "1.png";

        open("/automation-practice-form");

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $(byText(gender)).click();
        $("#userNumber").setValue(phone);

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day.react-datepicker__day--012").click();

        $("#subjectsInput").setValue("b");
        $(byText(subject)).click();
        $(byText(hobby1)).click();
        $(byText(hobby2)).click();

//      $("#uploadPicture").uploadFile(new File(photoPath));
        $("#uploadPicture").uploadFromClasspath("1.png");

        $("#currentAddress").setValue(address);

        $("#state").scrollTo().click();
        $(byText(state)).click();

        $("#city").click();
        $(byText(city)).click();

        $("#submit").scrollTo().click();

        $(".table-responsive").shouldHave(
                text("Student Name " + firstName + " " + lastName),
                text("Student Email " + email),
                text("Gender " + gender),
                text("Mobile " + phone),
                text("Date of Birth " + "12 June,1992"),
                text("Subjects " + subject),
                text("Hobbies " + hobby1 + ", " + hobby2),
                text("Picture " + photoPathName),
                text("Address " + address),
                text("State and City " + state + " " + city)
        );
    }
}
