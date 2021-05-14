package millaProject.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import millaProject.backend.models.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
