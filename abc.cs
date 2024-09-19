using System;

namespace AccessSpecifiersExample
{
    // Class with various access specifiers
    public class Person
    {
        // Public field: Accessible from any class
        public string Name;

        // Private field: Accessible only within this class
        private int age;

        // Protected field: Accessible within this class and derived classes
        protected string address;

        // Internal field: Accessible within the same assembly
        internal string email;

        // Public method
        public void DisplayInfo()
        {
            Console.WriteLine($"Name: {Name}");
            Console.WriteLine($"Age: {age}");
            Console.WriteLine($"Address: {address}");
            Console.WriteLine($"Email: {email}");
        }

        // Private method
        private void SetAge(int age)
        {
            this.age = age;
        }

        // Protected method
        protected void SetAddress(string address)
        {
            this.address = address;
        }

        // Internal method
        internal void SetEmail(string email)
        {
            this.email = email;
        }
    }

    // Derived class
    public class Employee : Person
    {
        public void UpdateInfo()
        {
            // Accessing protected member from base class
            SetAddress("123 Main St");

            // Accessing internal member from base class (if in the same assembly)
            SetEmail("example@example.com");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Person person = new Person();
            person.Name = "John Doe";
            
            // Accessing public method
            person.DisplayInfo();

            // Cannot access private, protected, or internal members directly
            // person.age = 30; // Error: 'Person.age' is inaccessible due to its protection level
            // person.SetAge(30); // Error: 'Person.SetAge(int)' is inaccessible due to its protection level
        }
    }
}
