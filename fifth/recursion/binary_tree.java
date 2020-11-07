package fifth.recursion;

public class binary_tree {
     node root; //наш начальный узел
     public binary_tree(node node){
          this.root = node;
     }
     public void add(int value) {
          root = add(root, value);
     }
     private node add(node current, int value) {
          //добавляем в дерево элементы
          if (current == null) {
               //если пустое, то сделаем новое с началом value
               return new node(value);
          }
          if (value < current.value) {
               current.left = add(current.left, value);
          } else if (value > current.value) {
               current.right = add(current.right, value);
          } else {
               //уже есть
               return current;
          }

          return current;
     }
     public boolean containsNode(int value) {
          return search(root, value);
     }
     private boolean search(node current, int value) {
          if (current == null) {
               return false;
          }
          if (value == current.value) {
               return true;
          }
          return value < current.value
                  ? search(current.left, value)
                  : search(current.right, value);
     }
}
