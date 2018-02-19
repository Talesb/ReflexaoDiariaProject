package br.com.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.entity.Usuario;

public class UsuarioDao extends Dao {

	public boolean create(Usuario u) throws Exception {
		try {
			open();
			stmt = con.prepareStatement("insert into usuario (nome,email,senha,adm) values (?,?,md5(?),false)");
			stmt.setString(1, u.getNome());
			stmt.setString(2, u.getEmail());
			stmt.setString(3, u.getSenha());
			stmt.execute();
			stmt.close();
			return true;
		}

		catch (Exception e) {
			return false;
		}

		finally {
			close();
		}

	}

	public boolean update(Usuario u) throws Exception {
		try {
		open();
		
		stmt = con.prepareStatement("update usuario set nome =?, email=?,senha=md5(?) where id=?");
		stmt.setString(1, u.getNome());
		stmt.setString(2, u.getEmail());
		stmt.setString(3, u.getSenha());
		stmt.setInt(4, u.getId());
		stmt.execute();
		System.out.println(u);
		stmt.close();
		return true;}
		
		catch(Exception e) {
			return false;
		}
		
		finally {
		close();}
	}

	public Usuario findone(int id) throws Exception {
		open();
		stmt = con.prepareStatement("select*from usuario where id ="+id);
		rs = stmt.executeQuery();
		if (rs.next()) {
			Usuario u = new Usuario();
			u.setId(rs.getInt(1));
			u.setNome(rs.getString(2));
			u.setEmail(rs.getString(3));
			u.setSenha(rs.getString(4));
			u.setAdm(rs.getBoolean(5));
			close();
			return u;
		} else
			return null;
	}

	public List<Usuario> findall() throws Exception {
		open();
		stmt = con.prepareStatement("select * from usuario");
		rs = stmt.executeQuery();
		List<Usuario> lst = new ArrayList<Usuario>();
		while (rs.next()) {
			Usuario u = new Usuario();
			u.setId(rs.getInt(1));
			u.setNome(rs.getString(2));
			u.setEmail(rs.getString(3));
			u.setSenha(rs.getString(4));
			u.setAdm(rs.getBoolean(5));
			lst.add(u);
		}
		close();
		return lst;
	}

	public boolean delete(int id) throws Exception {
		try {
			open();
			stmt = con.prepareStatement("delete from usuario where id ="+id);
			stmt.execute();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			close();
		}

	}
	
public Usuario findbyemail(String email,String senha) throws Exception{
	open();
	
	stmt = con.prepareStatement("Select*from usuario where email=? and senha=md5(?)");
	stmt.setString(1,email);
	stmt.setString(2,senha);
	rs = stmt.executeQuery();
	if (rs.next()) {
		Usuario u = new Usuario();
		u.setId(rs.getInt(1));
		u.setNome(rs.getString(2));
		u.setEmail(rs.getString(3));
		u.setSenha(rs.getString(4));
		u.setAdm(rs.getBoolean(5));
		close();
		return u;
	} else
		return null;
}
}
	

