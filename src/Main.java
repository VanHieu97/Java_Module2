import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello Word");
//        System.out.println("Hello Word, Hi Ae");
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Nhập vào tên: ");
//        String name = myObj.nextLine();
//        System.out.println(name);

//        int number  = 10;
//        System.out.println(number);

//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Nhap vao mot so A: ");
//        int Number = myObj.nextInt();
//        System.out.println("Nhap vao mot so B: ");
//        int Number1 = myObj.nextInt();
//        int Sum = Number + Number1;
//        int multiplication = Number * Number1;
//        int subTraction = Number - Number1;
//        int division = Number / Number1;
//        int remainder = Number % Number1;
//        System.out.println("Tổng hai số là: "+Sum );
//        System.out.println("Tích hai số là: "+multiplication);
//        System.out.println("Hiệu hai số là: "+subTraction);
//        System.out.println("Thương hai số là: "+division);
//        System.out.println("Chia lấy dư hai số là: "+remainder);

        //Bài 1:Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
//        Scanner myNumber = new Scanner(System.in);
//        System.out.println("Nhập vào số A: ");
//        int numberA = myNumber.nextInt();
//        System.out.println("Nhập vào số B: ");
//        int numberB = myNumber.nextInt();
//        if(numberA % numberB == 0){
//            System.out.println("Số: "+numberA + " chia hết cho Số: "+ numberB);
//        }
        //Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
//        Scanner myAge = new Scanner(System.in);
//        System.out.println("Nhập vào tuổi: ");
//        int Age = myAge.nextInt();
//        if(Age < 16){
//            System.out.println("Không đủ điều kiện vào học lớp 10.");
//        }
        //Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
//        Scanner myNumber =  new Scanner(System.in);
//        System.out.println("Nhap vao mot so nguyen: ");
//        int NumberInteger = myNumber.nextInt();
//        if(NumberInteger > 0){
//            System.out.println("Số: "+NumberInteger+" Lớn hơn 0");
//        }else {
//            System.out.println("Số: " +NumberInteger+" Nhỏ hơn 0");
//        }
        //Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
//        Scanner myInteger = new Scanner(System.in);
//        System.out.println("Nhập vào số Nguyên A: ");
//        int numberA = myInteger.nextInt();
//        System.out.println("Nhập vào số Nguyên B: ");
//        int numberB = myInteger.nextInt();
//        System.out.println("Nhập vào số Nguyên C: ");
//        int numberC = myInteger.nextInt();
//        if(numberA > numberB && numberA > numberC){
//            System.out.println("Số: "+ numberA + " là số lớn nhất.");
//        }else if (numberB > numberA && numberB > numberC){
//            System.out.println("Số: "+ numberB + " là số lớn nhất.");
//        }else {
//            System.out.println("Số: "+ numberC + " là số lớn nhất.");
//        }
        //Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ.
//        Scanner myPoint = new Scanner(System.in);
//        System.out.println("Nhập vào điểm Kiểm Tra: ");
//        double pointKT = myPoint.nextDouble();
//        System.out.println("Nhập vào điểm Giữa Kỳ: ");
//        double pointGK = myPoint.nextDouble();
//        System.out.println("Nhập vào điểm Cuối Kỳ: ");
//        double pointCK = myPoint.nextDouble();
//        double Avg = (pointKT + pointGK + pointCK) / 3;
//        System.out.println(Avg);
//        if(Avg >8.5 && Avg < 10){
//            System.out.println("Học Sinh Giỏi");
//        }else if(Avg<=8.5 && Avg > 7){
//            System.out.println("Học Sinh Khá");
//        }else if(Avg<=7 && Avg >5){
//            System.out.println("Học Sinh Trung Bình");
//        }else {
//            System.out.println("Học Sinh Yếu");
//        }
        //Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
