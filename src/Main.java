import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.print("Введите размер дерева: ");
        int n = sc.nextInt();
        int d = sc.nextInt();
        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            tree.insert(rand.nextInt(100));


        }
        tree.print();
        System.out.println("Минимальное значение в дереве: " + tree.minValue());
        System.out.println("Максимальное значение в дереве: " + tree.maxValue());
        System.out.println("Сумма элементов дерева: " + tree.sum());
        System.out.println("Колличество элементов дерева: " + tree.count());
        System.out.println("Среднее арифметическое элементов дерева: " + tree.avg());
       /* System.out.println("Введите элемент для удаления: ");
        System.out.println(tree.erase();*/

        UniqueTree u_Tree = new UniqueTree();
        for (int i = 0; i < n; i++) {
            u_Tree.insert(rand.nextInt(100));

        }
        u_Tree.clear();
        u_Tree.print();
        System.out.println("Минимальное значение в дереве: " + u_Tree.minValue());
        System.out.println("Максимальное значение в дереве: " + u_Tree.maxValue());
        System.out.println("Сумма элементов дерева: " + u_Tree.sum());
        System.out.println("Колличество элементов дерева: " + u_Tree.count());
        System.out.println("Среднее арифметическое элементов дерева: " + u_Tree.avg());
    }
}
