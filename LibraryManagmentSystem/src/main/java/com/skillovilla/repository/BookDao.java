package com.skillovilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillovilla.entities.Book;

public interface BookDao extends JpaRepository< Book , Integer> {

}
