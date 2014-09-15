package users;

import java.util.ArrayList;
import java.util.List;

public class UserHandlerCollection {

    private List<User> list;

    public UserHandlerCollection() {
        this.list = new ArrayList<User>();
    }

    public boolean create(User user) {
        if (this.list.contains(user)) {
            return false;
        } else {
            this.list.add(user);
            return true;
        }
    }

    public User read(String id) {
        int index = this.list.indexOf(new User(id));
        if (index != -1) {
            return this.list.get(index);
        } else {
            return null;
        }
    }

    public void delete(User user) {
        this.list.remove(user);
    }

    public void update(User user) {
        int index = this.list.indexOf(user);
        if (index != -1) {
            this.list.set(index, user);
        }
    }

    @Override
    public String toString() {
        return "UserHandler:" + list.toString();
    }

}
