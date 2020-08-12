package com.tcsion;

import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class Submit
 */
@WebServlet("/Submit.do")
public class Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Submit() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionSub qs = new QuestionSub();
		qs.setAuthname(request.getParameter("name"));
		qs.setEmail(request.getParameter("email"));
		qs.setQuestype(request.getParameter("questype"));
		qs.setQuesdiff(request.getParameter("quesdiff"));
		qs.setQues(request.getParameter("ques"));
		qs.setOpta(request.getParameter("opta"));
		qs.setOptb(request.getParameter("optb"));
		qs.setOptc(request.getParameter("optc"));
		qs.setOptd(request.getParameter("optd"));
		qs.setCorrans(request.getParameter("corrans"));
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		config.addAnnotatedClass(com.tcsion.QuestionSub.class);
		ServiceRegistry servReg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory factory = config.buildSessionFactory(servReg);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(qs);
		session.getTransaction().commit();
		session.close();
		RequestDispatcher next = request.getRequestDispatcher("quesinfo.jsp");
		next.forward(request, response);
	}

}