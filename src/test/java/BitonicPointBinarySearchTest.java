
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import problems.BitonicPointBinarySearchImpl;

public class BitonicPointBinarySearchTest {
    BitonicPointBinarySearchImpl<Integer> implementacao;
    Integer[] array1 = new Integer[]{7,12,16,18, 19, 20, 7,4,2,1};
    Integer[] array2 = new Integer[]{1,2,3,4,5,6,7,8,9,10};
    Integer[] array3 = new Integer[]{43,41,29,4,3,2,1};
    @Before
    public void SetUp(){
        implementacao = new BitonicPointBinarySearchImpl<Integer>();
    }

    @Test
    public void test01(){
        Assert.assertEquals((Integer) 20, implementacao.bitonicPoint(array1));
    }

    @Test
    public void test02(){
        Assert.assertEquals((Integer) null, implementacao.bitonicPoint(new Integer[0]));
    }

    @Test
    public void test03(){
        Assert.assertEquals((Integer) 43, implementacao.bitonicPoint(array3));
    }

    @Test
    public void test04(){
        Assert.assertEquals((Integer) 20, implementacao.bitonicPoint(new Integer[]{12,16,18, 19, 20, 7,2}));
    }

    @Test
    public void test05(){
        Assert.assertEquals((Integer) 5, implementacao.bitonicPoint(new Integer[]{5}));
    }

    @Test 
    public void test06(){
        Assert.assertEquals((Integer) 10, implementacao.bitonicPoint(new Integer[]{1,5,8,9,10,7}));
    }
    @Test 
    public void test07(){
        Assert.assertEquals((Integer) 10, implementacao.bitonicPoint(new Integer[]{1,10,9,8,7,5}));
    }
    @Test
    public void test08(){
        Assert.assertEquals((Integer) 7, implementacao.bitonicPoint(new Integer[]{1,3,5,6,7}));
    }
    @Test
    public void test09(){
        Assert.assertEquals((Integer) 7, implementacao.bitonicPoint(new Integer[]{1,3,4,5,6,7}));
    }
    @Test
    public void test10(){
        Assert.assertEquals((Integer) 8, implementacao.bitonicPoint(new Integer[]{8,7,6,5,4,3,2}));
    }
    @Test
    public void test11(){
        Assert.assertEquals((Integer) 8, implementacao.bitonicPoint(new Integer[]{8,7,6,5,3,2}));
    }

    @Test 
    public void test12(){
        Assert.assertEquals((Integer) 10, implementacao.bitonicPoint(new Integer[]{1,5,6,8,9,10,7}));
    }
    @Test 
    public void test13(){
        Assert.assertEquals((Integer) 10, implementacao.bitonicPoint(new Integer[]{1,10,9,8,7,5,4}));
    }
}
