package webapp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
PrintWriter writer = response.getWriter();

int test = 1;

if (test == 0) {
	
writer.println("THERE'S AN ERROR ON THE PAGE");

}

else {
request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
}
 }

}

