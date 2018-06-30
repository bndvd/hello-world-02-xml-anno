package bdn.helloworld.repository;

import java.util.List;

import bdn.helloworld.model.FinSecurity;

public interface AccountRepository {

	List<FinSecurity> getAllFinSecurities();

}