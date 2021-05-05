/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevenckwong.ngecryptotrader.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;

/**
 *
 * @author steven
 */
@WebServlet(name = "processRequest", urlPatterns = {"/processRequest"})
public class processRequest extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Date currentDate = new Date();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet processRequest</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet processRequest at " + request.getContextPath() + "</h1>");
            out.println(this.newContent());
            out.println("<br/><br/><a href='index.html'>Back</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public String newContent() {
        
        String newFeatures = new String();
        
        newFeatures += "<h2>Here are the newest features of the solution</h2>";
        
        // ******** Add new features here...
        // ******** Use this syntax: newFeatures += "[JIRA_ID] - [Some Text] <br/>";
        newFeatures += "[JIRA_ID] - [Some Text] <br/>";
        
                
        // ******** End of new features
        
        newFeatures += "<br/><h2>Existing Features</h2>";
        
        // ******** Move the last new features here 
        
        // ******** End of old features
        
        return newFeatures;
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
