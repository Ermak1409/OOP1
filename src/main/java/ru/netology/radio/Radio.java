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

        if (currentStation >= 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;

    }

    public void setPrevCurrentStation(int currentStation) {

        if (currentStation <= 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;

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

    public void setUpCurrentVolume(int currentVolume) {
        if (currentVolume >= 10) {
            this.currentVolume = 10;
            return;
        }

        this.currentVolume = currentVolume + 1;


    }

    public void setDownCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            this.currentVolume = 0;
            return;
        }

        this.currentVolume = currentVolume - 1;

    }
}



