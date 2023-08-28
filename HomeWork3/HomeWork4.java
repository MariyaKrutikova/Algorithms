public class HomeWork4 {

    public static void main(String[] args) {
            RedBlackTree tree = new RedBlackTree();
            tree.add(10);
            tree.add(5);
            tree.add(15);
            tree.add(8);
            tree.add(1);
            tree.add(6);
            tree.add(22);
    
            System.out.println("Обход в ширину:");
            tree.breadthFirstTraversal();
    
            System.out.println("Симметричный обход(выводит вершины в отсортированном порядке):");
            tree.inorderTraversal();
    
    
            System.out.println("\n");
            System.out.println("tree.exist(22) = " + tree.exist(22));
            System.out.println("tree.exist(2) = " + tree.exist(2));
            System.out.println("tree.exist(220) = " + tree.exist(220));
            System.out.println("tree.exist(5) = " + tree.exist(5));
            System.out.println("tree.exist(15) = " + tree.exist(15));   
    
        }
}
