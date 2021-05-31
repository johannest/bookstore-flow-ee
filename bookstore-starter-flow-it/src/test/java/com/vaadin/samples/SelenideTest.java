package com.vaadin.samples;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByShadow;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    @Before
    public void setUp() {
        Configuration.startMaximized = false;
        Configuration.reportsFolder = "target/surefire-reports";
        open("http://localhost:8080/bookstore-starter-flow-ui-1.1-SNAPSHOT/");
    }

    @Test
    public void login() {
        $(ByShadow.cssSelector("[slot=\"input\"]", "[part=\"vaadin-login-native-form-wrapper\"]", "[id=\"vaadinLoginUsername\"]")).sendKeys("admin@vaadin.com");
    }
}
