package Services;

import Enums.SportsEnum;
import Repository.MatchRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Models.jpa.Match;

import javax.transaction.Transactional;
import java.util.Optional;

@Service //Spring Mapping
@Slf4j //Logging Framework
public class MatchService {
    final MatchRepository matchRepository;

    @Autowired
    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
    @Transactional //dynamically creates a proxy that implements the same interface(s) as the class you're annotating
    public Match SaveMatch(Match match){

        return matchRepository.save(match);
    }
    public void deleteMatch(Long id){

        matchRepository.deleteById(id);
    }
    public Optional<Match> getMatch(Long id){

        return matchRepository.findById(id);
    }
    private Iterable<Match> getMatchesBySport(SportsEnum sportsEnum) {
        return matchRepository.findBySport(sportsEnum);
    }
    public Iterable<Match> getAllMatches(SportsEnum sportsEnum){
        if(sportsEnum == null){
            return(matchRepository.findAll());
        }
        return getMatchesBySport(sportsEnum);
    }
    public Boolean matchExist(Match match){
        return matchRepository.existsById(match.getId());
    }
    public Boolean matchExist(Long matchId){
        return matchRepository.existsById(matchId);
    }
}
