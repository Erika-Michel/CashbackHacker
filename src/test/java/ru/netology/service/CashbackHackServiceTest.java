package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfLessThan1000() {

        int expected = 155;

        int actual = service.remain(845);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfMoreThan1000() {

        int expected = 334;

        int actual = service.remain(1666);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIf1000() {

        int expected = 0;

        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}