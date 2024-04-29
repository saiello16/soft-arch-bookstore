package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Book extends Product{

    String getAuthor();

    String getISBN();

    int getPages();

}
