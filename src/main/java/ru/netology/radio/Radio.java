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

        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public void setNextCurrentStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        if (currentStation < 9) {
            setCurrentStation(currentStation + 1);
        }
    }

    public void setPrevCurrentStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }

        if (currentStation > 0) {
            setCurrentStation(currentStation - 1);
        }

    }

    public void setNewCurrentStationButton() {

        if (currentStation < 0) {
            setCurrentStation(currentStation = 0);
            return;
        }
        if (currentStation > 9) {
            setCurrentStation(currentStation = 0);
        }

    }

    public void setUpCurrentVolume() {
        if (currentVolume == 10) {
            return;
        }
        if (currentVolume < 10) {
            setCurrentVolume(currentVolume + 1);
        }

    }

    public void setDownCurrentVolume() {
        if (currentVolume == 0) {
            return;
        }
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }

    }


}