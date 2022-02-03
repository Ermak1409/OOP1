package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextCurrentStation(int currentStation) {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void setPrevCurrentStation(int currentStation) {

        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public void setNewCurrentStationButton(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void setUpCurrentVolume(int currentStation) {

        if (currentStation < 10) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 10) {
            currentStation = 10;
        }
        this.currentVolume = currentStation;
    }

    public void setDownCurrentVolume(int currentStation) {

        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            currentStation = 0;
        }
        this.currentVolume = currentStation;
    }

}