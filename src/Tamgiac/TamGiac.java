package Tamgiac;

public class TamGiac {
    public static String classify(int a, int b, int c) {

        // Không phải tam giác
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Khong phai la tam giac";
        }

        // Tam giác đều
        if (a == b && b == c) {
            return "Tam giac deu";
        }

        // Tam giác cân
        if (a == b || a == c || b == c) {
            return "Tam giac can";
        }

        // Tam giác thường
        return "Tam giac thuong";
    }
}
