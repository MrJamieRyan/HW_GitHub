import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RepositoryTest {

    private Repository firstrepo;
    private Commit firstcommit;
    private Repository secondrepo;
    private Commit secondcommit;


    @Before
    public void before(){
        this.firstrepo = new Repository(
                "First Repo",
                "My First GitHub Repo",
                "public");

        this.firstcommit = new Commit(
                "Initial Commit",
                210516);

        this.secondrepo = new Repository(
                "Ashamed",
                "This Repo Is Private Because I am Ashamed of It",
                "private");

        this.secondcommit = new Commit(
                "Uploading more terrible code!",
                112233);

    }

    @Test
    public void repositoryStartsEmpty(){
        assertEquals(0, firstrepo.repositoryCount());
    }

    @Test
    public void canAddRepositoryToCollection(){
        firstrepo.addRepositoryToCollection(firstrepo);
        assertEquals(1, firstrepo.repositoryCount());
    }

    @Test
    public void canAddCommitToRepository(){
        secondrepo.addCommitToRepository(secondrepo, secondcommit);
        assertEquals(1, secondrepo.repositoryCount());
    }



}