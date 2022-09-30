package com.example.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "api/v1/story")

public class Controller {

    private final Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }



    @GetMapping
    public List<Story> GetStory() {
        return service.getStory();

    }

    @PostMapping

    public void AddStory(@RequestBody Story s) { // takes the reques body and add it to a student

         service.AddStory(s);
    }
    //Request para
    @PutMapping("{id}")
    public void editStory(@PathVariable("id") Long id,@RequestParam(required = false)String name,@RequestParam(required = false) String story){
        service.EditStory(id,story,name);
    }



}