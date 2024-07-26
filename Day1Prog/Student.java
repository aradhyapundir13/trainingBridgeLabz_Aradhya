package Training;

class Student {

    int studentID;
    int age;
    String name;
    int grade;

    public Student(int studentID, int age, String name, int grade) {
        this.studentID = studentID;
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("StudentID: "+studentID);
        System.out.println("Grade: "+grade);
        System.out.println("Age: "+age);
        System.out.println("------------------------------\n");
    }
    public static void main(String[] args) {
        Student obj = new Student(1,20,"Adi",90);
        Student obj1 = new Student(2,21,"Adi1",80);
        Student obj2 = new Student(3,22,"Adi2",70);
        Student obj3 = new Student(4,23,"Adi3",60);
        obj.display();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}