package ru.job4j.bank;


import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 05.07.2017.
 */
public class BankTest {

    /**
     * Test method addUser(User).
     */
    @Test
    public void whenAddNewUserThenInMapMustBeNewUserWithAccount() {
        User user = new User("Vasya", 6312);
        Account account = new Account(100, 1234567);
        Bank bank = new Bank(user, account);
        User user2 = new User("Ivan", 6304);
        bank.addUser(user2);
        assertThat(bank.getBills().containsKey(user2), is(true));
    }

    /**
     * Test method deleteUser(User).
     */
    @Test
    public void whenDeleteExistingUserThenRemoveUserFromMap() {
        User user = new User("Vasya", 6312);
        Account account = new Account(100, 1234567);
        Bank bank = new Bank(user, account);
        User user2 = new User("Ivan", 6304);
        bank.addUser(user2);
        bank.deleteUser(user2);
        assertThat(bank.getBills().containsKey(user2), is(false));
    }

    /**
     * Test method addAccountToUser(User, Account).
     */
    @Test
    public void whenAddNewAccountToExistingUserThenAddThisAccountToMap() {
        User user = new User("Vasya", 6312);
        Account account = new Account(100, 1234567);
        Bank bank = new Bank(user, account);
        Account account2 = new Account(200, 2234567);
        bank.addAccountToUser(user, account2);
        assertThat(bank.getBills().get(user).contains(account2), is(true));
    }

    /**
     * Test method deleteAccountFromUser(User, Account).
     */
    @Test
    public void whenDeleteAccountToExistingUserThenDeleteThisAccountFromMap() {
        User user = new User("Vasya", 6312);
        Account account = new Account(100, 2234567);
        Bank bank = new Bank(user, account);
        Account account2 = new Account(100, 1234567);
        bank.addAccountToUser(user, account2);
        bank.deleteAccountFromUser(user, account2);
        assertThat(bank.getBills().get(user).contains(account2), is(false));
    }

    /**
     * Test method getUserAccounts(User, Account).
     */
    @Test
    public void whenGetUserAccountsThenReturnAllAccountsOfUser() {
        User user = new User("Vasya", 6312);
        Account account = new Account(200, 2234567);
        Bank bank = new Bank(user, account);
        Account account2 = new Account(100, 1234567);
        bank.addAccountToUser(user, account);
        account = new Account(200, 7654321);
        bank.addAccountToUser(user, account);
        List<Account> list = bank.getBills().get(user);
        List<Account> result = bank.getUserAccounts(user);
        for (int index = 0; index < result.size(); index++) {
            assertThat(result.get(index), is(list.get(index)));
        }
    }

    /**
     * Test method transferMoney(User, Account, User, Account, double).
     */
    @Test
    public void whenTransferMoneyFromOneAccountToAnotherThenAmountOfMoneyMustBeDecreaseFromSourceToDestination() {
        User user = new User("Vasya", 6312);
        Account account = new Account(300, 1234567);
        Bank bank = new Bank(user, account);
        Account account2 = new Account(100, 1234567);
        bank.addAccountToUser(user, account2);
        Account account3 = new Account(200, 7654321);
        bank.addAccountToUser(user, account3);
        boolean result = bank.transferMoney(user, account, user, account2, 50);
        assertThat(result, is(true));
    }
}
