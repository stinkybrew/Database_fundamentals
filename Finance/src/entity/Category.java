package entity;
import javax.persistence.*;
import java.util.*;

@Entity
public class Category {
	@Id
	private int CategoryId;
	private String CategoryDescription;
	@OneToMany
	@JoinColumn
	private List<Transactions> transactions = new ArrayList<Transactions>();
	
    public Category() {
    }   	
    
    public Category(int CategoryId, String CategoryDescription) {
    	this.CategoryId = CategoryId;
    	this.CategoryDescription = CategoryDescription;
    }
    
    @Override
	public String toString() {
    	return "Category [categoryId=" + CategoryId + ", categorydescription=" + CategoryDescription + "]";
    }
}

