package springtest.autowire.beans;

import org.springframework.stereotype.Component;

@Component
public class Tomato implements Layer {
	public String getName() {
		return "tomato";
	}

}
