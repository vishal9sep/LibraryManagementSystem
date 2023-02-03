package com.sillovilla.controller;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillovilla.entities.Book;
import com.skillovilla.entities.User;
import com.skillovilla.repository.BookDao;
import com.skillovilla.repository.UserDao;

@RestController
@RequestMapping("/users")
public class UserController{

	@Autowired
	private BookDao bookDao;
	@Autowired
	private UserDao userDao;

	@GetMapping("/lend/{userId}")
	public String lendBook(@PathVariable("userId") Integer userId, @RequestParam Integer bookId) {
		
		Optional<Book> opt = bookDao.findById(bookId);
		Book book = opt.get();
		Optional<User> optional = userDao.findById(userId);
		User user = optional.get();
		Long fine = 0L;
		if (LocalDateTime.now().isAfter(book.getDueDate())) {
			Long extraDaysLong = Duration.between(book.getDueDate(), LocalDateTime.now()).toDays();
			fine = book.getFineperday() * extraDaysLong;
		}
		user.setNoOfIssuedBooks(user.getNoOfIssuedBooks() - 1);
		book.setAvailabilityStatus(true);
		book.setDueDate(null);
		userDao.save(user);
		bookDao.save(book);
		return " book returned with fine" + fine;
		
	}

	@GetMapping("/returnBook/{userId}")
	public String returnBook(@PathVariable("userId") Integer userId, @RequestParam Integer bookId) {
		
		Optional<Book> opt = bookDao.findById(bookId);
		Book book = opt.get();
		Optional<User> optional = userDao.findById(userId);
		User user = optional.get();
		Long fine = 0L;
		if (LocalDateTime.now().isAfter(book.getDueDate())) {
			Long extraDaysLong = Duration.between(book.getDueDate(), LocalDateTime.now()).toDays();
			fine = book.getFineperday() * extraDaysLong;
		}
		user.setNoOfIssuedBooks(user.getNoOfIssuedBooks() - 1);
		book.setAvailabilityStatus(true);
		book.setDueDate(null);
		userDao.save(user);
		bookDao.save(book);
		return " book returned with fine" + fine;
		
	}

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		
		User insertedUser = userDao.save(user);
		return insertedUser;
		
	}

}
