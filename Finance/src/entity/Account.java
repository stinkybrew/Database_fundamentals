package entity;
import javax.persistence.*;
@Entity
public class Account {
	@Id
	private int AccountId;
	private String AccountName;
	private double Balance;
}
