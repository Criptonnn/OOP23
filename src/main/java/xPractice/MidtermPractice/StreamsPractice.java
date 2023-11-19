package xPractice.MidtermPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class User {
    public String username;
    public User(String name) {
        this.username = name;
    }
}

class StreamsPractice {

    public static List<Integer> filterOdd(List<Integer> list) {
        List<Integer> filteredList = list.stream()
                .filter(n -> n%2==1).toList();

        return filteredList;
    }

    public static List<User> toUpperCase(List<User> userList) {
//        List<User> modifiedList = userList.stream()
//                .map(user -> new User(user.username.toUpperCase())).toList();
//        List<User> modifiedList = userList.stream()
//                .map(user -> user.username.toUpperCase()).toList();

        List<User> modifiedList = userList.stream()
                .map(user -> userList.set(userList.indexOf(user), new User(user.username.toUpperCase()))).toList();

        return modifiedList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        List<Integer> filteredList = filterOdd(list);
        for(Integer i : filteredList) {
            System.out.print(i + " ");
        }

        List<User> userList = new ArrayList<>(Arrays.asList(new User("emirp"), new User("farisg")));
        toUpperCase(userList);
        for(User u : userList) {
            System.out.println(u.username);
        }
    }
}
