package com.kostya.firstproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class PersonController {

    private final List<Person> people;

    public PersonController(){
        people = new ArrayList<>();
        people.add(new Person(UUID.randomUUID(), "Костя"));
        people.add(new Person(UUID.randomUUID(), "Виктория"));
        people.add(new Person(UUID.randomUUID(), "Алекс"));
        people.add(new Person(UUID.randomUUID(), "Олеся"));

    }

    @GetMapping(value = "/person")
    public List<Person> getPerson() {
        return people;
    }

    @GetMapping(value = "/person/{id}")
    public Person getPersonFromId(@PathVariable String id) {
        int idNumber = Integer.parseInt(id);
        return people.get(idNumber);
    }


    @GetMapping(value = "/hello")
    public String hello() {
        return "Привет мир";
    }

    @GetMapping(value = "/hello/{a}")
    public String helloWorld(@PathVariable String a) {
        return "Привет мир" + a;
    }

    @GetMapping(value = "/sum")
    public String sum(@RequestParam String first, @RequestParam String second) {
        return first + second;
    }

    @PostMapping(value = "/person")
    public Person addPerson(@RequestBody Person person){
        people.add(person);
        return person;
    }

    @DeleteMapping(value = "/person/{id}")
    public void deletePerson(@PathVariable String id){
        int idNumber = Integer.parseInt(id);
        people.remove(idNumber);
    }

}
