package users;

import java.util.Arrays;

public class UserHandler {
    private static final int MAX_SIZE = 5;

    private User[] users;

    public UserHandler() {
        this.users = new User[MAX_SIZE];
    }

    private int find(String id) {
        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i] != null && this.users[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public boolean create(User user) {
        boolean result = false;
        if (this.find(user.getId()) == -1) {
            for (int i = 0; i < this.users.length; i++) {
                if (this.users[i] == null) {
                    this.users[i] = user;
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public User read(String id) {
        int index = this.find(id);
        if (index != -1) {
            return this.users[index];
        } else {
            return null;
        }
    }

    public void delete(User user) {
        int index = this.find(user.getId());
        if (index != -1) {
            this.users[index] = null;
        }
    }

    public void update(User user) {
        int index = this.find(user.getId());
        assert index != -1 : "Se debe crear primero";
        this.users[index] = user;
    }

    @Override
    public String toString() {
        return "UserHandler:" + Arrays.toString(users);
    }

}
