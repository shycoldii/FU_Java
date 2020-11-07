package fifth.recursion;

public class node {
    //класс, хранящий значения и сохраняющий ссылку на каждый дочерний элемент
    int value;
    node left;
    node right;

    node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
