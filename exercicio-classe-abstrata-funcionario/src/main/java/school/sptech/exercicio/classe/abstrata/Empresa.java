package school.sptech.exercicio.classe.abstrata;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList();

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void adicionarFunc(Funcionario funcionario) {
    
        funcionarios.add(funcionario);
        
    }
    
    public void exibeTodos() {
    
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }
    
    }

    public void exibeTotalSalario() {
    
        Double totalSalario = 0.0;
        
        for (Funcionario funcionario : funcionarios) {
            totalSalario += funcionario.calcSalario();
        }
        System.out.println(totalSalario);
    }
    
}
