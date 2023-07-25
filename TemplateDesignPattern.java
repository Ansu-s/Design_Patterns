package designPattens;

public class TemplateDesignPattern {

    abstract static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public final void introduce() {
            greet();
            introduceYourself();
            sayGoodbye();
        }

        private void greet() {
            System.out.println("Hello, my name is " + name + ".");
        }

        private void sayGoodbye() {
            System.out.println("Goodbye!");
        }

        protected abstract void introduceYourself();
    }

    static class Student extends Person {
        private String major;

        public Student(String name, int age, String major) {
            super(name, age);
            this.major = major;
        }

        @Override
        protected void introduceYourself() {
            System.out.println("I am a student, studying " + major + ".");
        }
    }

    static class Teacher extends Person {
        private String subject;

        public Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
        }

        @Override
        protected void introduceYourself() {
            System.out.println("I am a teacher, teaching " + subject + ".");
        }
    }


        public static void main(String[] args) {
            Person student = new Student("Ansu", 20, "Computer Science");
            student.introduce();

            System.out.println();

            Person teacher = new Teacher("Haraprasad", 35, "Mathematics");
            teacher.introduce();
        }
    }


