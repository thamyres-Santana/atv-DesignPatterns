package orders;

import java.util.ArrayList;
import java.util.List;

public abstract class StoreComponent {
	
	private String name;
	private Double value;
	
	private List<StoreComponent> storeComponents;
	
	public StoreComponent(String name, Double value) {
		super();
		this.name = name;
		this.value = value;
		this.storeComponents = new ArrayList<StoreComponent>();
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void addComponent(StoreComponent component) {
		storeComponents.add(component);
	}
	
	public void removeComponent(StoreComponent component) {
		storeComponents.remove(component);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public Double getTotalValue() { 
		Double total = this.value;
		
		for (StoreComponent component: storeComponents) {
			total += component.getTotalValue();
		}
		
		return total;
	}}
