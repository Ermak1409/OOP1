package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int maxStation = 10;
    private int numMaxStation = (maxStation - 1);
    private int numMinStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int currentStation, int maxStation, int numMinStation) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.numMinStation = numMinStation;
    }

    public Radio(int currentVolume, int maxVolume) {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }


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
        if (currentStation == numMaxStation) {
            currentStation = numMinStation;
            return;
        }
        if (currentStation < numMaxStation) {
            setCurrentStation(currentStation + 1);
        }
    }

    public void setPrevCurrentStation() {
        if (currentStation == numMinStation) {
            currentStation = numMaxStation;
            return;
        }

        if (currentStation > numMinStation) {
            setCurrentStation(currentStation - 1);
        }

    }

    public void setNewCurrentStationButton() {

        if (currentStation < numMinStation) {
            setCurrentStation(currentStation = 0);
            return;
        }
        if (currentStation > numMaxStation) {
            setCurrentStation(currentStation = 0);
        }

    }

    public void setUpCurrentVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }

    }

    public void setDownCurrentVolume() {
        if (currentVolume <= 0) {
            currentVolume = minVolume;
            return;
        }
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }

    }

}
