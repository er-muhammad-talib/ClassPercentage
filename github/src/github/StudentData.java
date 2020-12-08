package github;

public class StudentData {
	int id;
	String name;
	String gender;
	int age;
	long phone;
	char degree;
	double gpa;
	
	
	boolean international;
	double tuitionFees = 12000.0;
	double internationalFee = 5000.0;
    
	
	void main() {
//		String nextYearId = id +"0012";
		
//		if(international) {
//			tuitionFees = tuitionFees + internationalFee;
//		}
		System.out.println("\nid :" + "  " + id);
//		System.out.println("nextYearId :" + "  " + nextYearId);
		System.out.println("name :" + "  " + name);
		System.out.println("gender :" + "  " + gender);	
		System.out.println("age :" + "  " + age);
		System.out.println("phone :" + "  " + phone);
		System.out.println("degree :" + "  " + degree );
		System.out.println("gpa :" + "  " + gpa);
		System.out.println("tuitionFees :" + "  " + tuitionFees);	
		System.out.println("internationalFee :" +"  " + internationalFee);
		
	}
	
	 public static void main(String[] args) {
         StudentData student1 = new StudentData();
		
	     student1. id = 1000;
		 student1.name = "Talib";
		 student1.gender = "male";
	     student1.age = 22;
		 student1.phone = 9927783203L;
		 student1.degree = 'B';
		 student1.gpa = 6.84;
	     student1.international = false;
		 student1.tuitionFees = 12000.0;
		 student1.internationalFee = 5000.0;
		 student1.main();
		
         StudentData student2 = new StudentData(); 
         student2. id = 1001;
		 student2.name = "Muhammad";
		 student2.gender = "male";
	     student2.age = 18;
		 student2.phone = 9958720112L;
		 student2.degree = 'B';
		 student2.gpa = 6.04;
	     student2.international = true;
		 student2.tuitionFees = 12000.0;
		 student2.internationalFee = 5000.0;
		 student2.main();
         
		 StudentData sstudent3 = new StudentData();
		 sstudent3. id = 1002;
		 sstudent3.name = "keshav";
		 sstudent3.gender = "male";
		 sstudent3.age = 24;
		 sstudent3.phone = 9958723322L; 
		 sstudent3.degree = 'B';
		 sstudent3.gpa = 5.99;
		 sstudent3.international = false;
		 sstudent3.tuitionFees = 12000.0;
		 sstudent3.internationalFee = 5000.0;
	     sstudent3.main();

		 
	}
	
	


}
