import java.util.Arrays;

public class Class {
private int san;
private String name;
private int [] san1;

    public Class(int san, String name, int[] san1) {
        this.san = san;
        this.name = name;
        this.san1 = san1;
    }

    public int getSan() {
        return san;
    }

    public void setSan(int san) {
        this.san = san;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getSan1() {
        return san1;
    }

    public void setSan1(int[] san1) {
        this.san1 = san1;
    }


    @Override
    public String toString() {
        return "Class{" +
                "san=" + san +
                ", name='" + name + '\'' +
                ", san1=" + Arrays.toString(san1) +
                '}';
    }
        public void san1(int a){
            for (int i = 0; i < san1.length; i++) {
                if (i == a) {
                    System.out.println(san1[i]);
                }
            }
    }
}