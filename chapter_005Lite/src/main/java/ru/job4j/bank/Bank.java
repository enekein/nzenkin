package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 05.07.2017.
 */
class Bank {
    /**
     * Hashmap to storage info about users accounts.
     */
    private Map<User, List<Account>> bills = new HashMap<>();

    /**
     * Constructor.
     * @param user User.
     * @param account Account.
     */
    Bank(User user, Account account) {
        List<Account> accountList = new ArrayList<>();
        accountList.add(account);
        bills.put(user, accountList);
    }

    /**
     * Add new user.
     * @param user User.
     */
    void addUser(User user) {
        bills.put(user, null);
    }

    /**
     * Delete user.
     * @param user User.
     */
    void deleteUser(User user) {
        if (bills.containsKey(user)) {
            bills.remove(user);
        }
    }

    /**
     * Add new account tot existing user.
     * @param user User.
     * @param account Account.
     */
    void addAccountToUser(User user, Account account) {
        List<Account> accountList = bills.get(user);
        accountList.add(account);
        bills.put(user, accountList);
    }

    /**
     * Delete account from existing user.
     * @param user User.
     * @param account Account.
     */
    void deleteAccountFromUser(User user, Account account) {
        List<Account> accountList = bills.get(user);
        accountList.remove(account);
        bills.put(user, accountList);
    }

    /**
     * Get all accounts from user.
     * @param user User.
     * @return List Account.
     */
    List<Account> getUserAccounts(User user) {
        return bills.get(user);
    }

    /**
     * Get Bills.
     * @return Map <User, List<Account>>.
     */
    Map<User, List<Account>> getBills() {
        return bills;
    }

    /**
     * Transfer money between accounts.
     * @param srcUser User.
     * @param srcAccount Account.
     * @param dstUser User.
     * @param dstAccount Account.
     * @param amount double.
     * @return boolean.
     */
    boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        List<Account> accountsSrc = bills.get(srcUser);
        List<Account> accountsDst = bills.get(dstUser);
        accountsSrc.remove(srcAccount);
        accountsDst.remove(dstAccount);

        if (amount > srcAccount.getValue() || accountsSrc.contains(srcAccount) || accountsDst.contains(dstAccount)) {
            return false;
        }

        srcAccount.transfer(amount * (-1.00));
        dstAccount.transfer(amount);

        accountsSrc.add(srcAccount);
        accountsDst.add(dstAccount);

        bills.put(srcUser, accountsSrc);
        bills.put(dstUser, accountsDst);
        return true;
    }
}
