import java.util.Arrays;
import java.util.Objects;

class Customer {
	String name;
	Address add;
	public Customer() {}
	public Customer(String name,Address add) {
		this.name = name;
		this.add =add;
	}
	@Override
	public int hashCode() {
		return Objects.hash(add, name);
	}
	@Override
	public boolean equals(Object obj) {
		//add.equals(add);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(add, other.add) && Objects.equals(name, other.name);
	}
	
	
	
}
