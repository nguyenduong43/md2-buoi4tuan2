package So;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestKiemTra {
    @Test
    public void Fizz()
    {
        KiemTra so = new KiemTra();
        String s=so.kiemtra(3);
        assertSame("Fizz",s);
    }
    @Test
    public void Buzz()
    {
        KiemTra so = new KiemTra();
        String s=so.kiemtra(5);
        assertEquals("Buzz",s);
    }
    @Test
    public void Sothuong()
    {
        KiemTra so = new KiemTra();
        String s=so.kiemtra(7);
        assertSame("so binh thuong",s);
    }
}
