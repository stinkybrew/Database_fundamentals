package entity;
import javax.persistence.*;
import java.util.*;


@Entity
public class Account {
	@Id
	private int AccountId;
	
	private String AccountName;
	private double Balance;
	@OneToMany
	@JoinColumn
	private List<Transactions> transactions = new ArrayList<Transactions>();
	
	public Account() {
	}
	
    public Account(int AccountId, String AccountName, double Balance) {
    	this.AccountId = AccountId;
    	this.AccountName = AccountName;
    	this.Balance = Balance;
    }
    
    @Override
	public String toString() {
    	return "Account [accountId=" + AccountId + ", accountName=" + AccountName + ", balance=" + Balance + "]";
    }
	
	
}
