package com.skillovilla.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
	
	private static final @NotNull LocalDateTime CurrentDateTimeProvider = null;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;

	@NotNull
	@NotEmpty
    private String title;
	
	@NotNull
	@NotEmpty
    private String author;
	
	static final int finePerDay=10;
	public int getBookId() {
		return bookId;
	}
	public static int getFineperday() {
		return finePerDay;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(boolean availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	public static LocalDateTime getCurrentdatetimeprovider() {
		return CurrentDateTimeProvider;
	}
	

    private LocalDateTime dueDate; 
	private boolean availabilityStatus;
	public Book(int bookId, @NotNull @NotEmpty String title, @NotNull @NotEmpty String author, LocalDateTime dueDate,
			boolean availabilityStatus) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.dueDate = dueDate;
		this.availabilityStatus = availabilityStatus;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", dueDate=" + dueDate
				+ ", availabilityStatus=" + availabilityStatus + "]";
	}
public Book() {
	// TODO Auto-generated constructor stub
}

	

}
