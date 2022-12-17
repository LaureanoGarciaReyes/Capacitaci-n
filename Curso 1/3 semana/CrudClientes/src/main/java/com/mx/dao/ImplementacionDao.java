package com.mx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mx.conexion.ConexionDB;
import com.mx.conexion.Metodos;
import com.mx.entity.Clientes;

public class ImplementacionDao implements Metodos {

	ConexionDB db = new ConexionDB();
	Clientes cliente;

	@Override
	public String guardar(Object obj) {
		// TODO Auto-generated method stub
		cliente = (Clientes) obj; // casteo --> polimorfismo
		// crear una conexuon a la bd
		Connection conexion; // crear una conexion medinate el objeto -> conexion
		// abrir la conexion
		PreparedStatement pst; // prepar la conexion con el objeto pst
		// sentencia que permite guardar o insertar un registro en la base de datos
		String query = "INSERT INTO CLIENTES_XIIF VALUES(?,?,?,?,?,?,?)";
		// para poder recibir una respuesta del servidor
		String resultado = null;

		try {
			// cargar el driver de conexion
			Class.forName(db.getDriver());
			// abrir la conexion
			conexion = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			// ejecutar la sentencia sql --> query
			pst = conexion.prepareStatement(query);

			// pasar los parametros de mi objeto
			pst.setInt(1, cliente.getId());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getApp());
			pst.setString(4, cliente.getApm());
			pst.setLong(5, cliente.getTelefono());
			pst.setString(6, cliente.getCorreo());
			pst.setInt(7, cliente.getEstatus());

			// varible para insertar un obj

			int insertObj = pst.executeUpdate();
			/*
			 * ejecutar la declaracion SQL en este objeto -> prepareStatement --> debe de
			 * ser un declaracion del lenguaje de manipulacion de datos
			 * 
			 */

			if (insertObj > 0) {
				resultado = "1";
				System.out.println("Se guardo el cliente -> estatus " + resultado);

			} else {
				resultado = "0";
				System.out.println("No se guardo el cliente -> estatus " + insertObj);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al guardar el cliente " + e.getMessage());
		}
		return resultado;
	}

