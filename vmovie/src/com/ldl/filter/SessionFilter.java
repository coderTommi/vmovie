package com.ldl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ldl.ibatis.dbcp.pojo.User;

public class SessionFilter implements Filter{
	
	private static final String [] SESSION_URL_LIST={"/login"};
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpSession session = request.getSession();
		String uri = request.getRequestURI();
		if(isCheckSessionURI(uri)){
			User u = (User)session.getAttribute("User");
			if(u == null){
//				return 
				res.getWriter().print("error user msg");
			}
		}
		chain.doFilter(req, res);
	}
	
	private synchronized boolean isCheckSessionURI(String uri){
		int len = SESSION_URL_LIST.length;
		for(int i=0;i<len;i++){
			if(uri.equals(SESSION_URL_LIST[i])){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
