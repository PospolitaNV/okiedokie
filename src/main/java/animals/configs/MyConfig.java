package animals.configs;

import animals.entities.Cat;
import animals.entities.Dog;
import animals.entities.Parrot;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean("cat")
    public Cat cat() {
        return new Cat();
    }

    @Bean("dog")
    public Dog dog(){
        return new Dog();
    }

    @Bean("parrot")
    public Parrot parrot(){
        return new Parrot();
    }

    @Bean("parrot-kesha")
    public Parrot parrotKesha(){
        Parrot parrot = new Parrot();

        parrot.setName("Kesha");

        return parrot;
    }

    @Bean("killer-cat")
    public Cat getKillerCat(@Qualifier("parrot-kesha") Parrot parrot) {
        Cat cat = new Cat();

        cat.setName(parrot.getName() + "-killer");

        return cat;
    }
}
