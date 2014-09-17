package basics;

import java.util.ArrayList;
import java.util.List;

import users.User;

public class ListMain {
    private List<User> lista;

    public ListMain() {
        this.lista = new ArrayList<User>();
    }

    public boolean create(User user) {
        if (!this.lista.contains(user)) {
            this.lista.add(user);
            return true;
        } else {
            return false;
        }
    }

    public User read(String id) {
        User u = new User(id);
        int index = this.lista. indexOf(u);
        if (index != -1) {
            return this.lista.get(index);
        } else {
            return null;
        }
    }

}
