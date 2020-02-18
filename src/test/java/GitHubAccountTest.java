import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    private GitHubAccount firstAccount;
    private GitHubAccount secondAccount;

]

    @Before
    public void before(){
        this.firstAccount = new GitHubAccount("SirDavidOfGray", "David", "Free");
        this.secondAccount = new GitHubAccount("IsOnFire", "Stokes", "Pro");
    }

    @Test
    public void canGetUsername(){
        assertEquals("SirDavidOfGray", firstAccount.getUsername());
    }

    @Test
    public void canGetName(){
        assertEquals("David", firstAccount.getName());
    }

    @Test
    public void canGetAccountType(){
        assertEquals("Free", firstAccount.getAccountType());
    }

    @Test
    public void canDowngradeAccountType(){
        secondAccount.downgrade(secondAccount);
        assertEquals("Free", secondAccount.getAccountType());
    }

    @Test
    public void canUpgradeAccountType(){
        firstAccount.upgrade(firstAccount);
        assertEquals("Pro", firstAccount.getAccountType());
    }



}