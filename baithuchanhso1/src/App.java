import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Khai báo biến
        double A,B,C,X1,X2,delta;
        //Thông báo cho người dùng nhập hệ số
        System.out.println("Nhap so A ");
        //Đọc giá trị người dùng nhập vào từ bàn phím => gán vào biến
        //Khai báo đối tượng Scanner để đọc dữ liệu người dùng nhập vào
        Scanner sc = new Scanner(System.in);
        //Gán giá trị người dùng nhập vào từ bàn phím cho biến số A
        A = sc.nextDouble();
        //Thông báo cho người dùng nhập hệ số
        System.out.println("Nhap so B ");
        B = sc.nextDouble();
        System.out.println("Nhap so C ");
        C = sc.nextDouble();
        delta = B*B - 4*A*C;
        System.out.println("delta = " + delta);
        if(delta>0){
            System.out.println("Phuong trinh co 2 nghiem " + (X1= (-B + Math.sqrt(delta))/2*A) + "  "+ (X2= (-B - Math.sqrt(delta))/2*A));
        }
        else if(delta==0){
                System.out.println("Phuong trinh co nghiem kep :" + ( X1=X2=-B/2*A));
        }else{
            System.out.println("Phuong trinh vo nghiem");
        } 
    }
}