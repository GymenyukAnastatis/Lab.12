package task_1;

public class Test
{
    public static void main(String[] args)
    {
        Person person = new Person("Гой",  "Павел",  "Романович");
        System.out.println(person.getSNM());
        Person person2 = new Person("Козлова");
        System.out.println(person2.getSNM());
        Person person1 = new Person("Петрова", "Анастасия");
        System.out.println(person1.getSNM());
    }
}