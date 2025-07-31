class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

class Display {
    public static void main(String[] args) {
        //access the inner class without creating an object of the outer class:
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y );
    }
}
