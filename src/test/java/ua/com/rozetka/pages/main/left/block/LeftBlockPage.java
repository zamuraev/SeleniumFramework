package ua.com.rozetka.pages.main.left.block;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LeftBlockPage {


    public SelenideElement getHeader() {

      return  $("a#fat_menu_btn");


    }



}
