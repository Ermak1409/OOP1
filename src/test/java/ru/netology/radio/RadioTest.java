package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testNewStation1() {
        Radio cond = new Radio();
        cond.setNewCurrentStationButton(10);
        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNewStation2() {
        Radio cond = new Radio();
        cond.setNewCurrentStationButton(8);
        int expected = 8;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNewStation3() {
        Radio cond = new Radio();
        cond.setNewCurrentStationButton(-1);
        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation1() {
        Radio cond = new Radio();
        cond.setNextCurrentStation(9);
        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation2() {
        Radio cond = new Radio();
        cond.setNextCurrentStation(0);
        int expected = 1;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation1() {
        Radio cond = new Radio();
        cond.setPrevCurrentStation(9);
        int expected = 8;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation2() {
        Radio cond = new Radio();
        cond.setPrevCurrentStation(0);
        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpVolume1() {
        Radio cond = new Radio();
        cond.setUpCurrentVolume(10);
        int expected = 10;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpVolume2() {
        Radio cond = new Radio();
        cond.setUpCurrentVolume(0);
        int expected = 1;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownVolume1() {
        Radio cond = new Radio();
        cond.setDownCurrentVolume(9);
        int expected = 8;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownVolume2() {
        Radio cond = new Radio();
        cond.setDownCurrentVolume(0);
        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }
}