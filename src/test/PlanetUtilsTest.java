package test;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.ls.streams.exercise.Planet;
import com.ls.streams.exercise.PlanetUtils;
import com.ls.streams.exercise.SolarSystem;

class PlanetUtilsTest {

	private List<Planet> planets = SolarSystem.getPlanets();
	private PlanetUtils planetUtils = new PlanetUtils();

	@Test
	void testTwoPlanetsStartWithM() {
		List<Planet> actual = planetUtils.getPlanetsBeginningWithM(planets);
		assertThat(actual).hasSize(2);
		assertThat(actual).extracting(Planet::getName).containsExactly("Mercury", "Mars");
	}

	@Test
	void testFourPlanetsHaveRings() {
		List<Planet> actual = planetUtils.getPlanetsWithRings(planets);
		assertThat(actual).hasSize(4);
		assertThat(actual).extracting(Planet::getName).containsExactly("Jupiter", "Saturn", "Uranus", "Neptune");
	}

	@Test
	void testFourPlanetsHaveMoreThanThreeMoons() {
		List<Planet> actual = planetUtils.getPlanetsWithMoreThanThreeMoons(planets);
		assertThat(actual).hasSize(4);
		assertThat(actual).extracting(Planet::getName).containsExactly("Jupiter", "Saturn", "Uranus", "Neptune");
	}

	@Test
	void testThreePlanetsWithDensityGreaterThanFive() {
		List<Planet> actual = planetUtils.getPlanetsWithDensityGreaterThanFive(planets);
		assertThat(actual).hasSize(3);
		assertThat(actual).extracting(Planet::getName).containsExactly("Mercury", "Venus", "Earth");
	}

	@Test
	void testGetCountOfRingedPlanets_basicScenerio() {
		List<Planet> actual = planetUtils.getPlanetsWithDensityGreaterThanFive(planets);
		assertThat(actual).hasSize(3);
		assertThat(actual).extracting(Planet::getName).containsExactly("Mercury", "Venus", "Earth");
	}

	@Test
	void testGetTotalNumberOfMoonsAllPlanets_basicScenerio() {
		int expected = 207;
		int actual = planetUtils.getTotalNumberOfMoonsAllPlanets(planets);
		assertEquals(expected, actual);
	}

}
