package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testNewStation1() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(10);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNewStation2() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(8);

        assertEquals(8, radio.getCurrentStation());
    }
    
    @Test
    public void testNewStation2() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(-1);

        assertEquals(0, radio.getCurrentStation());

    @Test
    public void testNextStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.setNextCurrentStation();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testNextStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setNextCurrentStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.setPrevCurrentStation();

        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.setPrevCurrentStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testUpVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.setUpCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testUpVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.setUpCurrentVolume();

        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void testDownVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.setDownCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testDownVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.setDownCurrentVolume();

        assertEquals(99, radio.getCurrentVolume());
    }


}
