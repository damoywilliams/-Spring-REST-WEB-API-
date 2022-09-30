package com.example.v1;

import javax.persistence.*;
import javax.sound.midi.Sequence;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table
public class Story {

    @Id
            @SequenceGenerator(name="story_sequence",sequenceName = "story_sequence",allocationSize =1)
           @GeneratedValue(strategy = SEQUENCE,generator = "story_sequence")
            Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    String name;
    String Story;
    String Major;
    String College;
    Double GPA;

    public Story() {
    }

    public Story(String name, String story, String major, String college, Double GPA) {
        this.name = name;
        this.Story = story;
        this.Major = major;
        this.College = college;
        this.GPA = GPA;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return Story;
    }

    public void setStory(String story) {
        Story = story;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Story='" + Story + '\'' +
                ", Major='" + Major + '\'' +
                ", College='" + College + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