	@Override
	public String editar(Object obj) {

		cliente = (Clientes) obj; // casteo --> polimorfismo
		// crear una conexuon a la bd
		Connection conexion; // crear una conexion medinate el objeto -> conexion
		// abrir la conexion
		PreparedStatement pst; // prepar la conexion con el objeto pst
		// sentencia que permite guardar o insertar un registro en la base de datos
		String query = "UPDATE CLIENTES_XIIF SET NOMBRE=?,APP=?,APM=?,TELEFONO=?,CORREO=?,ESTATUS=? WHERE ID=?";
		// para poder recibir una respuesta del servidor
		String resultado = null;

		try {
			// cargar el driver de conexion
			Class.forName(db.getDriver());
			// abrir la conexion
			conexion = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			// ejecutar la sentencia sql --> query
			pst = conexion.prepareStatement(query);

			// pasar los parametros de mi objeto

			pst.setString(1, cliente.getNombre());
			pst.setString(2, cliente.getApp());
			pst.setString(3, cliente.getApm());
			pst.setLong(4, cliente.getTelefono());
			pst.setString(5, cliente.getCorreo());
			pst.setInt(6, cliente.getEstatus());
			pst.setInt(7, cliente.getId());

			// varible para insertar un obj

			int insertObj = pst.executeUpdate();
			/*
			 * ejecutar la declaracion SQL en este objeto -> prepareStatement --> debe de
			 * ser un declaracion del lenguaje de manipulacion de datos
			 * 
			 */

			if (insertObj > 0) {
				resultado = "1";
				System.out.println("Se edito el cliente -> estatus " + resultado);

			} else {
				resultado = "0";
				System.out.println("No se edito el cliente -> estatus " + insertObj);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al actualizar el cliente " + e.getMessage());
		}
		return resultado;

	}

	@Override
	public String eliminar(Object obj) {

		cliente = (Clientes) obj; // casteo --> polimorfismo
		// crear una conexuon a la bd
		Connection conexion; // crear una conexion medinate el objeto -> conexion
		// abrir la conexion
		PreparedStatement pst; // prepar la conexion con el objeto pst
		// sentencia que permite guardar o insertar un registro en la base de datos
		String query = "DELETE FROM CLIENTES_XIIF WHERE ID=?";
		// para poder recibir una respuesta del servidor
		String resultado = null;

		try {
			// cargar el driver de conexion
			Class.forName(db.getDriver());
			// abrir la conexion
			conexion = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			// ejecutar la sentencia sql --> query
			pst = conexion.prepareStatement(query);

			// pasar los parametros de mi objeto

			pst.setInt(1, cliente.getId());

			// varible para insertar un obj

			int insertObj = pst.executeUpdate();
			/*
			 * ejecutar la declaracion SQL en este objeto -> prepareStatement --> debe de
			 * ser un declaracion del lenguaje de manipulacion de datos
			 * 
			 */

			if (insertObj > 0) {
				resultado = "1";
				System.out.println("Se elimino el cliente -> estatus " + resultado);

			} else {
				resultado = "0";
				System.out.println("No se elimino el cliente -> estatus " + insertObj);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar el cliente " + e.getMessage());
		}
		return resultado;

	}

	@Override
	public Object buscar(Object obj) {
		cliente = (Clientes) obj; // casteo --> polimorfismo
		// crear una conexuon a la bd
		Connection conexion; // crear una conexion medinate el objeto -> conexion
		// abrir la conexion
		PreparedStatement pst; // prepar la conexion con el objeto pst
		// sentencia que permite guardar o insertar un registro en la base de datos
		String query = "SELECT * FROM CLIENTES_XIIF WHERE ID=" + cliente.getId();
		// para poder recibir una respuesta del servidor

		ResultSet rs = null; // este metodo de java para sql apunta a la fila actual

		try {
			// cargar el driver de conexion
			Class.forName(db.getDriver());
			// abrir la conexion
			conexion = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			// ejecutar la sentencia sql --> query
			pst = conexion.prepareStatement(query); // ejecuta la sentencia sql en este objeto
			// objeto que apunta a la fila actual --> id 
			rs = pst.executeQuery(query);
			
			if(rs.next()) {
			  cliente = new Clientes(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("APP"), rs.getString("APM"), rs.getLong("TELEFONO"), rs.getString("CORREO"), rs.getInt("ESTATUS"));
			  
			}

		} catch (Exception e) {
			System.out.println("Error al buscar "+e.getMessage());
		}

		return cliente;

	}

	@Override
	public List<Object> listar() {
		// voy a retornar todos los objetos de la lista --> lista 
		List<Object> lista = new ArrayList<Object>();
		// crear una conexuon a la bd
		Connection conexion; // crear una conexion medinate el objeto -> conexion
		// abrir la conexion
		PreparedStatement pst; // prepar la conexion con el objeto pst
		// sentencia que permite guardar o insertar un registro en la base de datos
		String query = "SELECT * FROM CLIENTES_XIIF";
		// para poder recibir una respuesta del servidor

		ResultSet rs = null; // este metodo de java para sql apunta a la fila actual

		try {
			// cargar el driver de conexion
			Class.forName(db.getDriver());
			// abrir la conexion
			conexion = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			// ejecutar la sentencia sql --> query
			pst = conexion.prepareStatement(query); // ejecuta la sentencia sql en este objeto
			// objeto que apunta a la fila actual --> id 
			rs = pst.executeQuery(query);
			
			if(rs.next()) {
			  lista.add( new Clientes(rs.getInt("ID"), rs.getString("NOMBRE"), rs.getString("APP"), rs.getString("APM"), rs.getLong("TELEFONO"), rs.getString("CORREO"), rs.getInt("ESTATUS")));
			  
			}

		} catch (Exception e) {
			System.out.println("Error al listar "+e.getLocalizedMessage());
		}

		return lista;

	
	}

}
