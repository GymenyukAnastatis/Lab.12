package task_2;

public class Test
{
    public static void main(String[] args)
    {
        Address address = new Address();
        address.setAddress1("Россия.Московская область,Красногорск;Ленина.42,4;102");

        System.out.println(address);
        address.setAddress2("Россия.Московская область,Красногорск;Павшинский б-р.32,3;151");
        System.out.println(address);

        address.setAddress1("Россия,ПКамчатский край,Петропавловск-Камчатский,Ключевская,17,1,154");
        System.out.println(address);

        address.setAddress2("Россия.Амурская область,Благовещенск;Островского.155,3;112");
        System.out.println(address);
    }
}