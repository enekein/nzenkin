package ru.job4j.changer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 02.07.2017.
 */
public class PapersTest {
    /**
     * Test method exchange(List).
     */
    @Test
    public void whenExchangeOneHundredRublesThenReturnListOfCoins() {
        Coins coins = new Coins(10);
        Papers papers = new Papers(100);
        List<Coins> listCoins = new ArrayList<>();
        listCoins.add(coins);
        List<Coins> result = papers.exchange(listCoins);
        List<Coins> expected = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            expected.add(coins);
            assertThat(result.get(i).getValue(), is(expected.get(i).getValue()));
        }
    }
    /**
     * Test method exchangeOptimal(List).
     */
    @Test
    public void whenOptimalExchangeOneHundredRublesThenReturnListOfCoins() {
        Coins coins = new Coins(10);
        Coins coinsSecondType = new Coins(5);
        Papers papers = new Papers(95);
        List<Coins> listCoins = new ArrayList<>();
        listCoins.add(coins);
        listCoins.add(coinsSecondType);
        List<Coins> result = papers.exchangeOptimal(listCoins);
        List<Coins> expected = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            expected.add(coins);
            assertThat(result.get(i).getValue(), is(expected.get(i).getValue()));
        }
        expected.add(coinsSecondType);
        assertThat(result.get(9).getValue(), is(expected.get(9).getValue()));
    }
}
