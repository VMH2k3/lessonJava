package inherit;

public class Student extends Person{
    int Class;
public Student(String name, int age, int Class){
    super(name, age);
    this.Class = Class;
}
@Override
void speak(){
    System.out.println("I'm a student");
}

    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 1);
        s1.speak();
    }
}
