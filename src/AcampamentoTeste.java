public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        membro.setNome("Rodrigo");
        membro.setIdade(19);

        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();
    }
}