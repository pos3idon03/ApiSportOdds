package Models.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.RequiredArgsConstructor;
//import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Table(name="match_odds",
        indexes = {
                @Index(name="SPECIFIER", columnList = "specifier")
        })

@Entity
@Data
public class MatchOdds {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long Id;

    @Column(name="specifier", nullable = false)
    private String Specifier;

    @Column(name="odd", nullable = false)
    private Double Odd;

}
