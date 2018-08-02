package ua.com.rozetka.pages.main;

import ua.com.rozetka.pages.main.header.HeaderBlock;
import ua.com.rozetka.pages.main.left.block.LeftBlockPage;

public class MainPage {

    private HeaderBlock header = new HeaderBlock();
    private LeftBlockPage leftBlockPage = new LeftBlockPage();

    public HeaderBlock getHeader() {
        return header;
    }
    public LeftBlockPage getleftBlockPage() {
        return leftBlockPage;
    }





}
