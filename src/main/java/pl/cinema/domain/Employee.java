package pl.cinema.domain;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Pracownicy")
public class Employee {
	@Transient
	private static final long serialVersionUID = 102831973239L;
	
	@Id
	@GeneratedValue
	private long id;
	@Column(name="wiek")
	private int age;
	@Column(name="imie", nullable=false, length=10)
	private String name;
	@Column(name="nazwisko", columnDefinition = "VARCHAR(30) NOT NULL")
	private String surname;
	@Column(name="pensja", precision=10, scale=2)
	private BigDecimal salary;
	@Column(name="data_rozpoczecia")
	private Date startDate;

	public Employee(int age, String name, String surname, BigDecimal salary, Date startDate) {
		super();
		this.age = age;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", surname=" + surname + ", salary=" + salary
				+ ", startDate=" + startDate + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Employee() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


}
