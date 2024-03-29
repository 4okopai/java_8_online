package ua.com.controller.attachorremove;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.collections4.MapUtils;
import ua.com.service.GroupCrudService;
import ua.com.service.impl.GroupCrudServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class RemoveStudentFromGroup extends HttpServlet {

    private final GroupCrudService groupCrudService = new GroupCrudServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        long groupId = Long.parseLong(req.getParameter("id"));
        try (PrintWriter printWriter = resp.getWriter()) {
            printWriter.write("<!DOCTYPE html>");
            printWriter.write("<html lang='en'>");
            printWriter.write("<h1>");
            printWriter.write("Remove student from group");
            printWriter.write("</h1>");
            printWriter.write("<form method='post' action='/hw12/groups-removeStudent'>");
            printWriter.write("<label for='studentId'>Student ID:</label><br>");
            printWriter.write("<input type='number' id='studentId' name='studentId'/><br><br>");
            printWriter.write("<input type='hidden' id='groupId' name='groupId' value='" + groupId + "'/>");
            printWriter.write("<input type='submit' value='Remove'/>");
            printWriter.write("</form>");
            printWriter.write("</body>");
            printWriter.write("</html>");
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        long groupId = -1L;
        long studentId = -1L;
        if (MapUtils.isNotEmpty(parameterMap)) {
            if (parameterMap.containsKey("groupId")) {
                String[] tempGrId = parameterMap.get("groupId");
                groupId = Long.parseLong(tempGrId[0]);
            }
            if (parameterMap.containsKey("studentId")) {
                String[] tempStId = parameterMap.get("studentId");
                studentId = Long.parseLong(tempStId[0]);
            }
            groupCrudService.deleteStudentFromGroup(groupId, studentId);
        }
        resp.sendRedirect("groups");
    }
}
