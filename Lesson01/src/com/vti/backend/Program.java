package com.vti.backend;

import java.util.Date;

public class Program {
	
	public static void main(String args[]) {
	
		//Doi tuong department1	
		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Phòng HR";
		
		//Doi tuong department2
		Department department2 = new Department();
		department2.id = 2;
		department2.departmentName = "Phòng R&D";
		
		//Doi tuong position1
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = "Dev";
		
		//Doi tuong position2
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = "Test";
		
		//Doi tuong users1
		Users users1 = new Users();
		users1.id = 1;
		users1.userName = "dangblack";
		users1.password = "654321b";
		users1.department = department1;
		users1.position = position1;
		users1.gender = Gender.MALE;
		users1.dateOfBirth = new Date("2024/07/19");
		
		//Doi tuong users2
		Users users2 = new Users();
		users2.id = 2;
		users2.userName = "quanganh";
		users2.password = "123456a";
		users2.department = department2;
		
		System.out.println("----Thông tin của User1----\n");
		System.out.println("Id:" + users1.id);
		System.out.println("UserName:" + users1.userName);
		System.out.println("Password:" + users1.password);
		System.out.println("Phòng ban:" + department1.departmentName);
		System.out.println("Chức vụ:" + position1.positionName);
		System.out.println("Giới tính:" + users1.gender);
		System.out.println("Ngày sinh:" + users1.dateOfBirth);
		
		
	}
}
