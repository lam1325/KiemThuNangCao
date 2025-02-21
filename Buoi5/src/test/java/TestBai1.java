import com.example.Buoi5.Bai1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBai1 {
    Bai1 bai1;
    @BeforeEach
    public void test(){
        bai1 = new Bai1();
    }

    @Test
    public void testcong2sole(){
        Assertions.assertEquals(12,bai1.tongcacsole(5,7));
    }

    @Test
    public void testcong2sochan(){
        Assertions.assertThrows(IllegalArgumentException.class,()->bai1.tongcacsole(6,8));
    }

    @Test
    public void testcong1sochanva1sole(){
        Assertions.assertThrows(IllegalArgumentException.class,()->bai1.tongcacsole(4,1));
    }

    @Test
    public void testcongsoam(){
        Assertions.assertThrows(IllegalArgumentException.class,()->bai1.tongcacsole(-4,-2));
    }

    @Test
    public void testcon2solenhonhat(){
        Assertions.assertEquals(4,bai1.tongcacsole(1,3));
    }

    @Test
    public void testcon2sochannhonhat(){
        Assertions.assertThrows(IllegalArgumentException.class,()->bai1.tongcacsole(2,4));
    }
}
