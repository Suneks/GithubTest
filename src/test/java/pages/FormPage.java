package pages;
import pages.components.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import pages.components.CalendarComponent;


public class FormPage {

    private CalendarComponent calendarComponent = new CalendarComponent();
    private CheckTable CheckTable = new CheckTable();

    private String
        page = "/automation-practice-form",
        firstNameInput = "#firstName",
        lastNameInput = "#lastName",
        emailInput = "#userEmail",
        mobileNumberInput = "#userNumber",
        calendarInput = "#dateOfBirthInput",
        subjectInput = "#subjectsInput",
        fileInput = "#uploadPicture",
        addressInput = "#currentAddress",
        stateInput = "#state",
        cityInput = "#city",
        submitButton = "#submit",
        resultsTable = ".table-responsive";


    public FormPage openPage() {
        open(page);
        return this;
    }

    public FormPage setFirstName(String firstName) {
        $(firstNameInput).setValue(firstName);
        return this;
    }

    public FormPage setLastName(String lastName) {
        $(lastNameInput).setValue(lastName);
        return this;
    }

    public FormPage setUserEmail(String userEmail) {
        $(emailInput).setValue(userEmail);
        return this;
    }

    public FormPage setGender(String gender) {
        $(byText(gender)).click();
        return this;
    }

    public FormPage setUserNumber(String userNumber) {
        $(mobileNumberInput).setValue(userNumber);
        return this;
    }

    public FormPage setBirthDate(String year, String month, String day) {
        $(calendarInput).click();
        calendarComponent.setDate(year, month, day);
        return this;
    }

    public FormPage setSubjects(String subject, String letter) {
        $(subjectInput).setValue(letter);
        $(byText(subject)).click();
        return this;
    }

    public FormPage setHobbies(String hobby1) {
        $(byText(hobby1)).click();
        return this;
    }

    public FormPage uploadPicture(String fileName) {
        $(fileInput).uploadFromClasspath(fileName);
        return this;
    }

    public FormPage setAddress(String address) {
        $(addressInput).setValue(address);

        return this;
    }

    public FormPage setState(String state) {
        $(stateInput).scrollTo().click();
        $(byText(state)).click();
        return this;
    }

    public FormPage setCity(String city) {
        $(cityInput).click();
        $(byText(city)).click();
        return this;
    }

    public FormPage clickSubmit() {
        $(submitButton).click();
        return this;
    }

    public FormPage checkTableRightData(String firstName, String lastName, String email,
                                        String gender, String phone, String day, String month,
                                        String year, String subject, String hobby1,
                                        String photoPathName, String address,
                                        String state, String city) {
        CheckTable.checkTableData(firstName, lastName, email,
                                  gender, phone, day, month, year, subject,
                                  hobby1, photoPathName, address,
                                  state, city);
        return this;
    }
}

