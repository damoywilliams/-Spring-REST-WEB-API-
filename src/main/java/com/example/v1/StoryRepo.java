package com.example.v1;

import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
@Repository  //this interface is responsible for data access
public interface StoryRepo extends JpaRepository<Story,Long> {
}
