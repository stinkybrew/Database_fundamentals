package entity;
import javax.persistence.*;
@Entity

public class Category {
	@Id
	private int CategoryId;
	private String CategoryDescription;
}
