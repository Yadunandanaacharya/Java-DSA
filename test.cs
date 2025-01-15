using System;

public class HelloWorld
{

    public static void Main(string[] args)
    {
        int[] arr = new int[] { 56789 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.Length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }

            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        Console.WriteLine(min + " " + max);
    }
}
