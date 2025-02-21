import com.example.Buoi5.Bai2;
import com.example.Buoi5.Bai2Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestBai2 {
    Bai2Service service ;
    @BeforeEach
    public void setup(){
        service = new Bai2Service();
        service.getAll().add(new Bai2("1","hehe",3,20000.0f,300,"abc"));
        service.getAll().add(new Bai2("2","hehe1",4,25000.0f,30,"abcd"));
        service.getAll().add(new Bai2("3abcde","hehe2",5,27000.0f,400,"abce"));
    }

    @Test
    public void xoaThanhCong(){
        service.xoaTheoMa("1");
        Assertions.assertEquals(2,service.getAll().size());
    }

    @Test
    public void xoaMaKhongTonTai(){
        Assertions.assertThrows(IllegalArgumentException.class,()->service.xoaTheoMa("56"));
    }

    @Test
    public void xoaMaNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->service.xoaTheoMa(null));
    }

    @Test
    public void xoaMaRong(){
        Assertions.assertThrows(IllegalArgumentException.class,()->service.xoaTheoMa(""));
    }

    @Test
    public void xoaMaCoKhoangTrang(){
        Assertions.assertThrows(IllegalArgumentException.class,()->service.xoaTheoMa("      "));
    }

    // test bien
    @Test
    public void xoaMaCo1kitu(){
        service.xoaTheoMa("2");
        Assertions.assertEquals(2,service.getAll().size());
    }

    @Test
    public void xoaMaCo6kitu(){
        service.xoaTheoMa("3abcde");
        Assertions.assertEquals(2,service.getAll().size());
    }



}
