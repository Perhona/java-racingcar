package racingCar.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingCar.util.RandomNumberSupplier;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WinnersTest {

	@Test
	@DisplayName("winnerList_distance 값이 다른 Cars_distance 값이 가장 높은 객체 리스트 반환")
	void winnerList() {
		List<Car> cars = new ArrayList<>();
		Car pobi = new Car(3, new RandomNumberSupplier());
		Car perhona = new Car(1, new RandomNumberSupplier());
		Car nameun = new Car(3, new RandomNumberSupplier());

		cars.add(pobi);
		cars.add(perhona);
		cars.add(nameun);

		Winners winners = new Winners(new Cars(cars));
		assertThat(winners.winners()).containsExactly(pobi, nameun);
	}
}