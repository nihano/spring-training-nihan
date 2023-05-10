package com.cydeo.exapmle.exapmleConfig;

import com.cydeo.exapmle.String.Daddario;
import com.cydeo.exapmle.String.ErnieBall;
import com.cydeo.exapmle.String.GuitarString;
import com.cydeo.exapmle.pickup.Pickup;
import com.cydeo.exapmle.pickup.SeymourDuncan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ExampleConfig {

    @Bean
    Pickup seymourDuncan(){
        return new SeymourDuncan("humbucker", "SeymourDuncan" );
    }

    @Bean
    Pickup fender(){
        return new SeymourDuncan("single", "Fender" );
    }

    @Bean
    @Primary
    GuitarString daddario(){
        return new Daddario("9mm", "Daddario" );
    }

    @Bean
    GuitarString ernieBall(){
        return new ErnieBall("10mm", "Ernie Ball" );
    }
}
