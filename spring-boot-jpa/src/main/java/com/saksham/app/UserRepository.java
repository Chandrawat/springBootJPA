package com.saksham.app;

import org.springframework.data.repository.CrudRepository;  
public interface UserRepository extends CrudRepository<UserRecord, String> {  
} 
