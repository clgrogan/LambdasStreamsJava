package com.ls.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.ls.streams.exercise.Planet;

public class PlanetUtils {

	public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
		// stream
		// filter to planets starting with M.
		// return list of matching planets
		return planets.stream().filter(e -> (e.getName().startsWith("m") || e.getName().charAt(0) == 'M'))
				.collect(Collectors.toList());
	}

	public List<Planet> getPlanetsWithRings(List<Planet> planets) {
		// list -> stream
		// filter to ringed planets
		// return list of matching planets
		return planets.stream().filter(e -> e.getHasRings()).collect(Collectors.toList());
	}

	public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
		// list -> stream
		// filter to planets with > three moons
		// collect and return list of matching planets
		return planets.stream().filter(e -> e.getNumberOfMoons() > 3).collect(Collectors.toList());
	}

	public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
		// list -> stream
		// filter to planets with density > 5
		// collect and return list of matching planets
		return planets.stream().filter(e -> e.getDensity() > 5.0).collect(Collectors.toList());
	}

}
