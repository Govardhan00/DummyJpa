package Many2Many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="bank")
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="bankid")
	private int bankId;
	@Column(name = "name",length = 30)
	private String name;
	@Column(name ="branchname",length = 30)
	private String branchName;
	@Column(name = "swiftcode",length = 10)
	private String swiftCode;
	
	//Many to many
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name= "bankcustomer",joinColumns = {@JoinColumn(
			name= "bankid",nullable= false)},
	inverseJoinColumns = {@JoinColumn(name = "customerid"
	,nullable = false)})
	private Set<Customer> customer;

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	
	
	
}
