package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1,"Books");
		System.out.println(obj);
		Seller seller = new Seller(11,"Books","Teste@gmail.com",
				new Date(),3650.5,obj);
		System.out.println(seller);
	}

}
