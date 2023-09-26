import baitap.Circle;
import baitap.Shape;
import ra.Animals;
import ra.Calculator;
import ra.Cat;
import ra.Pets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.setWeight(100);
//        cat1.setHeight(20);
//        System.out.println(cat1);
        // tính tổng 2 số
        System.out.println(" tổng 2 số 4 và 5 là " + Calculator.sum(4, 5));
        List<Integer> array = new ArrayList<>();
        // lấy phân tử nhanh
        // chuyển đổi qua LinkedList
        List<Integer> array1 = new LinkedList<>(array);
        Cat cat = new Cat();
        Animals animals = cat; // ép kiểu ngầm dinh

        // kiểu khai báo của animals : Animals nhưng kiểu thực thực tế của nó là Cat
        // trước khi ép kiểu tường minh phải kiểm tra xem đối tượng đó có kieieur thực tế là gì
        if (animals instanceof Cat){
            Cat cat1 =(Cat) animals; // ép kiểu tường mình
        }
        if (animals instanceof Pets) {
            Pets pets = (Pets) animals;
        }

//        Bài tập  : cho 4 lớp Shape(Hình học) , Rectangle(hình chữ nhật), Circle(hình tròn),
        // Triangle(hình tam giác) , có cách thuộc tính là các cạnh hoặc bán hính , sử dụng kế thừa
        // và ghi đè để thiết kế và xây dựng các lớp trên  có 2 phương thức tính chu vi và tính diện
        // tích thông qua các thuộc tính của nó

        Shape hinhTron  = new Circle(3);
        // tính chu vi, diên tích
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        System.out.printf("chu vi hình tron là : %.1f \n",hinhTron.getChuVi());
        System.out.printf("diện tích hình tron là : %.1f \n",hinhTron.getDienTich());
    }
}