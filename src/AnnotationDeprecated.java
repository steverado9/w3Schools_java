class AnnotationDeprecated {
    @Deprecated
    static void oldMethod() {
        System.out.println("This method is outdated.");
    }

    public static void main(String[] args) {
        oldMethod();
    }

}
