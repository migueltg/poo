package users;

import upm.jbb.IO;

public class UserController {
    private UserHandler userHandler;

    public UserController() {
        this.userHandler = new UserHandler();
    }

    public void create() {
        User user = (User) IO.in.read(User.class, "Usuario");
        if (userHandler.create(user)) {
            IO.out.println("Usuario creado satisfactoriamente!");
        } else {
            IO.out.println("Usuario no creado");
        }
    }

    public void read() {
        String id = IO.in.readString("Dame ID");
        User user = userHandler.read(id);
        if (user == null) {
            IO.out.println("Usuario no encontrado");
        } else {
            IO.out.println("Usuario:" + user);
        }
    }

    public void update() {
        String id = IO.in.readString("Dame ID");
        User user = userHandler.read(id);
        user = (User) IO.in.read(user, "");
        userHandler.update(user);
    }

    public void delete() {
        String id = IO.in.readString("Dame ID");
        userHandler.delete(new User(id));
    }

    public void view() {
        IO.out.println(userHandler.toString());
    }

    public static void main(String[] args) {
        IO.in.addController(new UserController());
    }

}
