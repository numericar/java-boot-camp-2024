// https://youtu.be/_m_-km4RyZg?si=IImJb3iuK8-f20JQ&t=1949
public class Operator {
    public static void main(String[] args) {
        arithmetic();
        relational();
        logical();
        bitwise();
        assignmentOperator();
        unaryOperator();
        ternary();
    }

    public static  void arithmetic() {
        // variable type inference (var) ทำให้ compiler รู้ type ได้้ยตัวเอง โดยดูจากชนิดของข้อมูล
        var add = 10 + 10;
        var minus = 10 - 10;
        var multiply = 10 * 10;
        var divide = 10 / 10;
        var modulo = 89 % 10; // หารเอาเศษ
    }

    // มองเรื่องความสัมพันธุ์ของข้อมูล relat
    public static  void relational() {
        var isEqual = 10 == 10;
        var isNotEqual = 10 != 10;
        var isGreater = 25 > 10;
        var isGreaterOrEqual = 25 >= 10;
        var isLessThan = 25 < 10;
        var isLessThanOrEqual = 25 <= 10;

    }

    public static  void logical() {
        // ใช้สำหรับดูว่ามันเป็นความจริงหรือไม่ โดยจะประกอบด้วย และ(AND) หรือ(OR) นิเศษ(NOT)
        // AND - ทั้งคู่จะต้องเป็นจริง
        int score = 20;
        var isInGradeScore = (score >= 0) && (score <= 100);

        // OR - อย่างได้อย่างหนึ่งเป็นจริง
        var day = 23;
        var isGoToMall = (day >= 5 && day <= 10) || (day >= 15 && day <= 20);

        // NOT เปลี่ยนจริงให้เป็นเทต และ เปลี่ยนเท็ตให้เป็นจริง
        var isEnable = !true;
    }

    public static  void bitwise() {

    }

    public static  void assignmentOperator() {
        // assign value to variable
        var day = 25;

        // combination arithmethic + assignment
        var amount = 20;
        amount += 10; // amount = amount + 10;
        System.out.println("Current amount = " + amount);
    }

    public static  void unaryOperator() {
        // ใช้งานในข้อมูลที่เป็นตัวเลข 

        // increment เพิ่ม value ++
        int val = 0;
        val++; // return ค่าปัจจุบันก่อนเพิ่มขึ้น 1
        ++val; // เพิ่มค่าปัจจุบันขึ้น 1 ก่อน return

        // decrement ลบ value --
        val--; // return ค่าปัจจุบันก่อนลดลง 1
        --val; // ลดค่าปัจจุบันก่อน return
    }

    public static  void ternary() {
        // ถ้าเกิดว่า ตรงเงื่อนไข จะเข้า if ถ้าไม่ตรงจะเข้า else
        var score = 87;
        var isAGrade = score >= 80;

        if (isAGrade) {

        } else {

        }

        var r = isAGrade ? "PASS" : "FAIL";
        System.out.println(r);
    }
}
