package kr.co.soft.interceptor;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.servlet.HandlerInterceptor;

import kr.co.soft.beans.BoardInfoBean;
import kr.co.soft.beans.UserBean;
import kr.co.soft.service.TopMenuService;

public class TopMenuInterceptor implements HandlerInterceptor {
	//@Autowire를 사용할 수 있음
	@Autowired
	private TopMenuService topMenuService;
	
	@Resource
	@Lazy
	private UserBean loginUserBean;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		List<BoardInfoBean> topMenuList=topMenuService.getTopMenuList();
		request.setAttribute("topMenuList", topMenuList);
		request.setAttribute("loginUserBean", loginUserBean);
		return true;
	}

}
