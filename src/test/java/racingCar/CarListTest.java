package racingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class CarListTest {

	@Test
	@DisplayName("addCar_input carCount_size carCount")
	void addCar() {
		CarList carList = new CarList(new ArrayList<>());
		carList.addCar(3);
		assertThat(carList.getCarList()).hasSize(3);
	}

	@Test
	@DisplayName("moveByTryCount_input tryCount_각 Car의 distance 값이 tryCount 이하")
	void moveByTryCount() {
		CarList carList = new CarList(new ArrayList<>());
		carList.addCar(3);
		carList.moveByTryCount(5);

		for (Car car : carList.getCarList()) {
			assertThat(car.distance).isLessThan(6);
		}
	}
}