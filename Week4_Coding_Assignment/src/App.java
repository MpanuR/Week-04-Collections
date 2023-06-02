public class App {
   
    public static void main(String[] args) throws Exception {
       
        //exercise number 1 create array of int called ages
        int [] ages = {3,9,23,64,2,8,28,93};

        //a. subtract value of the first element in the array from the value of last element
        int value;
        value = ages[0] - ages[ages.length - 1];

        System.out.println(value);

        //b add new age to array and repeat above
        int newAge = 29;
        
        // new array
        int [] newArr = new int[ages.length + 1];

            //assigns array ages to new array
            for (int i = 0; i < ages.length; i++)
            {
                newArr[i] = ages[i];
            }
            
            //assigns last index of  newArr array to newAge
         newArr[newArr.length - 1] = newAge;
         ages = newArr;

         value = ages[0] - ages[ages.length - 1];

        System.out.println(value);
        
        int total=0;
        for (int i = 0; i < ages.length; i++)
        {
            total +=  ages[i];
        }

        System.out.println("Average age is = " + (total/ages.length));


        String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        int totalLetter = 0;
        //totalLetter = names[0].length();
        
        for(int i = 0; i < names.length; i++)
        {
            totalLetter += names[i].length();
            
        }

        double avgName = (double) totalLetter / names.length;
        System.out.println("Average number of letters in name: " + avgName);

        StringBuilder concatenatedName = new StringBuilder();
        for (int i = 0; i < names.length; i++)
        {
            concatenatedName.append(names[i]).append("");
        }

        System.out.println("Concatenated names: " + concatenatedName.toString().trim());

        /*3. How do you access the last element in array?
        arrayName[arrayName.length - 1];
        
        4. How do you access the first element of any array?
        arrayName[0];

        */

        //5. creates an array called namelengths
        int [] nameLengths =  new int[names.length];
        //Initialize namelengths with lengths of names from previous array
        for (int i = 0; i < nameLengths.length; i++)
        {
            nameLengths[i] = names[i].length();
        }

        //6. calculates sum of all elements in nameLengths array
        int sum = 0;
        for (int i = 0; i < nameLengths.length; i++)
        {
            sum += nameLengths[i];
        }

        System.out.println("Sum of name lengths: " + sum);

//implementation of methods
        String str = "Homework";
        int numb = 10;
        String first = "Ralph", last = "Mpanu";
        double [] testArray = {30.00, 500.00, 3.14, 99.99, 75.5,200.00};
        double [] secondTest = {100.00, 34.56, 87.00, 2.50, 173.40};
        double recLength = 20.00, recWidth = 5.50;
        boolean isHotOutside = true;
        double moneyInPocket = 15.85;
        System.out.println("Concatenated Method call: " + concatenatedMethod(str, numb));
        System.out.println("FullName method call result: " + fullNameMethod(first, last));
        System.out.println("arrMethod call result: " + arrMethod(newArr));
        System.out.println("average element method call result: " + avgElementsMethod(testArray));
        System.out.println("greaterArray method call result: " + greaterArray(testArray, secondTest));
        System.out.println("willBuyDrink method call result: " + willBuyDrink(isHotOutside, moneyInPocket));
        System.out.println("Area of rectangle : " + calAreaOfRectangle(recLength, recWidth));
    }
    //7. creates a method that takes a String, word, and an int, n, as arguments and 
    //returns the word concatenated to itself n number of times. 
    public static String concatenatedMethod ( String word, int n)
    {
        String result = "";
        // initialize string varible result with word
        for (int i = 0; i < n; i++)
        {
            result += word;
        }
        return result;
    }
//8. create a method that returns first and last name
    public static String fullNameMethod (String firstName, String lastName)
    {   
        String fullname = firstName + " " + lastName;
        return fullname;
    }
//9. create a method that takes an array of ints and returns true if the sum is greater than 100
    public static boolean arrMethod (int [] arr)
    {
        int sum = 0;
        //initialize sum to elements in arr.
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        //checks if sum is greater than 100
        if (sum > 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
// creates a method that takes an array of double and returns average of all elements in the array
    public static double avgElementsMethod(double [] arraySum) 
    {   
        double avgofSum = 0;
        //initialize average of sum by iterating through array elements
        for (int i = 0; i < arraySum.length; i++)
        {
            avgofSum += arraySum[i];
        }
        return avgofSum/arraySum.length;
    }
//creates a method that compares two arrays and returns true if the average of array 1 is > then array2
    public static boolean greaterArray(double [] arrayOne, double [] arrayTwo)
    {
        double sum1 = 0, sum2 = 0;
        //initialize first array
        for (int i = 0; i  < arrayOne.length; i++)
        {
            sum1 += arrayOne[i];
        }
        //initialize second array
        for (int i = 0; i < arrayTwo.length; i++)
        {
            sum2 += arrayTwo[i];
        }
        //calculates average of both
        double avgOfSum1 = sum1 / arrayOne.length;
        double avgOfSum2 = sum2 / arrayTwo.length;

        //checks if average of array one is > array two
        if ( avgOfSum1 > avgOfSum2)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }

// creates a boolean method that returns true if conditions to buy drink are true
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
    {
       return isHotOutside && moneyInPocket > 10.50;
        
    }
// creates a method that calculates the area of a rectangle
    public static double calAreaOfRectangle (double length, double width)
    {
        return length * width;
    }

}
