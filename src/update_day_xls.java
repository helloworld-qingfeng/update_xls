import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/update_very_day")
public class update_day_xls extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
            更新当月的xlsx数据;
         */
        String shpath_1="/bin/bash /java_pro_scripts/update_very_day.sh";   //更新
        String shpath_2="/bin/bash /java_pro_scripts/update_very_day_send_jieguo.sh";   //更新
        Process process =null;
        try {
            Process exec = Runtime.getRuntime().exec(shpath_1);
            exec.waitFor();
            Runtime.getRuntime().exec(shpath_2).waitFor();
            resp.sendRedirect("http://www.wuhutuxin.com:8080/LiuCheng.jsp");  //转发
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             /*
            更新当月的xlsx数据;
         */
        String shpath_1="/bin/bash /java_pro_scripts/update_very_day.sh";   //更新
        String shpath_2="/bin/bash /java_pro_scripts/update_very_day_send_jieguo.sh";   //更新
        Process process =null;
        try {
            Process exec = Runtime.getRuntime().exec(shpath_1);
            exec.waitFor();
            Runtime.getRuntime().exec(shpath_2).waitFor();
            resp.sendRedirect("http://www.wuhutuxin.com:8080/LiuCheng.jsp");  //转发
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
