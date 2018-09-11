package myself.controller;

import myself.services.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;
    @RequestMapping("/getAllUserName")
    public List<String> getAllUserName(){
        List<String> userNameList = indexService.getAllUserName();
        return userNameList;
    }
    @RequestMapping("/downloadExcel")
    public void downloadExcel(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> message = new HashMap();
        try {
            String fileName = "template.xls";
            response.setHeader("Content-disposition", "attachment;fileName="+fileName);
            //通知客服文件的MIME类型
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            String filePath = getClass().getResource("/static/"+fileName).getPath();
//            String path = filePath.substring(6, filePath.length());
            FileInputStream fileIutputStream = new FileInputStream(filePath);

            OutputStream out = response.getOutputStream();
            byte[] b = new byte[2048];
            int len;
            while ((len = fileIutputStream.read(b)) != -1) {
                out.write(b, 0, len);
            }
            response.setHeader("Content-Length", String.valueOf(fileIutputStream.getChannel().size()));
            fileIutputStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
