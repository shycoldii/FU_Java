package task;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class UserTest extends TestCase {

    public void testGetUsers() {
        User user = new User("Даша","Ж",19);
        User user1 = new User("Полина","Ж",19);
        User user2 = new User("Лиза","Ж",20);
        User.addUser(user);
        User.addUser(user1);
        User.addUser(user2);
        List<User> actual = User.getUsers();
        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);
        Assert.assertEquals(expected,actual);
    }

    public void testGetUsersBySex() {
        User user = new User("Даша","Ж",19);
        User user1 = new User("Полина","Ж",19);
        User user2 = new User("Лиза","Ж",20);
        User.addUser(user);
        User.addUser(user1);
        User.addUser(user2);
        List<User> actual = User.getUsersBySex("Ж");
        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);
        Assert.assertEquals(expected,actual);
    }

    public void testGetCount() {
        User user = new User("Даша","Ж",19);
        User user1 = new User("Полина","Ж",19);
        User user2 = new User("Лиза","Ж",20);
        User.addUser(user);
        User.addUser(user1);
        User.addUser(user2);
        int actual = User.getCount();
        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);
        Assert.assertEquals(expected.size(),actual);
    }

    public void testGetCountBySex() {
        User user = new User("Даша","Ж",19);
        User user1 = new User("Полина","Ж",19);
        User user2 = new User("Лиза","Ж",20);
        User.addUser(user);
        User.addUser(user1);
        User.addUser(user2);
        int actual = User.getCountBySex("Ж");
        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);
        Assert.assertEquals(expected.size(),actual);
    }
}