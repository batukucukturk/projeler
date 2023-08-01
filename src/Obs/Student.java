package Obs;

public class Student {
    String name, stuNo;
    int classes;
    Course mat, fizik, kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;


    }

    void addBulkExamNote(int mat, int smat, int fizik, int sfizik, int kimya, int skimya) {
        if (mat >= 0 && mat <= 100 && smat >= 0 && smat <= 100) {
            this.mat.note = mat;
            this.mat.snote = smat;
        }
        if (fizik >= 0 && fizik <= 100 && sfizik >= 0 && sfizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.snote = sfizik;
        }
        if (kimya >= 0 && kimya <= 100 && skimya >= 0 && skimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.snote = skimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fzk= (this.fizik.note*0.80)+(this.fizik.snote*0.20);
        double mt=(this.mat.note*0.80)+(this.mat.snote*0.20);
        double kmy=(this.kimya.note*0.80)+(this.kimya.snote*0.20);
        this.avarage= (fzk+mt+kmy)/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        if (this.avarage >= 55) {
            return true;
        } else return false;
    }

    void printNote() {
        System.out.println("========================");
        System.out.println("Öğrenci :" + this.name);
        System.out.println("Matematik Notu :" + this.mat.note+"\nMatamatik Sözlü Notu :"+this.mat.snote);
        System.out.println("Fizik Notu :" + this.fizik.note+"\nFizik Sözlü Notu :"+this.fizik.snote);
        System.out.println("Kimya Notu :" + this.kimya.note+"\nKimya Sözlü Notu :"+this.kimya.snote);
        System.out.println("Yazılı Notu %80 - Sözlü Notu %20 Etkileyecektir");
        System.out.println("Ortalama : " + this.avarage);

    }

}

