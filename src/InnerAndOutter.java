public class InnerAndOutter {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

class Solution {
    public static void main(String[] args) {
        InnerAndOutter myOuter = new InnerAndOutter();
        InnerAndOutter.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}
