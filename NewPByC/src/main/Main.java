package main;

import consumer.Account;
import consumer.Emp;
import consumer.Manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Account account=new Account();
         System.out.println(account.calSal(2000));
         Emp emp =new Emp();
         System.out.println(emp.calSal(2000));
         Manager manager =new Manager();
         System.out.println(manager.calSal(590990));
	}

}
