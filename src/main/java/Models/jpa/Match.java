package Models.jpa;

import Enums.SportsEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Table(name = "match",
        indexes = {
                @Index(name="MATCH_ID", columnList = "id"),
                @Index(name="MATCH_DATE", columnList = "match_date"),
                @Index(name="TEAMS", columnList = "team_a, team_b"),
                @Index(name="TEAM_A", columnList = "team_a"),
                @Index(name="TEAM_B", columnList = "team_b"),
            }
)

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(includeFieldNames=true)
@Getter
@Setter
public class Match implements Serializable {

    public Match(Long id, String description, Date match_Date, LocalTime match_Time, String team_A, String team_B, SportsEnum sportsValue) {
        this.Id = id;
        this.Description = description;
        this.Match_Date = match_Date;
        this.Match_Time = match_Time;
        this.Team_A = team_A;
        this.Team_B = team_B;
        this.sportsValue = sportsValue;
    }

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long Id;

    @Column(name="description", nullable = false)
    private String Description;

    @Column(name="match_date", nullable = false)
    private Date Match_Date;

    @Column(name="match_time", nullable = false)
    private LocalTime Match_Time;

    @Column(name="team_a", nullable = false)
    private String Team_A;

    @Column(name="team_b", nullable = false)
    private String Team_B;

    @JsonIgnore
    @Column(name="sport", nullable = false)
    private Integer Sport;

    @Transient
    private SportsEnum sportsValue;

}