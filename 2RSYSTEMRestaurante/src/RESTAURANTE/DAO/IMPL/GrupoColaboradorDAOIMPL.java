package RESTAURANTE.DAO.IMPL;


import RESTAURANTE.DAO.GrupoColaboradorDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.GrupoColaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GrupoColaboradorDAOIMPL implements GrupoColaboradorDAO {

    @Override
    public void inserir(GrupoColaborador grupoColaborador) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into grupoColaboradores value(?, ?)";
        try {

            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setLong(1, grupoColaborador.getCodigo());
            stmt.setString(2, grupoColaborador.getDescricao());
           
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(GrupoColaborador grupoColaborador) {
       Connection con = new Conexao().criarConexao();
        String sql = "update GrupoColaboradores set codigo = ?, descricao = ? where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, grupoColaborador.getDescricao());
            stmt.setLong(4, grupoColaborador.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(GrupoColaborador grupoColaborador) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from GrupoColaboradores"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, grupoColaborador.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            
        }
    }

    @Override
    public GrupoColaborador buscaPorId(Long codigo) {
        GrupoColaborador grupoColaborador = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select * from GrupoColaboradores"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, codigo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                grupoColaborador = new GrupoColaborador();
                grupoColaborador.setCodigo(rs.getLong("codigo"));
                grupoColaborador.setDescricao(rs.getString("descricao"));
            }
        } catch (SQLException ex) {
        }
        return grupoColaborador;
    }

    @Override
    public List<GrupoColaborador> buscarTodos() {
        List<GrupoColaborador> grupoColaboradores = new ArrayList<GrupoColaborador>();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from GrupoColaboradores";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                GrupoColaborador grupoColaborador = new GrupoColaborador();
                grupoColaborador.setCodigo(rs.getLong("codigo"));
                grupoColaborador.setDescricao(rs.getString("descricao"));
                

                grupoColaboradores.add(grupoColaborador);
            }
            
        } catch (SQLException ex){
            
        }
        return grupoColaboradores;
    }

}
 
