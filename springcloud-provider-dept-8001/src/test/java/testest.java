import org.apache.catalina.core.ApplicationContext;

/**
 * @author lee
 * @date 2020/10/13 - 5:31 下午
 */
public class testest extends Thread{
    public static void main(String[] args) throws ClassNotFoundException {

        testest t1 = new testest();
        testest t2 = new testest();

        t1.start();
        System.out.println("111");
        t2.start();
        System.out.println("222");
    }
    public void run() {
        System.out.println("000");
    }

}
