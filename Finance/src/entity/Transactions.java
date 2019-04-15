package entity;
import java.util.Date;
import javax.persistence.*;
@Entity

public class Transactions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int amount;
	private String Description;
	private Date Timestamp;
	private int CategoryId;
	private int SourceAccountId;
	private int DescriptionAccountId;
	private int TrasactionId;
	@ManyToOne
	private Account Account;
	private Category Category;
}
