package Repository;

import Enums.SportsEnum;
import org.springframework.data.repository.CrudRepository;
import Models.jpa.Match;

public interface MatchRepository extends CrudRepository<Match,Long> {
    Iterable<Match> findBySport(SportsEnum sportsEnum);
}
