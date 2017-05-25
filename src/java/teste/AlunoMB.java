/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class AlunoMB {

    /**
     * Creates a new instance of AlunoMB
     */
    public AlunoMB() {
    }
    private List<Aluno> alunos;
    @PostConstruct
    public void init(){
        alunos = new ArrayList<Aluno>();
        Aluno a = new Aluno();
        a.setNome("João");
        a.setIdade(18);
        a.setEmail("joao@joao.com");
        alunos.add(a);
        a=new Aluno();
        a.setNome("Maria");
        a.setIdade(20);
        a.setEmail("maria@maria.com");
        alunos.add(a);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
}
