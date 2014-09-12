package users;

public class User {
    private String id;

    private int mobile;

    private String mail;

    public User(String id, int mobile, String mail) {
        assert id != null && !id.isEmpty() : "id no valido";
        this.id = id;
        this.mobile = mobile;
        this.mail = mail;
    }

    public User(String id) {
        this(id, 0, "");
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User[" + id + ":" + mobile + "," + mail + "]";
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (other != null && this.getClass() == other.getClass()) {
            result = this.id.equals(((User) other).id);
        }
        return result;
    }

}
