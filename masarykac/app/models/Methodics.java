package models;

import com.avaje.ebean.Model;
import play.data.format.Formats;
import play.data.validation.Constraints;
import com.avaje.ebean.*;
import javax.persistence.*;

/**
 * Created by Martin on 10.02.2017.
 */
@Entity
public class Methodics extends Model {
    public static Finder<Long, Methodics> find = new Finder<Long, Methodics>(
            Methodics.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Constraints.Required(message = "Zadejte název")
    @Formats.NonEmpty
    public String title;

    @Constraints.Required(message = "Zadejte koeficient")
    @Formats.NonEmpty
    public String coefficient;

    public Methodics(String title, String coefficient) {
        this.title = title;
        this.coefficient = coefficient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public static Methodics findByTitle(String title) {
        return find.where().eq("title", title).findUnique();
    }
}
