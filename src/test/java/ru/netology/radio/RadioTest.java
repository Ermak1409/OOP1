package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testNewStationButton1() {
        Radio radio = new Radio(20, 10, 0);
        radio.setNewCurrentStationButton();
        assertEquals(0, radio.getCurrentStation());
        
    }


    @Test
    public void testNewStationButton2() {
        Radio radio = new Radio(8, 10, 0);
        radio.setNewCurrentStationButton();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testNewStationButton3() {
        Radio radio = new Radio(-1, 10, 0);
        radio.setNewCurrentStationButton();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextStation1() {
        Radio radio = new Radio(0, 10, 0);
        radio.setNextCurrentStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testNextStation2() {
        Radio radio = new Radio(9, 10, 0);
        radio.setNextCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation1() {
        Radio radio = new Radio(8, 10, 0);
        radio.setPrevCurrentStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation2() {
        Radio radio = new Radio(0, 10, 0);
        radio.setPrevCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testUpVolume1() {
        Radio radio = new Radio(101,100);
        radio.setUpCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testUpVolume2() {
        Radio radio = new Radio(1,100);
        radio.setUpCurrentVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void testDownVolume1() {
        Radio radio = new Radio(0,100);
        radio.setDownCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testDownVolume2() {
        Radio radio = new Radio(100,100);
        radio.setDownCurrentVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void testDownVolume3() {
        Radio radio = new Radio(-1,100);
        radio.setDownCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
