import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.print("Введите размер дерева: ");
        int n = sc.nextInt();

        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            tree.insert(rand.nextInt(100));


        }
        tree.print();
        long srart_time, end_time;
        int value;
        srart_time = System.nanoTime();
        value = tree.minValue();
        System.out.println("Минимальное значение в дереве: " + tree.minValue());
        end_time = System.nanoTime();
        System.out.println("\tвычеслено за " + ( end_time - srart_time)*1e-9);
        System.out.println("Максимальное значение в дереве: " + tree.maxValue());
        System.out.println("Сумма элементов дерева: " + tree.sum());
        System.out.println("Колличество элементов дерева: " + tree.count());
        System.out.println("Среднее арифметическое элементов дерева: " + tree.avg());
System.out.println("Глубина дерева: " + tree.depth());

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
        System.out.println("Глубина дерева: " + u_Tree.depth());
       /* Tree tree  = new Tree(new int[]{50, 25, 75, 16, 32, 64, 80 });
        tree.print();
        System.out.print("Введите значение удаляемого элемента: ");
        int value = sc.nextInt();
        tree.erase(value);*/



    }
}
