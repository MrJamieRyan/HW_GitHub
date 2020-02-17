import java.util.ArrayList;
import java.util.HashMap;


public class Repository {

    private String name;
    private HashMap<String, Repository> repositories;

    public Repository(String name, String description, String repositoryType) {
        this.name = name;
        ArrayList<Commit> commit = new ArrayList<Commit>();
        this.repositories = new HashMap<String, Repository>();
    }

    public int repositoryCount() {
        return this.repositories.size();
    }

    public void addRepositoryToCollection(Repository repository) {
        this.repositories.put(this.name, repository);
    }

    public void addCommitToRepository(Repository repository, Commit commit) {

    }

    public void getCommitsInRepositoryCount() {
    }
}