

public class Tree {
    protected class Element {
        protected int Data;
        protected Element Left;
        protected Element Right;

        public Element(int data) {
            Data = data;
            Left = null;
            Right = null;
            System.out.println("EConstractor:\t" + Integer.toHexString(hashCode()));
        }

        @Override
        protected void finalize() {
            //super.finalize();
            System.out.println("EDestructor:" + Integer.toHexString(hashCode()));
        }
    }

    protected Element Root;

    public Element getRoot() {
        return Root;
    }

    public Tree() {
        Root = null;
        System.out.println("TConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public void insert(int Data) {
        insert(Data, Root);
    }

    private void insert(int Data, Element Root) {
        if (this.Root == null)
            this.Root = new Element(Data);
        if (Root == null)
            return;
        if (Data < Root.Data) {
            if (Root.Left == null)
                Root.Left = new Element(Data);
            else insert(Data, Root.Left);
        } else {
            if (Root.Right == null)
                Root.Right = new Element(Data);
            else insert(Data, Root.Right);
        }
    }
/*public void erase(int Data){
        erase(Root, Data);
        return erase(Element);
}*/
protected Element erase(Element left, int Data){
        if(Root == null) return null;
        if(Data == Root.Data){
            if(Root.Left == Root.Right){
                Root = null;
                System.gc();
            }
           if (Data < Root.Data)
               Root.Left = erase(Root.Left, Data);
           else if (Data > Root.Data)
               Root.Right = erase(Root.Left, Root.Right. Data);
           else {
               if(Root.Left == null)
                   return Root.Right;
               else  if (Root.Right == null)
                   return Root.Left;
               Root.Data = minValue(Root.Right);
               Root.Right = erase(Root.Right, Root.Data);
            }
           return Root;
        }
    return null;
}
    protected void clear() {
        Root = null;
        System.gc();
    }

    public int minValue() {
        return minValue(Root);
    }

    private int minValue(Element Root) {
        if (Root == null) return 0;
        if (Root.Left == null)
            return Root.Data;
        else return minValue(Root.Left);

    }

    public int maxValue() {

        return maxValue(Root);

    }

    private int maxValue(Element Root) {
        if (Root == null) return 0;
        if (Root.Right == null)
            return Root.Data;
        else return maxValue(Root.Right);
    }

    public int sum() {
        return sum(Root);

    }

    private int sum(Element Root) {
        if (Root == null) return 0;
        else return sum(Root.Left) + sum(Root.Right) + Root.Data;


    }

    public int count() {
        return count(Root);
    }

    private int count(Element Root) {
        if (Root == null) return 0;
        else return count(Root.Left) + count(Root.Right) + 1;
    }

    public double avg() {
        return (double) sum(Root) / count(Root);
    }

    public void print() {
        print(Root);
        System.out.println();
    }

    private void print(Element Root) {
        if (Root == null) return;
        print(Root.Left);
        System.out.print(Root.Data + "\t");
        print(Root.Right);

    }


}



