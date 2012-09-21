
package RESTAURANTE.MODEL;

import java.util.Date;

public class Colaborador {
    private Integer codigo;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Date dataContradacao;
    private Date dataDemissao;
    private Float salario;
    private Pessoa pessoa;
    private GrupoColaboradores grupoColaboradores;

    public Colaborador(Integer codigo, String cpf, String rg, Date dataNascimento, Date dataContradacao,
                Date dataDemissao, Float salario, Pessoa pessoa, GrupoColaboradores grupoColaboradores) {
        
        setCodigo(codigo);
        setCpf(cpf);
        setRg(rg);
        setDataNascimento(dataNascimento);
        setDataContradacao(dataContradacao);
        setDataDemissao(dataDemissao);
        setSalario(salario);
        setPessoa(pessoa);
        setGrupoColaboradores(grupoColaboradores);

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataContradacao() {
        return dataContradacao;
    }

    public void setDataContradacao(Date dataContradacao) {
        this.dataContradacao = dataContradacao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public GrupoColaboradores getGrupoColaboradores() {
        return grupoColaboradores;
    }

    public void setGrupoColaboradores(GrupoColaboradores grupoColaboradores) {
        this.grupoColaboradores = grupoColaboradores;
    }
    
    
    
    
}