package bdn.helloworld.service;

import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import bdn.helloworld.model.FinSecurity;
import bdn.helloworld.repository.AccountRepository;

@Service("accountService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public AccountServiceImpl() {
	}

	// @Autowired
	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	// @Autowired
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bdn.helloworld.service.AccountService#getAllSecurityTickers()
	 */
	@Override
	public String[] getAllSecurityTickers() {
		String[] _result = null;

		List<FinSecurity> _list = accountRepository.getAllFinSecurities();
		if (_list != null) {
			_result = new String[_list.size()];
			ListIterator<FinSecurity> _li = _list.listIterator();
			for (int i = 0; i < _list.size(); i++) {
				_result[i] = _li.next().getTicker();
			}

		}
		return _result;
	}

}
