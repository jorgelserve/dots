package usuario;

public class Usuario {
    public String username;
    public int max_score;
    public int score;
    public int level;
    public int hash;
    public boolean control;

    public Usuario(String username, int max_score, int score, int level, int hash, boolean control) {
        this.username = username;
        this.max_score = max_score;
        this.score = score;
        this.level = level;
        this.hash = hash;
        this.control = control;
    }

}
