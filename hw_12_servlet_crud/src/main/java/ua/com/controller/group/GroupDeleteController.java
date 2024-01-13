package ua.com.controller.group;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ua.com.service.GroupCrudService;
import ua.com.service.impl.GroupCrudServiceImpl;
import java.io.IOException;

public class GroupDeleteController extends HttpServlet {

    private final GroupCrudService groupCrudService = new GroupCrudServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        groupCrudService.delete(id);
        resp.sendRedirect("groups");
    }
}
