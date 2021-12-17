package gmail.com.d.berezkin42;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {

//    @BeforeAll
//    static void beforeAllMethod() {
//        Configuration.browserSize = "1920x1080";
//    }

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
        $("#dateOfBirthInput").sendKeys("12 Apr 1961"); //dateOfBirthInput 12 Apr 1961

        $("#subjectsInput").setValue("Subject text"); //subjectsInput

        //hobbies-checkbox-3 click

        //uploadPicture

        $("#currentAddress").setValue("Random address"); //currentAddress
        //

    }


}
