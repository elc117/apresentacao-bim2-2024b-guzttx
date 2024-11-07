public class Dog 
{
    private String name;
    private int age;            // atributos
    private String breed;

    public Dog (String name, int age, String breed)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
                                                // construtores
    public Dog(String name)
    {
        this.name = name;
        this.age = 5;
        this.breed = "Caramelo";
    }
    
    
    public String getName()    // métodos
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void bark()    
    {
        System.out.println(name + " diz: Au au!");
    }

    public void play(int playtime, String toy)
    {
        System.out.println(name + " brincou de " + toy + " por " + playtime + " minutos");
    }

    public void eat(String food)
    {
        System.out.println(name + " comeu " + food);
    }

    public void infos()
    {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Raça: " + breed);
    }
}