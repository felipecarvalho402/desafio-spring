package seguro;



	import org.springframework.web.bind.annotation.RequestMapping;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import lombok.Data;
	
	@Data
	@Entity
	@RequestMapping
	
	public class Client {
		
		@Id
		private String name;
		private int age;
		private double dependents;
		private String maritalStatus;
		private int house;
		private int vehicles;
		private Data createAt;
		private Data updatedAt;
}
