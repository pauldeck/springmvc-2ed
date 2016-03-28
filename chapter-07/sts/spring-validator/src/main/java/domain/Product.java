package domain;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
	private String name;
    private String description;
    private BigDecimal price;
    private LocalDate productionDate;

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public LocalDate getProductionDate() {
        return productionDate;
    }
    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }
    
}