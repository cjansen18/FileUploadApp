package com.chrisjansen.FileUploadApp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/uploadFileResults")

public class UploadFileResultsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public UploadFileResultsServlet() {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        RequestDispatcher dispatcher
                = request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/uploadFileResults.jsp");

        dispatcher.forward(request, response);
    }

}