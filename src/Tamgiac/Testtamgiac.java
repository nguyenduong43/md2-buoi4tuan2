package Tamgiac;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testtamgiac {
    @Test
    public void tamgiacdeu()
    {
        TamGiac tg=new TamGiac();
        assertEquals("Tam giac deu",tg.classify(2,2,2));
    }
    @Test
    public void tamgiaccan()
    {
        TamGiac tg=new TamGiac();
        assertEquals("Tam giac can",tg.classify(3,3,4));
    }
    @Test
    public void tamgiacthuong()
    {
        TamGiac tg=new TamGiac();
        assertEquals("Tam giac thuong",tg.classify(3,4,5));
    }
    @Test
    public void khongphaitamgiac()
    {
        TamGiac tg=new TamGiac();
        assertEquals("Khong phai la tam giac",tg.classify(10,4,5));
    }
}
