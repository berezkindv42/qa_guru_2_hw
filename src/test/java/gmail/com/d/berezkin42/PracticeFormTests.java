package gmail.com.d.berezkin42;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.File;
import java.security.Key;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {

    @BeforeAll
    static void beforeAllMethod() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void runTests() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Vasiliy"); //firstName
        $("#lastName").setValue("Pupkin"); //lastName
        $("#userEmail").setValue("vasiliy.p@email.com"); //userEmail
        $("label.custom-control-label").shouldHave(text("Male")).click();
        //$(".custom-control-label").shouldHave(text("Male")).click();
        //$(byText("Male")).click();
        //$(".custom-control-label").click(); //gender-radio-1
        $("#userNumber").setValue("4951234567"); //userNumber
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL+"a");
        $("#dateOfBirthInput").sendKeys("12 Apr 1961", Keys.ENTER); //dateOfBirthInput 12 Apr 1961
        $("#subjectsInput").sendKeys("e");
        $(".subjects-auto-complete__menu #react-select-2-option-0").click();
        //$("#subjectsInput").setValue("English").pressEnter(); //subjectsInput
        $(byText("Sports")).click(); //hobbies-checkbox-3 click
        $(byText("Reading")).click(); //hobbies-checkbox-3 click
        $(byText("Music")).click(); //hobbies-checkbox-3 click
        $("#uploadPicture").uploadFile(new File("src/test/java/resourses/testUploadFile1.png")); //uploadPicture
        $("#currentAddress").setValue("Random address"); //currentAddress

        $("#state").scrollTo().click();
        $(".  #react-select-2-option-0").click();
        //$(byText("NCR")).click();
        $("#react-select-4-input").selectOption("Noida");

        //city



    }


}
