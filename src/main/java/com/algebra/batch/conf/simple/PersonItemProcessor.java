//package com.algebra.batch.conf.simple;
//
//import com.algebra.batch.domain.Person;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.batch.item.ItemProcessor;
//
///**
// * @author al
// * @date 2019/12/11 13:26
// * @description
// */
//@Slf4j
//public class PersonItemProcessor implements ItemProcessor<Person,String> {
//    @Override
//    public String process(Person person) throws Exception {
//        String greeting = "Hello " + person.getFirstName() + " "
//                + person.getLastName() + "!";
//
//        log.info("converting '{}' into '{}'", person, greeting);
//        return greeting;
//    }
//}
