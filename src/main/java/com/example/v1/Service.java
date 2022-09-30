package com.example.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service

public class Service {
    private final StoryRepo storyRepo;
  @Autowired
    public Service(StoryRepo storyRepo) {
        this.storyRepo = storyRepo;
    }



    public List<Story> getStory(){

        return  storyRepo.findAll();



    }

    public void AddStory(Story s ){
       storyRepo.save(s);


    }
    @Transactional  // put the entity in a manege state

    public void EditStory(Long id,String story,String name) {
    Story s = storyRepo.findById(id).orElseThrow(() -> new IllegalStateException("This student does not exist"));
    if(story!=null){
        s.setStory(story);
    }

        if(name!=null){
            s.setName(name);
        }




    }
}
