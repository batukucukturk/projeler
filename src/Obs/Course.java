package Obs;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note = 0;
    int snote=0;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }

    void addTeacer(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    void printTeacer() {
        if (courseTeacher != null) {
            System.out.println(this.name + " Dersinin Öğretmeni :" + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");

        }
    }

}
