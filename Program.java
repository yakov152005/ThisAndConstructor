import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

	}
	
	public static void ExStudent(){
		Scanner s = new Scanner(System.in);
		Student s1 = new Student("Yakov", 3);
		boolean addMoreCourses;
		do {
			System.out.println("Add another course? ");
			addMoreCourses = s.nextBoolean();

			if (addMoreCourses) {
				System.out.print("Enter the course name: ");
				String name = s.next();
				boolean res = s1.addSubject(name);
				if (res){
					System.out.println("Course is added success ");
				}else {
					System.out.println("Fail adding the course \n");
					addMoreCourses = false;
				}
			}
		}while (addMoreCourses);
		s1.show();

	}
	public static void Ex1Student(){
		Student s1 = new Student("Yakov", 3);
		s1.addSubject("java");
		s1.addSubject("Object-oriented");
		s1.addSubject("linear");
		s1.addSubject("Calculus");
		s1.addSubject("Discrete Mathematics");
		s1.addSubject("History of the people of Israel");

		s1.show();
	}
	public static void ExAdult(){
		Adult p1 = new Adult("Yakov BenHemo", "Computer Science", 206263667);
		Adult p2 = new Adult("Daniel Gino", 203499449);
		Adult p3 = new Adult(p1);

		System.out.println("Before: ");
		p1.show();
		p2.show();
		p3.show();

		p1.setProfession("Software Engineer");
		System.out.println("After: ");
		p1.show();
		p3.show();

	}
	public static void ExRectangle(){
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3,5);
		Rectangle r3 = new Rectangle(r1);
		System.out.println("The r1 area is: " +  r1.getArea());
		System.out.println("The r1 scope is: " + r1.getScope());
		r1.rectangleShapeWithChar('#');
		System.out.println();
		System.out.println("The r2 area is: " +  r2.getArea());
		System.out.println("The r2 scope is: " + r2.getScope());
		r2.rectangleShapeWithChar('x');
		System.out.println();
		System.out.println("The r3 area is: " +  r3.getArea());
		System.out.println("The r3 scope is: " + r3.getScope());
		r3.rectangleShapeWithChar('@');
		System.out.println();




	}
	public static void ExLocalDateTime(){
		LocalDateTime idt = LocalDateTime.now();
		System.out.println("Now is " +  idt);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("And now is " + idt.format(dtf));
	}
	public static void ExLocalDate(){
		LocalDate today = LocalDate.now();
		System.out.println("I made this example in the : " + today.toString());
		System.out.println("The day of the week is " + today.getDayOfWeek());
		System.out.println("Yesterday was " + today.minusDays(1).getDayOfWeek());
		System.out.println("Tomorrow is " + today.plusDays(1).getDayOfWeek() +
				" the " + today.plusDays(1));
		LocalDate comingSaturday = today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Coming Saturday is the " + comingSaturday.toString());

		LocalDate someDate = LocalDate.of(2024, Month.FEBRUARY, 18);
		System.out.println("Some date is " + someDate.toString());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Better print for Israel: " + someDate.format(dtf));

		LocalDate nextSalaryDate = someDate.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("Next salary enters at " + nextSalaryDate.toString());

		LocalDate d1 = LocalDate.of(2023, Month.FEBRUARY, 18);
		LocalDate d2 = LocalDate.of(2024, Month.FEBRUARY, 18);
		System.out.println("d1 before d2 ? " + d1.isBefore(d2));
		System.out.println("d1 after d2 ? " + d1.isAfter(d2));
		System.out.println("d1 compared to d2 ? " + d1.compareTo(d2));
	}
	public static void ExDate(){
		Date d1 = new Date();
		//System.out.println(d1.toGMTString());
		//System.out.println(d1.toLocaleString());
		//System.out.println(d1.toString());
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(df.format(d1));
	}
}
