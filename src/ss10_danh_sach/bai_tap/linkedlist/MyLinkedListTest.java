package ss10_danh_sach.bai_tap.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student {
            private int id ;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public Student() {
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }


            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList=new MyLinkedList<>();
        Student student1=new Student(1,"Tai");
        Student student2=new Student(2,"Tien");
        Student student3=new Student(3,"Duong");
        Student student4=new Student(4,"Tu");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2,student4);
        myLinkedList.remove(3);
        myLinkedList.remove(student2);
        MyLinkedList<Student>clone=myLinkedList.clone();

        for(int i=0;i<myLinkedList.getSize();i++){
            Student student=(Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
        for(int i=0;i<clone.getSize();i++){
            Student student=(Student) clone.get(i);
            System.out.println(student.getName());
        }
        System.out.println(clone.contains(student1));
        System.out.println(clone.indexOf(student2));
        clone.clear();
//        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());

    }
}
