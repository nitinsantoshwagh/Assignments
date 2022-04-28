package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class City {
String cityname;
int citypopulation;
int cityarea;

City(String cityname,int citypopulation,int cityarea)
{
	this.cityname=cityname;
	this.citypopulation=citypopulation;
	this.cityarea=cityarea;
}
	public static void main(String[] args) {

		ArrayList<City> city=new ArrayList<City>();
		city.add(new City("pune",120000,340));
		city.add(new City("delhi",500000,430));
		city.add(new City("mumbai",45000,600));
		city.add(new City("nagpur",200000,350));
		city.add(new City("lonar",300000,300));
		
		
		City Item=city.stream().max((obj1,obj2)->obj1.citypopulation>obj2.citypopulation?1:-1).get();
		System.out.println(Item.cityname);
		
		List<Integer>namesets=city.stream().map(e->e.citypopulation).collect(Collectors.toList());
		System.out.println(namesets);
		
		City minArea=city.stream().min((obj1,obj2)->obj1.cityarea>obj2.cityarea?1:-1).get();
		System.out.println(minArea.cityarea);

	}

}
