package Repository;

import Models.jpa.Match;
import Models.jpa.MatchOdds;
import org.springframework.data.repository.CrudRepository;

public interface MatchOddsRepository extends CrudRepository<MatchOdds,Long> {
    Iterable<MatchOdds> findMatchOdds(Match match);
}
