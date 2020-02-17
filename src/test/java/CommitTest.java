import com.sun.org.omg.CORBA.Repository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit1;
    private Commit commit2;

    @Before
    public void before(){

        commit1 = new Commit("First Commit", 1);
        commit2 = new Commit("Second Commit", 2);
    }

    @Test
    public void canGetCommitDescription(){
        assertEquals("First Commit", commit1.getDescription());
    }

    @Test
    public void canGetUniqueId() {
        assertEquals(1, commit1.getUniqueId());
    }

    @Test
    public void addToCommitsArrayList(){
        commit1.addCommitToRepository(commit1);
        commit1.addCommitToRepository(commit2);
        assertEquals(2, commit1.commitCount());

    }




}