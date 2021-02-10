import java.util.*;

public class fizzBuzz {
    public static void main(String args[])
    {
        for(int i = 1; i <= 100; i++)
        {
            IsMultipleOfThree(i);
        }
    }

    public static void IsMultipleOfThree(int num)
    {
        ArrayList<Integer> split = new ArrayList<Integer>();
        int answer = 0;
        int num2 = num;
        boolean isThree = false; 
        if(num <= 9)
        {
            split.add(num);
        }
        else
        {
            while(num > 0)
            {
                int temp = num % 10;
                split.add(temp);
                num /= 10;
            }
        }
        for(int i : split)
        {
            answer = answer + i;
        }
        if(answer % 3 == 0)
        {
            isThree = true; 
        }
        IsMultipleOfFive(num2, isThree);
    }

    public static void IsMultipleOfFive(int num, boolean isThree)
    {
        int temp = num % 10;
        switch(temp)
        {
            case 0: 
                if(isThree == true)
                {
                    System.out.println("fizzbuzz");
                }
                else
                {
                    System.out.println("buzz");
                }
                break;
            case 5:
                if(isThree == true)
                {
                    System.out.println("fizzbuzz");
                }
                else
                {
                    System.out.println("buzz");
                }
                break;
            default:
                if(isThree == true)
                {
                    System.out.println("fizz");  
                }
                else
                {
                    System.out.println(num);  
                }  
        }
    }

}
