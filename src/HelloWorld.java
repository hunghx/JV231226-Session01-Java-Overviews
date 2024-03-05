import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {
    // biến instance - thể hiện / toàn cục

    // tạo hàm main nhanh : psvm / main
    public static void main(String[] args) {
        // đây là hàm đặc biệt trong java dùng để chạy chuong trình
        // chỉ nên có 1 phương thư main duy nhất trong 1 chương
        System.out.println("Hello world"); // hien thị nôi dung ra màn hình console
        // khai báo và gán giá trị biến
        // datatype <tên biến> = <giá trị>;
        // nguyên thủy
        int number = 10;
        float f =1.1f;
        short so = 20;
        long l = 1000;
        boolean check = true;
        char ch = 'c';
        byte b  = 127;

        // tham chiếu
        String  str = "Nguyễn Văn A";
        Date date  = new Date();// ngày tháng nawm giờphutst giây hiện tại
        System.out.println(f);

        // toán tử ++, -- đều dùng tăng/ giảm giá trị 1 biến đi 1 đơn vị
        // Tiền tố ++a, hậu tố a++
        // giá trị của biểu thức ++a là giá trị của a sau khi tăng
        // giá trị của biểu thức a++ là giá trị của a trước khi tăng
//        System.out.println(++number);
        // number = 10
        int result = number++ * (++number+number++);
        // 10*(11+10) = 210
        // 10*(12+12) = 240 đúng
        System.out.println(result);

        // Nhập xuất dữ liệu
        // Hiển thị
        System.out.printf("Number : %-10d | Float : %-10.2f | String : %-20s",number,f,str);
        // hiển thị với màu sắc trong màn console (sử dụng icon Window + .)
        System.out.println("\u001B[31mRed text");
        System.out.println("\u001B[32mGreen text");
        System.out.println("\u001B[33mYellow text");
        System.out.println("\u001B[34mBlue text");
        System.out.println("\u001B[35mPurple text");
        System.out.println("\u001B[36mCyan text 😢🤦‍♂️🤦‍♀️🤦‍♀️😜🤞✌️🤷‍♂️😁👍🙌😒😍😊😂🤣❤️⚛️♾️◀️🔼");
        System.out.println("\u001B[37mWhite text😊😂😂😂🤣🤣❤️");

        // Nhập dữ liệu
        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
        System.out.println("Hãy nhập 1 so");
        int input1 = Integer.parseInt(sc1.nextLine());
//        boolean boo = Boolean.parseBoolean(sc1.nextLine());
        System.out.println("Nhập tên");
        String input2 = sc1.nextLine();
        System.out.println(input1);
        System.out.println(input2);


        // sự khác biệt giữa primitive và wrapper class (Integer,Long , Short, Byte, Double, Float, Boolean, Character)
        int num1 = 100 ;
        Integer num2 = num1 ;
        int num3 = num2 ;
        // wrapper class cung cấp các phương thức(hàm)
        // wrapper class có thể null
        // autoboxing(tự đông bao bọc), unboxing(mở bao bọc) trong java để mô tả chuyên đổi qua lại giữa 2 kiểu dữ lieu trên
        Integer obj = 10  ; // tự động gọi đến phương thức valueOf() của Integer
        System.out.println(obj + 2); // tự động gọi đến phuong thức intValue() của obj

        // sơ dồ tự động ép kiểu
        // double -> float -> long -> int -> short-> byte





    }
}
