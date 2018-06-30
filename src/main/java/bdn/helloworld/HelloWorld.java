package bdn.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bdn.helloworld.service.AccountService;

public class HelloWorld {

	public static void main(String[] args) {
		ApplicationContext _appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		AccountService _svc = _appContext.getBean("accountService", AccountService.class);
		String[] _tickers = _svc.getAllSecurityTickers();

		for (int i = 0; i < _tickers.length; i++) {
			System.out.println(_tickers[i]);
		}
	}

}
