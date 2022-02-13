package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int maxQuantityStation = 10;
    private int currentVolume;


    public Radio() {
    }

    public Radio(int maxQuantityStation) {
        this.maxQuantityStation = maxQuantityStation;
    }


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
        if (currentStation > maxQuantityStation - 1) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void setNextCurrentStation() {

        if (currentStation >= maxQuantityStation - 1) {
            currentStation = 0;
            return;
        }
        setCurrentStation(currentStation + 1);

    }

    public void setPrevCurrentStation() {

        if (currentStation <= 0) {
            this.currentStation = maxQuantityStation - 1;
            return;
        }
        this.currentStation = currentStation - 1;

    }


    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void setUpCurrentVolume() {
        if (currentVolume >= 100) {
            this.currentVolume = 100;
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
