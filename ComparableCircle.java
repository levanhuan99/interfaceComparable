package intefaceComparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> { //mk gửi để cho nhé  //chưa hiểu tại s lại cần  ComparableCircle bên trong ngoặc <> để làm gì
    public ComparableCircle(){
   }
   //<> 2 cái ngoặc này là để truyền kiểu dữ liệu cho interface comparable comparable có kiểu dữ liệu
    // bài này là dùng interface có sẵn của java kp tạo
    // Họ truyền kiểm tham số là T cho interface comparable nên lúc mình implement cần truyền kiểu dữ liệu cho nó để thay thé cho T ok>>thanks nhé.mk cứ tưởng phỉa tạo hàm compareTo>>>ok
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color , boolean filled){
        super(radius,color,filled);
    }

    @Override
    public int compareTo(ComparableCircle comparableCircle) {//để mk sửa lại cả bài kia
        if (getRadius()>comparableCircle.getRadius()) return 1;
        else if (getRadius()<comparableCircle.getRadius()) return -1;
        else return 1;
    }
}
