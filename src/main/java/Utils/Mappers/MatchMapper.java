package Utils.Mappers;

import Models.dto.MatchDTO;
import Models.jpa.Match;
import Utils.DateUtils;

public class MatchMapper {

    public Match toMatch(MatchDTO matchDTO){
        if(matchDTO == null){
            return null;
        }else return new Match(
                matchDTO.getId(),
                matchDTO.getDescription(),
                matchDTO.getMatch_Date(),
                matchDTO.getMatch_Time(),
                matchDTO.getTeam_A(),
                matchDTO.getTeam_B(),
                matchDTO.getSport()
        );
    }
}
