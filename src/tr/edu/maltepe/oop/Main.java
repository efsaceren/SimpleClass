package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Efsa", 22, "Computer Science");
        Student student2 = new Student("Ceren", 21, "Mathematics");


        System.out.println("Name: " + student1.getName() + ", Age: " + student1.getAge() + ", Major: " + student1.getMajor());
        System.out.println("Name: " + student2.getName() + ", Age: " + student2.getAge() + ", Major: " + student2.getMajor());
    }
}