//        Scanner Sales = new Scanner(System.in);
//        System.out.println("Nhập doanh số bán hàng: ");
//        int DoanhSo = Sales.nextInt();
//        if(DoanhSo > 5000){
//            System.out.println("Phần trăm được hưởng là: "+ 10+"%");
//        }else if(DoanhSo > 3000){
//            System.out.println("Phần trăm được hưởng là: "+ 5+"%");
//        }else {
//            System.out.println("Phần trăm được hưởng là: "+ 3+"%");
//        }
        //Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
//        Scanner doC = new Scanner(System.in);
//        System.out.println("Nhập vào nhiệt độ cần quy đổi: ");
//        double DoC = doC.nextDouble();
//        double Reverse = (DoC * 9/5) +32;
//        System.out.println(Reverse + " Độ F");
        //Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
//        Scanner feet = new Scanner(System.in);
//        System.out.println("Nhập vào số M cần quy đổi: ");
//        double meters = feet.nextDouble();
//        double reverse = meters*3.2808;
//        System.out.println(reverse +" Ft");
        //Bài 3: Tính diện tích hình vuông khi biết cạnh a.
//        Scanner acreage = new Scanner(System.in);
//        System.out.println("Nhập vào cạnh a: ");
//        double square = acreage.nextDouble();
//        double acreageSquare = square*4;
//        System.out.println(acreageSquare+" m2");
        //Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
//        Scanner acreage = new Scanner(System.in);
//        System.out.println("Nhập vào chiều dài: ");
//        double length = acreage.nextDouble();
//        System.out.println("Nhập vào chiều rộng: ");
//        double width = acreage.nextDouble();
//        double square  = length * width;
//        System.out.println("Diện tích hình chữ nhật là: "+square+" m2");
        //Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
//        Scanner triangle = new Scanner(System.in);
//        System.out.println("Nhập vào cạnh a:");
//        double canhA = triangle.nextDouble();
//        System.out.println("Nhập vào cạnh b:");
//        double canhB = triangle.nextDouble();
//        double Triangle = 0.5*(canhA * canhB);
//        System.out.println(Triangle+"m2");
        //Bài 6: Giải phương trình bậc 1.
//        Scanner ptb1 = new Scanner(System.in);
//        System.out.println("Nhập tham số a:");
//        double soA = ptb1.nextDouble();
//        System.out.println("Nhập tham số b:");
//        int soB = ptb1.nextInt();
//        if(soA == 0 && soB == 0){
//            System.out.println("Phương trình có vô số nghiệm");
//        }else if(soA == 0 && soB != 0){
//            System.out.println("Phương trình vô nghiệm");
//        }else {
//            System.out.println(" Phương trình có một nghiệm duy nhất X= "+(-soB/soA));
//        }
        //Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không.
        // Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
//        Scanner AgeInteger = new Scanner(System.in);
//        System.out.println("Nhập vào một số nguyên:");
//        int Age  = AgeInteger.nextInt();
//        if(Age > 0 && Age <120){
//            System.out.println("Tuổi của người là:"+Age+" Tuổi");
//        }else {
//            System.out.println("Không phải tuổi của người");
//        }
        //Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác.
        // Điều kiện để a,b,c là cạnh của một tam giác là:
        //a,b,c > 0
        //a + b > c
        //b + c > a
        //a + c > b
//        Scanner triangle = new Scanner(System.in);
//        System.out.println("Nhập vào cạnh a:");
//        double canhA = triangle.nextDouble();
//        System.out.println("Nhập vào cạnh b:");
//        double canhB = triangle.nextDouble();
//        System.out.println("Nhập vào cạnh c:");
//        double canhC = triangle.nextDouble();
//        if (canhA > 0 && canhB > 0 && canhC > 0) {
//            if (canhA + canhB > canhC) {
//                if (canhB + canhC > canhA) {
//                    if (canhA + canhC > canhB) {
//                        System.out.println("Là cạnh của tam giác");
//                    } else {
//                        System.out.println("không phải là cạnh của tam giác");
//                    }
//                } else {
//                    System.out.println("Không phải là cạnh của tam giác");
//                }
//            } else {
//                System.out.println("không phải là  cạnh của tam giác");
//            }
//        } else {
//            System.out.println("Không phải là cạnh của tam giác");
//        }

    }
}