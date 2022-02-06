package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testNewStationButton1() {
        Radio cond = new Radio();
        cond.setCurrentStation(10);
        cond.setNewCurrentStationButton();
        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNewStationButton2() {
        Radio cond = new Radio();
        cond.setCurrentStation(8);
        cond.setNewCurrentStationButton();
        int expected = 8;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNewStationButton3() {
        Radio cond = new Radio();
        cond.setCurrentStation(-1);
        cond.setNewCurrentStationButton();
        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.setNextCurrentStation();
        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation2() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.setNextCurrentStation();
        int expected = 1;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.setPrevCurrentStation();
        int expected = 8;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation2() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.setPrevCurrentStation();
        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        cond.setUpCurrentVolume();
        int expected = 10;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.setUpCurrentVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);
        cond.setDownCurrentVolume();
        int expected = 8;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.setDownCurrentVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownVolume3() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);
        cond.setDownCurrentVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        assertEquals(expected, actual);
    }
}