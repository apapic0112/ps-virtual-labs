package si.elixir.vlabs.users.helper;

import si.elixir.vlabs.users.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserHelper {

    private static List<User> users = new ArrayList<>(Arrays.asList(
        new User(100,"Ales", "Papic", new ArrayList<>(Arrays.asList(1200))),
        new User(153,"Janez", "Novak", new ArrayList<>(Arrays.asList(1173)))
    ));

    public static List<User> getUserById(int id) {
        List<User> result = new ArrayList<>();
        for (User u : users) {
            if (u.getId() == id) {
                result.add(u);
                break;
            }
        }
        return result;
    }
}
