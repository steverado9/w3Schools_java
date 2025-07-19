public class LoopingAnArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //using for loop to loop through an array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        //using for-each
        //for each string element of Array cars with index = i
        for (String i : cars) {
            System.out.println(i);
        }
        //Examples 1
        //find the avarage age
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg , sum = 0;

        //Get the length of the array
        int length = ages.length;

        //loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }
        //calculate the average by dividing the sum by the length
        avg = sum / length;

        //print the average
        System.out.println("The avarage age is: " + avg);

        //Example 2
        //find the lowest age
        int lowestAge = ages[0];

        //loop the the ages and find the lowest age
        for (int age : ages) {
            if (lowestAge > age)
                lowestAge = age;
        }
        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}
