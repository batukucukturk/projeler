package Obs;

public class Main {
    public static void main(String[] args) {
        Course mat =new Course("Matematik","101","MAT");
        Course fizik=new Course("Fizik","101","FZK");
        Course kimya=new Course("Kimya","101","KMY");

        Teacher t1=new Teacher("Naruto","05052","MAT");
        Teacher t2=new Teacher("Sassuke","05053","FZK");
        Teacher t3=new Teacher("Kakashi","05505","KMY");

        mat.addTeacer(t1);
        fizik.addTeacer(t2);
        kimya.addTeacer(t3);
        mat.printTeacer();
        fizik.printTeacer();
        kimya.printTeacer();


        Student s1 =new Student("Shino",4,"1234",mat,fizik,kimya);
        s1.addBulkExamNote(50,80,40,60,50,70);
        s1.isPass();

        Student s2=new Student("Neji",4,"1235",mat,fizik,kimya);
        s2.addBulkExamNote(100,50,40,90,80,70);
        s2.isPass();

        Student s3=new Student("Kiba",4,"1231",mat,fizik,kimya);
        s3.addBulkExamNote(50,20,40,80,90,20);
        s3.isPass();
    }
}
