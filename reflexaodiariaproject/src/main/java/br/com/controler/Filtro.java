package br.com.controler;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.entity.Usuario;


@WebFilter(urlPatterns="/*")
public class Filtro implements Filter{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		String usua="<deslogado";
		HttpSession session = req.getSession();
 Usuario usuariologado =(Usuario) session.getAttribute("usuarioLogado");
	if(usuariologado!=null)usua=usuariologado.getNome();
		
		System.out.println("O Usuário: "+usua+" está acessando: "+uri);
		chain.doFilter(request,response);

		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
