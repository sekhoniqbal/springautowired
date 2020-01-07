package springtest.autowire.beans;

import org.springframework.stereotype.Component;

@Component
public class Lettuce implements Layer {
	public String getName() {
		return "lettuce";
	}
}
