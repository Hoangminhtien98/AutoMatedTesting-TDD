package nexday;

import nextday.NextDay;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayTest {
    @Test
    @DisplayName("TestCase1") //ngày thường , tháng thường
    void findNextDay(){
        int day = 15;
        int month = 2;
        int year = 2000;

        String expect = "16/2/2000";
        assertEquals(expect, NextDay.findNextDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase2") //ngày cuối tháng, ngày 31
    void findNextDay1(){
        int day = 31;
        int month = 1;
        int year = 2000;

        String expect = "1/2/2000";
        assertEquals(expect, NextDay.findNextDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase3") //ngày cuối tháng, ngày 30
    void findNextDay2(){
        int day = 30;
        int month = 4;
        int year = 2000;

        String expect = "1/5/2000";
        assertEquals(expect, NextDay.findNextDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase4") //tháng 2 năm nhuận ngày cuối tháng
    void findNextDay3(){
        int day = 29;
        int month = 2;
        int year = 2000;

        String expect = "1/3/2000";
        assertEquals(expect, NextDay.findNextDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase5") //tháng 2 năm nhuận
    void findNextDay4(){
        int day = 28;
        int month = 2;
        int year = 2000;

        String expect = "29/2/2000";
        assertEquals(expect, NextDay.findNextDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase6") //tháng 2 năm không nhuận ngày cuối tháng
    void findNextDay5(){
        int day = 28;
        int month = 2;
        int year = 2001;

        String expect = "1/3/2001";
        assertEquals(expect, NextDay.findNextDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase7") //tháng 2 năm không nhuận , ngày sai
    void findNextDay6(){
        int day = 29;
        int month = 2;
        int year = 2001;

        String expect = "Không có ngày kể trên!!!";
        assertEquals(expect, NextDay.findNextDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase8") //ngày cuối năm
    void findNextDay7(){
        int day = 31;
        int month = 12;
        int year = 2001;

        String expect = "1/1/2002";
        assertEquals(expect, NextDay.findNextDay(day, month, year));
    }
}
