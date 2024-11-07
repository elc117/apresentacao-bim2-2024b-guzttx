# Crie sua classe
### _em Java_,
###### by Gustavo Teixeira
## Classe "Dog"
#### Definindo uma classe em Java:

```sh
public class Dog
{
    //atributos
    //construtores
    //métodos
}
```

Vamos aos atributos!
Estes consistem nas informações básicas da nossa classe, ou seja, basicamente os elementos internos de uma struct, se comparado com C.

```sh
public class Dog
{
    private String name;
    private int age;            // atributos
    private String breed;
}
```
Neste exemplo de código, temos as informações sobre um cachorro, sendo elas seu nome, sua idade e sua raça, respectivamente.

Agora, vamos para os construtores.
Os construtores se definem como blocos de códigos especiais dentro de uma classe, sendo designados para inicalizar novos objetos desta classe. Uma característica desses blocos é a de não especificar nenhum tipo de retorno, além de ter o mesmo nome da classe.
```sh
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
        this.age = 3;
        this.breed = "Caramelo";
    }
```

No código, temos dois exemplos de construtores, um que recebe apenas o nome, e o outro que recebe todas as informações do cachorro.

Por fim, chegamos aos métodos:
Aqui, temos 2 tipos de métodos
 - Os de "get" e "set", para realizar a obtenção e alteração de cada atributo, respectivamente.
 - Métodos de operações com os atributos, focando em operações com strings.
 

Métodos de get e set:

```sh
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
```
Operações com os atributos:

```sh
    public void bark()    
    {
        System.out.println(name + " diz: Au au!");
    }
                                                                        // métodos
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
```
Como podemos ver, nos métodos acima predominam as operações com strings.


## Testes

Agora, é a hora de realizar os testes nos programas.
Para isso, vamos chamar 2 amigos para nos ajudar: Suzi e Kiba!

Vamos contar a história da Suzi primeiro, para mostrar o funcionamento do programa.
Suzi era uma cachorra de rua, a pobrezinha ficou abandonada desde o início da sua vida.
Então inicialmente, ela não tinha nome.

´´´sh
public static void main(String[] args) 
    {
        Dog dog1 = new Dog("Unknown");
        String oldname = dog1.getName();
        System.out.println("Nome antigo do cachorro 1: " + oldname +"\n");
    }
´´´

Saída: Nome antigo do cachorro 1: Unknown

<img src="https://github.com/elc117/apresentacao-bim2-2024b-guzttx/blob/main/images/suzi%20sad.jpg" width=360px height=640px/>

A vida dela mudou quando ela encontrou uma família que estava disposta a acolher ela, e desde então ela ganhou um nome e um lar.

```sh
        System.out.println("Cachorro 1 foi adotado e agora se chama: " + dog1.getName()+"\n");
```

Saída: Cachorro 1 foi adotado e agora se chama: Suzi

<img src="https://github.com/elc117/apresentacao-bim2-2024b-guzttx/blob/main/images/suzi%20happy.jpg" width=360px height=640px/>


Agora vamos ao Kiba!
Kiba, diferente da Suzi foi planejado, mas é o cachorro mais teimoso e agitado da Terra. Para gastar suas energias, ele precisa brincar diariamente.
```sh
        Dog dog2 = new Dog("Kiba", 1, "Shiba Inu");
```
Mas antes de irmos para as atividades diárias do japonês, vamos ver as informações dos dois cães.

```sh
        System.out.println("Informações do cachorro 1:");
        dog1.infos();
        System.out.println("Informações do cachorro 2:");
        dog2.infos();
```
Saída:
Informações do cachorro 1:

Nome: Suzi
Idade: 3
Raça: Caramelo

<img src="https://github.com/elc117/apresentacao-bim2-2024b-guzttx/blob/main/images/suzi%20presentation.jpg" width=300px height=400px/>

Informações do cachorro 2

Nome: Kiba
Idade: 1
Raça: Shiba Inu

<img src="https://github.com/elc117/apresentacao-bim2-2024b-guzttx/blob/main/images/kiba%20presentation.jpg" width=360px height=640px/>

No seu dia a dia, ele gosta de comer, brincar e latir... muito...

```sh
        dog2.play(15, "bolinha");
```
Saída: Kiba brincou de bolinha por 15 minutos

<img src="https://github.com/elc117/apresentacao-bim2-2024b-guzttx/blob/main/images/suzi%20happy.jpg" width=360px height=640px/>

```sh
        dog2.eat("ração");
```
Saída: Kiba comeu ração

<img src="https://github.com/elc117/apresentacao-bim2-2024b-guzttx/blob/main/images/kiba%20eats.jpg" width=360px height=640px/>

```sh
        dog2.bark();
```
Saída: Kiba diz: Au au!
<img src="https://github.com/elc117/apresentacao-bim2-2024b-guzttx/blob/main/images/kiba%20bark.jpg" width=360px height=640px/>

Enfim, no geral foi isso gente. Recomendo a todos terem um cãopanheiro!

Se puderem adotar, adotem! Se quiserem comprar, comprem de criadores responsáveis(pesquisem bem antes)!

Obrigado pela atenção pessoAU!

<img src="https://github.com/elc117/apresentacao-bim2-2024b-guzttx/blob/main/images/kiba%20happy.jpg" width=360px height=640px/>