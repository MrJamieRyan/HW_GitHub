import java.util.ArrayList;

public class Commit {

    private String description;
    private int uniqueId;
    private ArrayList<Commit> commits;

    public Commit(String description, int uniqueId) {
        this.description = description;
        this.uniqueId = uniqueId;
        this.commits = new ArrayList<Commit>();
    }

    public String getDescription() {
        return this.description;
    }

    public int getUniqueId() {
        return this.uniqueId;
    }

    public int commitCount(){
        return this.commits.size();
    }

    public void addCommitToRepository(Commit commit){
        this.commits.add(commit);
    }
}