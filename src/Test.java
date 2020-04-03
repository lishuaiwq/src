import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8,16,
            120, TimeUnit.SECONDS, new LinkedBlockingQueue<>(120));
    public static void main(String[] args) {


        threadPoolExecutor.execute(()-> System.out.println("呵呵呵"));
        List<Runnable> runnables = threadPoolExecutor.shutdownNow();
    }
}
