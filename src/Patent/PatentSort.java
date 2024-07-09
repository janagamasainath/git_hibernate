 package Patent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PatentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Patent> al = new ArrayList<>();
		al.add(new Patent("sainath", 34, "corona", 25000, "hyderabad"));
		al.add(new Patent("saritha", 24, "corona", 15000, "hyderabad"));
		al.add(new Patent("prasad", 32, "feaver", 28000, "secunderabad"));
		al.add(new Patent("harika", 28, "feaver", 20000, "secunderabad"));
		al.add(new Patent("saisha", 33, "cold", 12000, "tarnaka"));
		al.add(new Patent("shyam", 28, "cold", 14000, "tarnaka"));
		al.add(new Patent("shiva", 38, "headack", 31000, "uppal"));
		al.add(new Patent("devi", 34, "headack", 36000, "uppal"));

		// grouping based on disease
		Map<String, List<Patent>> collect = al.stream()
				.collect(Collectors.groupingBy(a -> a.getDisease(), Collectors.toList()));
		//System.out.println(collect);

		// young person in each disease
		Map<String, Optional<Patent>> collect2 = al.stream().collect(
				Collectors.groupingBy(a -> a.getDisease(), Collectors.minBy(Comparator.comparing(a -> a.getAge()))));
	      //System.out.println(collect2);

		// printing all the patent details
		// al.stream().forEach(System.out::println);

		Map<String, IntSummaryStatistics> collect3 = al.stream()
				.collect(Collectors.groupingBy(a -> a.getDisease(), Collectors.summarizingInt(a -> a.getBill())));
		// System.out.println(collect3);

		// sum of bills for each disease
		Map<String, Integer> collect4 = al.stream()
				.collect(Collectors.groupingBy(a -> a.getDisease(), Collectors.summingInt(a -> a.getBill())));
		// System.out.println(collect4);

		// get only uppal deatls
		List<Patent> collect5 = al.stream().filter(a -> a.getAddress().equals("uppal")).collect(Collectors.toList());
		// System.out.println(collect5);

		// only uppal bill
		Integer collect6 = al.stream().filter(a -> a.getAddress().equals("uppal"))
				.collect(Collectors.summingInt(a -> a.getBill()));
		// System.out.println(collect6);

		// total bill
		Integer collect7 = al.stream().collect(Collectors.summingInt(a -> a.getBill()));
		// System.out.println(collect7);

		// average age for each disease
		Map<String, Double> collect8 = al.stream()
				.collect(Collectors.groupingBy(a -> a.getDisease(), Collectors.averagingInt(a -> a.getAge())));
		// System.out.println(collect8);

		List<Integer> collect9 = al.stream().map(a -> a.getAge()).sorted().collect(Collectors.toList());
		// System.out.println(collect9);

		al.sort(Comparator.comparing(Patent::getAge));
		al.forEach(System.out::println);

	}

}
