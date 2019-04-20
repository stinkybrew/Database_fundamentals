package entity;
import javax.persistence.*;
@Entity

public class Category {
	@Id
	private int CategoryId;
	private String CategoryDescription;
	
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

