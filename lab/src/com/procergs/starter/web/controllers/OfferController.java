package com.procergs.starter.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
	List<Offer> offers = new OfferDao().getList();
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("inicio.jsp");
		
		req.setAttribute("offers", offers);
		
		dispatcher.forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
}
