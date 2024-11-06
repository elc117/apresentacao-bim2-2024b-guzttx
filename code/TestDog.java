public class TestDog 
{
    public static void main(String[] args) 
    {
        Dog dog1 = new Dog("Unknown");
        Dog dog2 = new Dog("Kiba", 1, "Shiba Inu");
        
        String oldname = dog1.getName();
        System.out.println("Nome antigo do cachorro 1: " + oldname+"\n");
        dog1.setName("Suzi");

        System.out.println("Cachorro 1 foi adotado e agora se chama: " + dog1.getName()+"\n");
        System.out.println("Informações do cachorro 1:");
        dog1.infos();
        dog1.bark();
        dog1.play(10, "osso");
        dog1.eat("ração e arroz");
        
        System.out.println("\n");
        System.out.println("Informações do cachorro 2:");
        dog2.infos();
        dog2.bark();
        dog2.play(15, "bolinha");
        dog2.eat("ração");
    }

}
