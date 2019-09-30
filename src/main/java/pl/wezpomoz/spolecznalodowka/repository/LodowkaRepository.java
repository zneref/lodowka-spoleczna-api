package pl.wezpomoz.spolecznalodowka.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.wezpomoz.spolecznalodowka.model.Lodowka;

@Repository
public interface LodowkaRepository extends MongoRepository<Lodowka, String> {
}
