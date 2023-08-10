package ru.netology.javaqa.radio;

public class Radio {
    int maxVolume = 100;
    int maxStation = 9;
    private int radioStationNumber;
    private int volume;

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void reduceVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void next() {
        if (radioStationNumber != maxStation) {
            radioStationNumber++;
        } else {
            radioStationNumber = 0;
        }
    }

    public void prev() {
        if (radioStationNumber != 0) {
            radioStationNumber--;
        } else {
            radioStationNumber = maxStation;
        }
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > maxStation) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }
}


