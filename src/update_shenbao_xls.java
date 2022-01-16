import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


@WebServlet("/update_shenbao")
public class update_shenbao_xls extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          req.setCharacterEncoding("utf-8");
          String sheet_name = req.getParameter("sheet_name");
        File file = null;
        OutputStream ot = null;
        /*
            更新当月的xlsx数据;
         */

        String shpath_1="/bin/bash /java_pro_scripts/update_shenbao_xls.sh  "+"\""+sheet_name+"\"";  //更新
        System.out.println(shpath_1);
        String shpath_2="/bin/bash /java_pro_scripts/update_shenbao_xls_send_jieguo.sh";   //更新
        Process process =null;
        try {
            file = new File("/java_pro_scripts/update_shenbao_sheet.txt");
            ot = new FileOutputStream(file);
            ot.write(sheet_name.getBytes());
            ot.close();
            Process exec = Runtime.getRuntime().exec(shpath_1);
            exec.waitFor();
            Runtime.getRuntime().exec(shpath_2).waitFor();
            resp.sendRedirect("http://www.wuhutuxin.com:8080/LiuCheng.jsp");  //转发
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
