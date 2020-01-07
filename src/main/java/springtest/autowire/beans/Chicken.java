package springtest.autowire.beans;

import org.springframework.stereotype.Component;

@Component
public class Chicken implements Layer {
	public String getName() {
		return "chicken";
	}

}
