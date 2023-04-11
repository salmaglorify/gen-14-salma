package com.salma.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.salma.web.model.Dosen;
import com.salma.web.dao.DosenDao;

@WebServlet("/")
/**
 * Servlet implementation class GetDosenController
 */
public class GetDosenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DosenDao dao;

	public void init() throws ServletException {
		dao = new DosenDao();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getServletPath();
			
		try {
			switch (action) {
			
			case "/new":
				showNewForm(request, response);
				break;
				
			case "/insert":
				insertDosen(request, response);
				break;
				
			case "/delete":
				deleteDosen(request, response);
				break;
				
			case "/edit":
				showEditForm(request, response);
				break;
				
			case "/update":
				updateDosen(request, response);
				break;
				
			default:
				daftarDosen(request, response);
				break;	
		}
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException(e);
		}
	}
	
	private void daftarDosen(HttpServletRequest request, HttpServletResponse response) {
		try {
			List<Dosen> daftarDosen = dao.selectAllDosen();
			request.setAttribute("daftarDosen", daftarDosen);
			RequestDispatcher rd = request.getRequestDispatcher("dosen-list.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("create-form.jsp");
		rd.forward(request, response);
	}	
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Dosen existingDosen = dao.selectDosen(id);

		RequestDispatcher rd = request.getRequestDispatcher("update-form.jsp");
		request.setAttribute("dosen", existingDosen);
		rd.forward(request, response);
	}
	
	private void insertDosen(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nama = request.getParameter("nama");
		Dosen newDosen = new Dosen(id, nama);
		dao.insertDosen(newDosen);
		response.sendRedirect("list");
	}
		
	private void updateDosen(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
//		System.out.println(id);
		String nama = request.getParameter("nama");
//		System.out.println(nama);
		Dosen dosen = new Dosen(id, nama);
		dao.updateDosen(dosen);
		response.sendRedirect("list");
	}
	
	private void deleteDosen(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		dao.deleteDosen(id);
		response.sendRedirect("list");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
