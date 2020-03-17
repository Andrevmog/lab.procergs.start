package com.procergs.starter.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.procergs.starter.db.OfferDao;
import com.procergs.starter.domain.Offer;



@WebServlet("/teste")
public class OfferController extends HttpServlet {


	private static final long serialVersionUID = -6794238896686584661L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, 
	NullPointerException
	{
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>");
		writer.println("Offers: <br/>");	
		List<Offer> offers = new OfferDao().getList();	
		writer.println("<ul>");
		for(Offer offer : offers) {
			writer.println("<li>"+ offer.getId()+" "+
					offer.getProcurementNumber()+" "+
					offer.getProcurementYear()+" "+
					offer.getIdCompany()+" "+
					offer.getCoordinator()+"</li>");					
		}
		writer.println("</ul>");
		writer.println("</body></html>");
	}

}
