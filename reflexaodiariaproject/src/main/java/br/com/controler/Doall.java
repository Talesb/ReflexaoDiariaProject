package br.com.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.entity.Pensamento;
import br.com.entity.Usuario;
import br.com.persistence.PensamentoDao;
import br.com.persistence.UsuarioDao;

/**
 * Servlet implementation class Doall
 */
@WebServlet("/Doall")
public class Doall extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tarefa = request.getParameter("tarefa");

		if (tarefa == null) {
			throw new IllegalArgumentException("Você esqueceu de passar a tarefa!");
		}
		try {
			if (tarefa.equals("Cadastrar")) {
				Usuario usu = new Usuario();
				UsuarioDao usudao = new UsuarioDao();
				System.out.println(request.getParameter("nomeparam"));
				usu.setNome(request.getParameter("nomeparam"));
			    usu.setEmail(request.getParameter("emailparam"));
				usu.setSenha(request.getParameter("senhaparam"));
				usudao.create(usu);

			} else if(tarefa.equals("Login")) {
				try {

					
					PensamentoDao pesdao = new PensamentoDao();
					List<Pensamento> listap = pesdao.findall();

					Usuario u = new UsuarioDao().findbyemail(request.getParameter("emailparaml"),
							request.getParameter("senhaparaml"));

					if (u != null) {
						response.getWriter().write("True");

						HttpSession session = request.getSession();
						session.setAttribute("usuarioLogado", u);
						request.setAttribute("mensagem", "Usuário Logado: " + u.getNome());

						Usuario u2 = (Usuario) session.getAttribute("usuarioLogado");

						session.setAttribute("listap", listap);
			           
					} else {
			            response.getWriter().write("False");
						request.setAttribute("mensagem", "Não foi possível efetuar seu login");

					}

				} catch (Exception ex) {
					request.setAttribute("mensagem", "Erro" + ex.getMessage());

				}

			} else if (tarefa.equals("Logout")) {
				HttpSession session = request.getSession();
				if(request.getSession()!=null) {
					response.getWriter().write("True");
					session.removeAttribute("usuarioLogado");
					request.setAttribute("mensagem", "not logged in");
				}else {
				
				response.getWriter().write("False");
				}
				
			}

			else if (tarefa.equals("NovaReflexao")) {
				try {
					HttpSession session = request.getSession();
					Usuario usu = (Usuario) session.getAttribute("usuarioLogado");

					Pensamento pensamento = new Pensamento();
					PensamentoDao pensdao = new PensamentoDao();

					pensamento.setNome(request.getParameter("nomepensamento"));
					pensamento.setConteudo(request.getParameter("contpensamento"));
					pensamento.setUsuario(usu);

					List<Pensamento> listap = pensdao.findall();
					session.setAttribute("listap", listap);
					System.out.println(listap);

				}

				catch (Exception e) {
					System.out.println("Erro" + e.getMessage());
				}

			}

		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

}
