package orm;

import java.util.Scanner;

public class DeptTest {
	
	public static void main(String[]args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("要新增的編號");
	int deptno = sc.nextInt();
	System.out.println("要新增的名稱");
	String dname = sc.next();
	System.out.println("要新增的所在地");
	String loc = sc.next();
	sc.close();
	
	
	
	//用Dept Bean包裝要新增的資料
	Dept dept = new Dept(deptno,dname,loc);
	//透過dao物件呼叫方法完成新增部門資料
	DeptDAO dao = new DeptDAOImpl();
	dao.save(dept);
	
	}
}
