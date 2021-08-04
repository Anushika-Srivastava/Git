package Git;

//Inheritance
class Person
{
    int age;
    String name,gen;
    Person(String name, int age, String gen)
    {
        this.name = name;
        this.age = age;
        this.gen = gen;
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    void setAge(int age)
    {
        this.age = age;
    }
    int getAge()
    {
        return age;
    }
    void setgender(String gen)
    {
        this.gen = gen;
    }
}
class Student extends Person
{
    int idNum,GPA;
    void setIdNum(int idNum)
    {
        this.idNum = idNum;
    }
    int getIdNum()
    {
        return idNum;
    }
    void setGPA(int GPA)
    {
        this.GPA = GPA;
    }
    int getGPA()
    {
        return GPA;
    }
}
class Teacher extends Person
{
    String sub;
    int sal;
    Teacher(String name, int age, String gen, String sub, int sal)
    {
        super(name,age,gen);
        this.sub = sub;
        this.sal = sal;
    }
    void display()
    {
        System.out.println("Name = " + super.name);
        System.out.println("Age = " + super.age);
        System.out.println("Gender = " + super.gen);
        System.out.println("Subject = " + sub);
        System.out.println("Salary = " + sal);
    }
    public static void main(String args[])
    {
        Teacher ob = new Teacher("Aman", 30, "Male", "Maths", 10000);
        ob.display();
    }
}
