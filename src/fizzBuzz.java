public class fizzBuzz {
    public static void main(String args[])
    {
        for(int i = 1; i <= 100; i++) //Loops from 1 - 100 and applies problem algorithm 
        {
            CheckProblem(i); 
        }
    }

    public static boolean IsMultipleOfThree(int num) 
    //Checks if divisible by 3 with no remainder
    {
        boolean isThree = false;
        if(num % 3 == 0)
        {
            isThree = true; 
        }
        return isThree;
    }

    public static boolean IsMultipleOfFive(int num) 
    //Checks if divisible by 5 with no remainder
    {
        boolean isFive = false;
        if (num % 5 == 0)
        {
            isFive = true;
        }
        return isFive;
    }

    public static boolean IsMultipleOfSeven(int num) 
    //Checks if divisible by 7 with no remainder
    {
        boolean isSeven = false;
        if(num % 7 == 0)
        {
            isSeven = true;
        }
        return isSeven;
    }

    public static void CheckProblem(int num)
    /* Applies rules of problem based on if number is divisible by 3, 5, 7 
    or a combination of these */
    {
        boolean three = IsMultipleOfThree(num); 
        boolean five = IsMultipleOfFive(num);
        boolean seven = IsMultipleOfSeven(num);

        if(three && seven)
        {
            System.out.println("fizzwoof");
        }
        else if(three && five)
        {
            System.out.println("fizzbuzz");
        }
        else if(five && seven)
        {
            System.out.println("buzzwoof");
        }
        else if(three)
        {
            System.out.println("fizz");
        }
        else if(five)
        {
            System.out.println("buzz");
        }
        else if(seven)
        {
            System.out.println("woof");
        }
        else
        {
            System.out.println(num);
        }
    }
}
