package alura.com.br;

import android.app.Application;

import alura.com.br.dao.AlunoDAO;
import alura.com.br.model.Aluno;

@SuppressWarnings("WeakerAccess")
public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunos();
    }

    private void criaAlunos() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Gustavo", "11222222222", "email@email.com"));
        dao.salva(new Aluno("Alex", "11222222222", "email2@email.com"));
    }
}
