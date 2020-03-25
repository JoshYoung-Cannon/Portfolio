using System;
using System.Collections.Generic;

namespace Isogram
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please Enter a word to test:");
            string word = Console.ReadLine();
            Console.WriteLine(new Checker().IsIsogram(word));
        }
    }

    class Checker
    {
        public bool IsIsogram(string word)
        {
            char[] chars = word.ToLower().ToCharArray();
            bool duplicates = false;
            for (int i = 0; i < chars.Length - 1; i++)
            {
                for (int j = i + 1; j < chars.Length; j++)
                {
                    if (chars[i].Equals(chars[j]))
                    {
                        duplicates = true;
                    }
                }
            }
            return !duplicates;
        }
    }
}
