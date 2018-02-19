package br.com.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.entity.Pensamento;
import br.com.entity.Usuario;

public class PensamentoDao extends Dao {

	public boolean create(Pensamento p,Usuario u) throws Exception {
		try {
			open();
			stmt = con.prepareStatement("insert into pensamento (nome,conteudo,data,usuarioid) values (?,?,NOW(),?)");
			stmt.setString(1, p.getNome());
			stmt.setString(2, p.getConteudo());
			stmt.setInt(3, u.getId());
			stmt.execute();
			stmt.close();
			System.out.println(p);
			
			return true;
			
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

		finally {
			close();
		}

	}

	public boolean update(Pensamento p) throws Exception {
		try {
		open();
		
		stmt = con.prepareStatement("update pensamento set nome =?, conteudo =?  where id=?");
		stmt.setString(1, p.getNome());
		stmt.setString(2, p.getConteudo());
		stmt.setInt(3, p.getId());
		stmt.execute();
		stmt.close();
		return true;}
		
		catch(Exception e) {
			return false;
		}
		
		finally {
		close();}
	}

	public Pensamento findone(int id) throws Exception {
		open();
		stmt = con.prepareStatement("select*from pensamento where id ="+id);
		rs = stmt.executeQuery();
		if (rs.next()) {
			Pensamento p = new Pensamento();
			UsuarioDao usudao = new UsuarioDao();
			p.setId(rs.getInt(1));
			p.setNome(rs.getString(2));
			p.setConteudo(rs.getString(3));
			p.setData(rs.getString(4));
			p.setUsuario(usudao.findone(rs.getInt(5)));
			close();
			
			return p;
		} else
			return null;
	}

	public List<Pensamento> findall() throws Exception {
		open();
		stmt = con.prepareStatement("select * from pensamento");
		rs = stmt.executeQuery();
		List<Pensamento> lst = new ArrayList<Pensamento>();
		UsuarioDao usudao = new UsuarioDao();
		while (rs.next()) {
			Pensamento p = new Pensamento();
			p.setId(rs.getInt(1));
			p.setNome(rs.getString(2));
			p.setConteudo(rs.getString(3));
			p.setData(rs.getString(4));
			p.setUsuario(usudao.findone(rs.getInt(5)));
			lst.add(p);
		}
		close();
		return lst;
	}

	public boolean delete(int id) throws Exception {
		try {
			open();
			stmt = con.prepareStatement("delete from pensamento where id ="+id);
			stmt.execute();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			close();
		}

	}
	

	
	
}
