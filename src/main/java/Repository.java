import java.util.ArrayList;
import java.util.HashMap;


public class Repository {

    private String name;
    private ArrayList<Commit> commit;

    public Repository(String name, String description, String repositoryType) {
        this.name = name;
        commit = new ArrayList<Commit>();
    }


    public void addCommitToRepository(Repository repository, Commit commit) {
        this.commit.add(commit);
    }

    public int getCommitCount() {
        return this.commit.size();
    }
}