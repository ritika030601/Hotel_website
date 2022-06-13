/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_pgms;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JButton;

@WebServlet(name = "Hotel_management_pg4_Book_now_1", urlPatterns = {"/Hotel_management_pg4_Book_now_1"})
public class Hotel_management_pg4_Book_now_1 extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Hotel_management_pg4_Book_now_1</title>");            
            out.println("</head>");
            out.println("<body style=\"background:url('Images/hd.jpg') ;background-size: 1550px, 600px; text-align: center ;font-family: 'Trebuchet MS' ;font-size:40\">");
            
            out.println("<h1>");
            response.setContentType("text/html");
            PrintWriter pr = response.getWriter();
            
            String name = request.getParameter("nm");
            String contact = request.getParameter("con");
            String member = request.getParameter("mem");
            String days = request.getParameter("day");
            
            out.println("<center><h2><br> Your Entered Details are :- </h2>");
            out.println("<h3>Name :- "+ name +"<br>");
            out.println("Contact No. :- "+ contact +"<br>");
            out.println("Members :- "+ member +"<br>");
            out.println("Days :- "+ days +"<br></h3></center><br>");
            out.println("Thankyou for contacting Sarova Woodlands.<br> We'll get back to you soon..!");
            
            out.println("<a href=\"Hotel_management_pg1.html\"><div id=\"x5\" style=\"position: absolute; top: 600px; left: 1300px\">");
            out.println("<input type=\"submit\" name=\"jump\" value=\"HOME\" style=\"background-image: url('Images/bei.jpg'); width:90px; height: 50px ;font-weight: bolder;font-family:'Trebuchet MS';font-size: 17px;border: 3px;border-color: black;border-style: ridge\"><br><br></div></a>");
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
