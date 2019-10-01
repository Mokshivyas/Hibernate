package com.zensar.daos;


import java.util.List;

import com.zensar.entities.*;

//import com.zensar.services.*;




/**
 * @author Mokshi Vyas
 * @version 2.0
 * @creation_date 21st Sep 2019 5.29PM
 * @modification_date 29 Sep 2019 11.27aM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Data Access Object Interface.
 * 				It is used in Persistence Layer of Application.
 *    
 */



public interface UserDao {
	void insert(User user) ;
	void update(User user);
	void delete(User user);
	User getByUsername(String username);
	List<User> getAll();
}
