package com.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.capas.objects.User;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/auth")
public class AnotacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private User[] users = new User[2];
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnotacionServlet() {
        super();
        // TODO Auto-generated constructor stub
        users[0] = new User("Carlos98","123456789");
        users[1] = new User("Phoenix","123456789");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		boolean flag = false;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		for(int i=0;i<users.length;i++) {
			if(users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		if(flag) {
			out.println("<h1>Welcome "+ username +  "</h1>");
		}else {
			out.println("<h1>Ups... Credentials worngs !!!</h1>");
		}
		out.println("</body>");
		out.println("</html>");
		
	}

}
