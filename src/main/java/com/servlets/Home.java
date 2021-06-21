package com.servlets;

<<<<<<< HEAD
=======
import java.io.BufferedInputStream;
import java.io.FileInputStream;
>>>>>>> 45c3e31349beec1734e9a47b74b0da13833d5a81
import java.io.IOException;
import java.io.PrintWriter;

// import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
    try {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.print("hello");
      out.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
=======
    // String file = "resources/ShowMe.txt";
    // String file = "ShowMe.txt";
    // String file = "C:\\apache-tomcat-8.5.65\\apache-tomcat-8.5.65-4\\webapps\\java\\resources\\ShowMe.txt";
    // String file = "webapps/java/resources/ShowMe.txt";
    // String file = "ShowMe.txt";
    // String file = "./ShowMe.txt";
    // Read file
    PrintWriter out = response.getWriter();
    // try (FileInputStream fis = new FileInputStream(file); BufferedInputStream bis = new BufferedInputStream(fis)) {
    try {
      response.setContentType("text/html");
      out.print("hello ");

      String currentDirectory = System.getProperty("user.dir");
      out.print("The current working directory is " + currentDirectory);
      // while (bis.available() > 0) {
      //   out.print((char) bis.read());
      // }
    } catch (Exception e) {
      out.print("file not found hello");
      e.printStackTrace();
    }
    out.close();
>>>>>>> 45c3e31349beec1734e9a47b74b0da13833d5a81
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  }
}
