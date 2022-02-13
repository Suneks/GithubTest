package pages.components;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckTable {
    public void checkTableData(String firstName, String lastName, String email,
                                String gender, String phone, String day, String month,
                                String year, String subject, String hobby1,
                                String photoPathName, String address,
                                String state, String city) {
        $(".table-responsive").shouldHave(
                text("Student Name " + firstName + " " + lastName),
                text("Student Email " + email),
                text("Gender " + gender),
                text("Mobile " + phone),
                text("Date of Birth " + "0" + day + " " + month + "," + year),
                text("Subjects " + subject),
                text("Hobbies " + hobby1),
                text("Picture " + photoPathName),
                text("Address " + address),
                text("State and City " + state + " " + city)
                 );
    }
}
