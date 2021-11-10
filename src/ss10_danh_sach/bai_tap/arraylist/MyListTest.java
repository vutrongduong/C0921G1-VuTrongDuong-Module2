package ss10_danh_sach.bai_tap.arraylist;

public class MyListTest {
    static class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            Student student = (Student) obj;
            return this.name.equals(((Student) obj).name) && this.age == ((Student) obj).age;
        }
    }

    public static void main(String[] args) {
        MyList<Student> studentMyList = new MyList<>(5);
        studentMyList.ensureCapacity(5);
        studentMyList.add(new Student("Tai", 18));
        studentMyList.add(new Student("Tien", 25));
        studentMyList.add(new Student("Hien", 23));
        studentMyList.add(new Student("Duong", 22), 2);
        studentMyList.remove(3);

        MyList<Student> studentMyList2 = studentMyList.clone();

        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println(studentMyList.get(i).toString());
        }
        for (int i = 0; i < studentMyList2.size(); i++) {
            System.out.println(studentMyList2.get(i).toString());
        }
        System.out.println("index = "+studentMyList2.indexOf(new Student("Duong", 22)));
        System.out.println(studentMyList2.contains(new Student("Duong",22)));
        studentMyList2.clear();
        for (int i = 0; i < studentMyList2.size(); i++) {
            System.out.println(studentMyList2.get(i).toString());
        }

    }
}
