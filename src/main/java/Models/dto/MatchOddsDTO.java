package Models.dto;

import Enums.SpecifierEnum;
import lombok.Data;


@Data
public class MatchOddsDTO {
    private Long Id;
    private Long Match_Id;
    private SpecifierEnum Specifier;
    private Double odd;



}
