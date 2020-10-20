package _04_AAART.hibernate.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import _04_AAART.hibernate.model.ShowBean;
import _04_AAART.hibernate.model.ShowBeanDAO;
import _04_AAART.hibernate.model.ShowBeanService;
import hibernateweb.util.HibernateUtil;

/**
 * Servlet implementation class DemoHibernateAction1
 */
@WebServlet("/DemoHibernateAction1")
public class DemoHibernateAction1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processAction(request, response);
	}

	private void processAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		//用DAO物件帶入方法
//		ShowBeanDAO sDao = new ShowBeanDAO(session);
		//建service物件，用service帶入方法
		ShowBeanService showService = new ShowBeanService(session);
		ShowBean showBean = showService.select(1000);	
//		System.out.println(showBean.getACT_NO()+":"+showBean.getACT_TITLE()+showBean.getACT_DESCRIPTION());
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.write("ATC_Id:" + showBean.getACT_NO() + "<br/>");
		out.write("ACT_TITLE:" + showBean.getACT_TITLE() + "<br/>");
		out.write("ACT_TITLE:" + showBean.getACT_DESCRIPTION() + "<br/>");
		
		out.close();
	}

}
