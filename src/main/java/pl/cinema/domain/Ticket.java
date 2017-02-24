package pl.cinema.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="Tickets")
@Table(name="Bilety")
public class Ticket {
	
	@Transient
	private final static double studentDiscount = 0.8;
	@Transient
	private final static double childDiscount = 0.71;

	@Id
	@GeneratedValue
	private long ticketId;
	@JoinColumn(name="id_seansu")
	@ManyToOne
	private Seanse seanse;
	@Column(name="miejsce_siedzace")
	private int seat;
	@Column(name="rzad")
	private int row; 
	@Column(name="typ_biletu")
	private String type; //student(ulgowy_studencki)/adult(normalny)/child(ulga_uczniowska)
	@Column(name="cena_koncowa", nullable=false, precision=10, scale=2)
	private BigDecimal finalPrice;
	
	public Ticket(Seanse seanse, int seat, int row, String type) {
		super();
		this.seanse = seanse;
		this.seat = seat;
		this.row = row;
		this.type = type;
		this.finalPrice = countFinalPrice();
	}
	
	public Ticket(){
		super();
	}
	
	private BigDecimal countFinalPrice(){
		if(this.type==null || this.type.equals("") || this.type.equals("adult"))
			return this.seanse.getPrice();
		else if(type == "student")
			return this.seanse.getPrice().multiply(new BigDecimal(studentDiscount));
		else if(type=="child")
			return this.seanse.getPrice().multiply(new BigDecimal(childDiscount));
		else 
			return this.seanse.getPrice();
	}

	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}


	public Seanse getSeanse() {
		return seanse;
	}

	public void setSeanse(Seanse seanse) {
		this.seanse = seanse;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getChildDiscount() {
		return childDiscount;
	}
	
}
