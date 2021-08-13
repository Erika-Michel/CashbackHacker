package ru.netology.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfLessThan1000() {

        int expected = 155;

        int actual = service.remain(845);

        assertEquals (expected, actual);
    }

    @Test
    public void shouldCalculateIfMoreThan1000() {

        int expected = 334;

        int actual = service.remain(1666);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIf1000() {

        int expected = 0;

        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }
}