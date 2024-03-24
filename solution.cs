```C#
using System;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter the first string:");
        string str1 = Console.ReadLine();

        Console.WriteLine("Enter the second string:");
        string str2 = Console.ReadLine();

        if (IsScramble(str1, str2))
        {
            Console.WriteLine("The second string is a scrambled version of the first string.");
        }
        else
        {
            Console.WriteLine("The second string is not a scrambled version of the first string.");
        }
    }

    static bool IsScramble(string str1, string str2)
    {
        if (str1.Length != str2.Length)
        {
            return false;
        }

        var str1CharCount = str1.GroupBy(c => c).ToDictionary(g => g.Key, g => g.Count());
        var str2CharCount = str2.GroupBy(c => c).ToDictionary(g => g.Key, g => g.Count());

        return str1CharCount.Keys.All(k => str2CharCount.ContainsKey(k) && str2CharCount[k] == str1CharCount[k]);
    }
}
```