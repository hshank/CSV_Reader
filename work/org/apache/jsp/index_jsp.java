package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.net.*;

public final class hello_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Comma Separated Data</title>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function fetchData()\r\n");
      out.write("{\r\n");
      out.write("str=document.getElementById(\"myext\").value;\r\n");
      out.write("var xmlhttp;\r\n");
      out.write("if (str.length==0)\r\n");
      out.write("  { \r\n");
      out.write("  document.getElementById(\"responseText\").innerHTML=\"\";\r\n");
      out.write("  return;\r\n");
      out.write("  }\r\n");
      out.write("if (window.XMLHttpRequest)\r\n");
      out.write("  {// code for IE7+, Firefox, Chrome, Opera, Safari\r\n");
      out.write("  xmlhttp=new XMLHttpRequest();\r\n");
      out.write("  }\r\n");
      out.write("else\r\n");
      out.write("  {// code for IE6, IE5\r\n");
      out.write("  xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("  }\r\n");
      out.write("xmlhttp.onreadystatechange=function()\r\n");
      out.write("  {\r\n");
      out.write("  if ( xmlhttp.readyState==4)\r\n");
      out.write("    {\r\n");
      out.write("    document.getElementById(\"responseText\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("    \r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("xmlhttp.open(\"GET\",\"/MyFirstWebApp/hello1.jsp?myText=\"+str,true);\r\n");
      out.write("xmlhttp.send();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t <form action=\"index.jsp\">  \r\n");
      out.write("\t\t\t\t<table border=\"1\">  \r\n");
      out.write("\t\t\t\t\t<tr>  \r\n");
      out.write("\t\t\t\t\t\t<td>Text:</td>  \r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"myText\" id=\"myext\" size = \"100\" value=\"\"></td>  \r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"button\" onClick=\"fetchData();\" value=\"Click to Submit\"></td>  \r\n");
      out.write("\t\t\t\t\t</tr>  \r\n");
      out.write("\t\t\t\t</table>  \r\n");
      out.write("\t\t\t</form> \r\n");
      out.write("\t\t\t<div id=\"responseText\">\r\n");
      out.write("\t\t\t</div> \r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
