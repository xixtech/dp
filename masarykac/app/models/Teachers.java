package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by Martin on 12.03.2017.
 */
@Entity
public class Teachers extends Model {

    public static Finder<Long, Teachers> find = new Finder<Long, Teachers>(
            Teachers.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne
    public Courses courses;

    @ManyToOne
    public Employees employees;

    public int scale;


}