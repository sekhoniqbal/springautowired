package springtest.autowire.beans;
import org.springframework.stereotype.Component;

@Component
public class Beef implements Layer {
	
	public String getName() {
		return "Beef";
	}

}
