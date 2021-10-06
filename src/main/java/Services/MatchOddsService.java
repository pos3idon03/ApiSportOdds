package Services;


import Enums.SportsEnum;
import Models.jpa.Match;
import Repository.MatchOddsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Models.jpa.MatchOdds;

import javax.transaction.Transactional;
import java.util.Optional;

@Service //Spring Mapping
@Slf4j //Logging Framework
@Transactional //dynamically creates a proxy that implements the same interface(s) as the class you're annotating
public class MatchOddsService {
    final MatchOddsRepository matchOddsRepository;

    @Autowired
    public MatchOddsService(MatchOddsRepository matchOddsRepository) {
        this.matchOddsRepository = matchOddsRepository;
    }
    public MatchOdds SaveMatchOdds(MatchOdds matchOdds){
        return matchOddsRepository.save(matchOdds);
    }
    public void deleteMatchOdds(Long id){
        matchOddsRepository.deleteById(id);
    }
    public Optional<MatchOdds> getMatchOdds(Long id){
        return matchOddsRepository.findById(id);
    }
    public Iterable<MatchOdds> getAllMatchOdds(){
        return(matchOddsRepository.findAll());
    }
    private Iterable<MatchOdds> getMatchOddsByMatch(Match match) {
        return matchOddsRepository.findMatchOdds(match);
    }
    public Boolean matchOddsExist(Long matchOddId){
        return matchOddsRepository.existsById(matchOddId);
    }
}
