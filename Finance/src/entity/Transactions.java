package entity;
import javax.persistence.*;
@Entity

public class Transactions  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int TransactionsId;
	
	private int Amount;
	private String Description;
	private double Timestamp;
	private int CategoryId;
	private int SourceAccountId;
	private int DescriptionAccountId;

	@ManyToOne
	private Account Account;
	@ManyToOne
	private Category Category;
	

    public Transactions() {
    }   	
	
    public Transactions(int TransactionsId, int Amount, String Description, double Timestamp, int CategoryId, int SourceAccountId, int DescriptionAccountId) {
        this.TransactionsId = TransactionsId;
        this.Amount = Amount;
        this.Description = Description;
        this.Timestamp = Timestamp;
        this.CategoryId = CategoryId;
        this.SourceAccountId = SourceAccountId;
        this.DescriptionAccountId = DescriptionAccountId;    
    }

    
	@Override
	public String toString() {
		return "Transactions [transactionsId=" + TransactionsId + ", amount="+ Amount + " , description=" + Description + ","
				+ ", timestamp=" + Timestamp + ", categoryId=" + CategoryId + ",sourseaccountId=" + SourceAccountId + ",descriptionaccountId=" + DescriptionAccountId + "   ]";
	} 
}
