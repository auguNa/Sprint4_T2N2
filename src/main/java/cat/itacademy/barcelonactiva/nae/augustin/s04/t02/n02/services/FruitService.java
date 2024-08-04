package cat.itacademy.barcelonactiva.nae.augustin.s04.t02.n02.services;

import cat.itacademy.barcelonactiva.nae.augustin.s04.t02.n02.model.domain.Fruit;

import java.util.List;

public interface FruitService {
	Fruit createFruit(Fruit fruit);

	Fruit updateFruit(Fruit fruit);

	void deleteFruit(long fruitId);

	Fruit getOneFruit(long fruitId);

	List<Fruit> getAllFruits();

}
