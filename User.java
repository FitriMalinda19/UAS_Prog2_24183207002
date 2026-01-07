
public abstract class User {
    protected String id; 
    protected String nama;

    public User() {}

    public User(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    public abstract void tampilInfo();
}

