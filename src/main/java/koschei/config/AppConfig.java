package koschei.config;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Ocean1 getOcean(Island2 island){
        return new Ocean1(island);
    }

    @Bean
    public static Island2 getIsland(@Qualifier("wood3") Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Wood3 getWood(@Qualifier("rabbit4") Rabbit4 rabbit){
        return new Wood3(rabbit);
    }

    @Bean
    public static Rabbit4 getRabbit(@Qualifier("duck5") Duck5 duck){
        return new Rabbit4(duck);
    }

    @Bean
    public static Duck5 getDuck(Egg6 egg6){
        return new Duck5(egg6);
    }

    @Bean
    public static Egg6 getEgg(Needle7 needle){
        return new Egg6(needle);
    }

    @Bean
    public static Needle7 getNeedle(){
        return new Needle7();
    }
}
