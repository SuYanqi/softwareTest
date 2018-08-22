package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class LogicServiceTest {
	LogicService logserv;
	int parm1;// 定义入参
	int parm2;// 定义入参
	int res;// 定义入参

	public LogicServiceTest(int parm1, int parm2, int res) {// 定义构造函数
		this.parm1 = parm1;
		this.parm2 = parm2;
		this.res = res;
	}

	@Parameters   
	public static Collection<Object[]> initParm(){
	       return  Arrays.asList(new Object[][]{
	          {1,1,2},{1,2,3},{1,3,4},{1,3,5}//{}里的参数一定要和构造函数一一对应
	   });
	   }
    public void setUp() throws Exception {
        logserv = new LogicService();
    }

    @Test
    public void testAdd() {
        assertEquals(res,logserv.add(parm1, parm2));
    }

    @Ignore
    public void testSub() {
    }

}
