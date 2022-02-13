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


    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextCurrentStation() {

        if (currentStation >= 9) {
            currentStation = 0;
            return;
        }
        currentStation = currentStation + 1;

    }

    public void setPrevCurrentStation() {

        if (currentStation <= 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;

    }


    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setUpCurrentVolume() {
        if (currentVolume >= 10) {
            this.currentVolume = 10;
            return;
        }

        this.currentVolume = currentVolume + 1;


    }

    public void setDownCurrentVolume() {
        if (currentVolume <= 0) {
            this.currentVolume = 0;
            return;
        }

        this.currentVolume = currentVolume - 1;

    }
}



