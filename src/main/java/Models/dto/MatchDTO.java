package Models.dto;

import Enums.SportsEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalTime;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MatchDTO {
    private Long Id;
    private String Description;
    private Date Match_Date;
    private LocalTime Match_Time;
    private String Team_A;
    private String Team_B;
    private SportsEnum Sport;
}
