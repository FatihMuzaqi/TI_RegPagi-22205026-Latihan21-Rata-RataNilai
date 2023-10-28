package tipedata;
import java.util.Scanner;
public class latihan21_RatarataNilai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rata,total=0; 
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        int banyak = input.nextInt();
        for(int a = 1; a <= banyak; a++){
            System.out.print("Nilai Mahasiswa ke " + a + " : ");
            int nilai = input.nextInt();
            total += nilai;
        }
        rata = total / banyak;
        System.out.println("Rata Rata Nilai Adalah : " + rata);
    }
}
