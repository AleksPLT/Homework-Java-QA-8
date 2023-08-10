package ru.netology.javaqa.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void radioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);
        int actual = radio.getRadioStationNumber();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void radioStationNumberWithCounter() {
        Radio radio = new Radio(11);
        radio.setRadioStationNumber(10);
        int actual = radio.getRadioStationNumber();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationUnderLimit() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(16);
        int actual = radio.getRadioStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void radioStationUnderLimitWithCounter() {
        Radio radio = new Radio(13);
        radio.setRadioStationNumber(13);
        int actual = radio.getRadioStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void radioStationBelowLimit() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-5);
        int actual = radio.getRadioStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValue1() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        int actual = radio.getRadioStationNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValue2() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        int actual = radio.getRadioStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValue3() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(8);
        int actual = radio.getRadioStationNumber();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValue4() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);
        int actual = radio.getRadioStationNumber();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValue5() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);
        int actual = radio.getRadioStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValue6() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);
        int actual = radio.getRadioStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);
        radio.next();
        int actual = radio.getRadioStationNumber();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationLimitValue1() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        radio.next();
        int actual = radio.getRadioStationNumber();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationLimitValue2() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);
        radio.next();
        int actual = radio.getRadioStationNumber();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationLimitValue3() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(8);
        radio.next();
        int actual = radio.getRadioStationNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationLimitValue4() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.next();
        int actual = radio.getRadioStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioStationLimitValueWithCounter1() {
        Radio radio = new Radio(10);
        radio.setRadioStationNumber(8);
        radio.next();
        int actual = radio.getRadioStationNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationLimitValueWithCounter2() {
        Radio radio = new Radio(10);
        radio.setRadioStationNumber(9);
        radio.next();
        int actual = radio.getRadioStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(6);
        radio.prev();
        int actual = radio.getRadioStationNumber();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevRadioStationLimitValueWithCounter() {
        Radio radio = new Radio(10);
        radio.setRadioStationNumber(0);
        radio.prev();
        int actual = radio.getRadioStationNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevRadioStationLimitValue1() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        radio.prev();
        int actual = radio.getRadioStationNumber();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationLimitValue2() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);
        radio.prev();
        int actual = radio.getRadioStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationLimitValue3() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.prev();
        int actual = radio.getRadioStationNumber();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeSet() {
        Radio radio = new Radio();
        radio.setVolume(55);
        int actual = radio.getVolume();
        int expected = 55;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeUnderLimit() {
        Radio radio = new Radio();
        radio.setVolume(110);
        int actual = radio.getVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeBelowLimit() {
        Radio radio = new Radio();
        radio.setVolume(-15);
        int actual = radio.getVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeSetLimitValue1() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int actual = radio.getVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeSetLimitValue2() {
        Radio radio = new Radio();
        radio.setVolume(1);
        int actual = radio.getVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeSetLimitValue3() {
        Radio radio = new Radio();
        radio.setVolume(99);
        int actual = radio.getVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioVolumeSetLimitValue4() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int actual = radio.getVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(55);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 56;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLimitValue1() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLimitValue2() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLimitValue3() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeSet() {
        Radio radio = new Radio();
        radio.setVolume(55);
        radio.reduceVolume();
        int actual = radio.getVolume();
        int expected = 54;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeLimitValue1() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.reduceVolume();
        int actual = radio.getVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeLimitValue2() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.reduceVolume();
        int actual = radio.getVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeLimitValue3() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.reduceVolume();
        int actual = radio.getVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

}