/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2023-09-06 07:31:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bms.Book;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bms.Book");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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

	//リクエストスコープからのデータの取得
	Book book = (Book)request.getAttribute("book");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("\t\t<title>書籍管理システム</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h1 class=\"text-center\">書籍管理システムweb版ver.1.0</h1>\r\n");
      out.write("\t\t\t<hr class=\"border border-primary\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table style=\"margin:auto; width:850px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"text-align:center; width:80px\">[<a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/menu.jsp\">メニュー</a>]</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"text-align:center; width:80px\">[<a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/insert.jsp\">書籍登録</a>]</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"text-align:center; width:80px\">[<a href=\"");
      out.print(request.getContextPath() );
      out.write("/list\">書籍一覧</a>]</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"text-align:center; font-size:24px;\">書籍変更</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"width:80px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"width:80px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"width:80px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<hr class=\"menu-border\">\r\n");
      out.write("\t\t\t<div style=\"margin-bottom: 200px\" class=\"text-center d-flex justify-content-center gap-3\">\r\n");
      out.write("\t\t\t\t<div class=\"before-update\">\r\n");
      out.write("\t\t\t\t\t<h5>変更前情報</h5>\r\n");
      out.write("\t\t\t\t\t<p class=\"fw-bold\">ISBN: ");
      out.print( book.getIsbn() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"fw-bold\">Title: ");
      out.print( book.getTitle() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"fw-bold\">価格: ");
      out.print( book.getPrice() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<h5>変更後情報</h5>\r\n");
      out.write("\t\t\t\t\t<p class=\"fw-bold mb-2\">");
      out.print( book.getIsbn() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/update\"  method=\"GET\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"isbn\" value=\"");
      out.print( book.getIsbn());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control mb-2\" name=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"number\" class=\"form-control mb-2\" name=\"price\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"btn btn-primary\" type=\"submit\" value=\"変更完了\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<hr class=\"border border-primary\">\r\n");
      out.write("\t\t<p class=\"footer text-center\">Copyright (c) 2023 all rights reserved.</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
