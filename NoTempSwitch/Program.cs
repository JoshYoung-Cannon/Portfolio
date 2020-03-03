using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NoTempSwitch
{
    public class Values {
        int a;
        int b;

        public Values(int a, int b)
        {
            this.a = a;
            this.b = b;
        }

        public int GetA()
        {
            return this.a;
        }

        public int GetB()
        {
            return this.b;
        }

        public void SetA(int a)
        {
            this.a = a;
        }

        public void SetB(int b)
        {
            this.b = b;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Values Input = new Values(3, 5);
            InputSwitch Switchy = new InputSwitch();
            Console.WriteLine("a = " + Input.GetA() + ", b = " + Input.GetB());
            Input = Switchy.Switcher(Input);
            Console.WriteLine("a = " + Input.GetA() + ", b = " + Input.GetB());
        }
    }

    public class InputSwitch
    {
        public Values Switcher(Values Inputs)
        {
            Inputs.SetA(Inputs.GetA() + Inputs.GetB());
            Inputs.SetB(Inputs.GetA() - Inputs.GetB());
            Inputs.SetA(Inputs.GetA() - Inputs.GetB());

            return Inputs;
        }
    }
}
