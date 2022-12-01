package ru.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(10);

        int expected = 0;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(4);

        rad.nextRadioStationNumber();

        int expected = 5;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevRadioStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(8);

        rad.prevRadioStationNumber();

        int expected = 7;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(9);

        rad.nextRadioStationNumber();

        int expected = 0;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumberStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(0);

        rad.prevRadioStationNumber();

        int expected = 9;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNegativeStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStationNumber(-1);

        int expected = 0;

        int actual = rad.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(6);

        rad.increaseVolume();

        int expected = 7;

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetDescreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);

        rad.descreaseVolume();

        int expected = 4;

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int expected = 10;

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        rad.descreaseVolume();

        int expected = 0;

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNegativeVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-3);

        int expected = 0;

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


