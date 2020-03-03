using System;

namespace LeapYear
{
    class Program
    {
        static void Main(string[] args)
        {
            CalculateNext nextYear = new CalculateNext();
            Console.WriteLine(nextYear.FindNextYear(2004));
        }
    }

    class CalculateNext
    {
        public int FindNextYear(int year)
        {
            int i;
            for (i = year; i < year + 8; i++)
            {
                if (i % 4 == 0)
                {
                    if (i % 100 == 0)
                    {
                        if (i % 400 == 0)
                        {
                            break;
                        }
                    }
                    else
                    {
                        break;
                    }
                }
            }
            return i;
        }
    }
}
