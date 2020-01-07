package springtest.autowire.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ChickenSandwich implements Sandwich {
	
	private Layer layer1, layer2, layer3;
	
	@Autowired
	public ChickenSandwich(@Qualifier("lettuce") Layer lettuce,@Qualifier("chicken") Layer chicken, @Qualifier("tomato")Layer tomato) {
		layer1=lettuce;
		layer2 = chicken;
		layer3 = tomato;	
	}
	
	public String getName() {
		return layer1.getName()+" "+layer2.getName()+" "+layer3.getName();
	}
	
	

}
