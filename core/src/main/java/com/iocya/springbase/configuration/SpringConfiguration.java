package com.iocya.springbase.configuration;

import com.iocya.springbase.beans.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }

    @Bean
    public Instrument guitar() {
        return new Guitar();
    }

    @Bean
    public Performer kenny() {
        //由于指定了无参构造器,  Instrumentalist 带Instrument参数的构造器上的Autowired 就会失效
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        kenny.setInstrument(guitar());
        return kenny;
    }


}
