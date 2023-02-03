package com.skillovilla.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.skillovilla.entities.User;

public interface UserDao extends JpaRepository< User , Integer >{	

}
