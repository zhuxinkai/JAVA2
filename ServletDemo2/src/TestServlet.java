import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {   //通过继承HttpServlet 类被声明为一个Servlet对象。
    @Override
    //处理HTTP Get 请求
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    //初始化方法
    public void init() throws ServletException {
        super.init();
    }

    @Override
    //处理HTTP Post 请求
    //<form>表单对象所声明的method属性为post , 提交到Servlet 对象处理时，Servlet 将调用doPost()方法进行处理。
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    //处理http put 请求
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    //处理http delete 请求
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    //销毁方法
    public void destroy() {
        super.destroy();
    }
}
