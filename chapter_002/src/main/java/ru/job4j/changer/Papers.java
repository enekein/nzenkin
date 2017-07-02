package ru.job4j.changer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 26.06.2017.
 */
class Papers {
    /**
     * Value of paper money.
     */
    private int value;

    /**
     * Constructor.
     * @param value int.
     */
    Papers(int value) {
        this.value = value;
    }

    /**
     * Getter value.
     * @return int.
     */
    int getValue() {
        return this.value;
    }

    /**
     * Exchange money.
     * @param listCoins ArrayList.
     * @return ArrayList.
     */
    List<Coins> exchange(List<Coins> listCoins) {
        Coins minCoin = listCoins.get(0);
        int result = 0;
        List<Coins> change = new ArrayList<>();

        for (Coins coins : listCoins) {
            do {
                result += coins.getValue();
                change.add(coins);
                if (coins.getValue() < minCoin.getValue()) {
                    minCoin = coins;
                }
            } while (result < this.getValue());

        }

        while (result > this.getValue()) {
            change.remove(minCoin);
            result -= minCoin.getValue();
        }
        return change;
    }

    /**
     * Optimal exchange money.
     * @param listCoins ArrayList.
     * @return ArrayList.
     */
    List<Coins> exchangeOptimal(List<Coins> listCoins) {
        Coins maxCoin = listCoins.get(0);
        int result = 0;
        List<Coins> change = new ArrayList<>();
        while (!listCoins.isEmpty()) {
            for (Coins coins : listCoins) {
                if (maxCoin.getValue() < coins.getValue()) {
                    maxCoin = coins;
                }
            }
            while (result < this.getValue()) {
                result += maxCoin.getValue();
                change.add(maxCoin);
            }
            if (result == this.getValue()) {
                return change;
            } else {
                change.remove(change.size() - 1);
                listCoins.remove(maxCoin);
                result -= maxCoin.getValue();
                maxCoin = listCoins.get(0);
            }
        }
        return change;
    }
}
