package com.mw.Study.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("a", 10);
        Person person2 = new Person("b", 20);
        Person person3 = new Person("c", 30);
        List<Person> peopleList = Arrays.asList(person1, person2, person3);
        PersonTest personTest = new PersonTest();
//        List<Person> a = personTest.getPersonByUsername("a", peopleList);
//        a.forEach(person -> System.out.println(person.getUsername()));
//        List<Person> a = personTest.getPersonByAge(10, peopleList);
        List<Person> a = personTest.getPersonByAge1(10, peopleList);
        a.forEach(person -> System.out.println(person.getUsername()));
    }


    public List<Person> getPersonByUsername(String username, List<Person> personList) {
        return personList.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int  age, List<Person> personList) {
        BiFunction<Integer,List<Person>,List<Person>> biFunction=(ageOfPerson,personList1)->{
            List<Person> collect = personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
            return collect;
        };
        return biFunction.apply(age,personList);
    }
    public List<Person> getPersonByAge1(int  age, List<Person> personList) {
        return personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
    }
    public List<Person> getPersonByAge2(int  age, List<Person> personList,BiFunction<Integer,List<Person>,List<Person>> biFunction) {
        return biFunction.apply(age,personList);
    }
}
