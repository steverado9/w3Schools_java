class InnerOuterClasses {
        int x = 10;

        class InnerClass {
            int y = 5;
        }
}

class Answer {
    public static void main(String[] args) {
        InnerOuterClasses myOuter = new InnerOuterClasses();
        InnerOuterClasses.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
