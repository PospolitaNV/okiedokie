package animals.configs;

import animals.entities.Cat;
import animals.entities.Dog;
import animals.entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean("cat")
    public Cat getCat() {
        return new Cat();
    }

    @Bean("dog")
    public Object getDog(){
        return new Dog();
    }

    @Bean("parrot")
    public Object getParrot(){
        return new Parrot();
    }

    @Bean("parrot-kesha")
    public Object weNeedMoreParrots(){
        Parrot parrot = new Parrot();

        parrot.setName("Kesha");

        return parrot;
    }

    @Bean("killer-cat")
    public Object getKillerCat(Parrot parrot) {
        Cat cat = new Cat();

        cat.setName(parrot.getName() + "-killer");

        return cat;
    }
}
