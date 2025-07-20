public class Scope {
    public static void main(String[] args) {
        //Code here Cannot use x
        //{ This is a block

            //code here Cannot use x

            int x = 100;

            //code here Can use x
            System.out.println(x);

         //}

        //code here CANNOT use x
    }
}
