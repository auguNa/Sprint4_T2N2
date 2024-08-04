package cat.itacademy.barcelonactiva.nae.augustin.s04.t02.n02.model.repository;

import cat.itacademy.barcelonactiva.nae.augustin.s04.t02.n02.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {
	Optional<Fruit> findByName(String name);
}
