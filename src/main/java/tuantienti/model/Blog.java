package tuantienti.model;

import javax.persistence.*;
import java.io.File;
import java.sql.Blob;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String story;
    private File img;
    public Blog() {}

    public Blog(String firstName, String lastName, String story, File img) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.story = story;
        this.img = img;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s', story='%s']", id, firstName, lastName,story + img);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public File getImg() {
        return img;
    }

    public String getStory() {
        return story;
    }

    public void setImg(File img) {
        this.img = img;
    }

    public void setStory(String story) {
        this.story = story;
    }
}