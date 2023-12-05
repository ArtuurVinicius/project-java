public class Carros implements Requisitos {
    // Modelo do carro
    private String modelo;
    // Cor do carro
    private String cor;
    //Velocidade inicial do carro
    private int velocidadeInicial;
    // Velocidade máxima que o carro pode atingir
    private int velocidadeMaxima;
    //Velocidade atingida assim que a corrida inicia
    private int arranque;
    //Desempenho do carro nas curvas
    private int comportamento;

    public Carros(){
        this.velocidadeInicial = 0;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public int getVelocidadeInicial(){
        return velocidadeInicial;
    }
    public void setVelocidadeInicial(int velocidadeInicial){
        this.velocidadeInicial = velocidadeInicial;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public int getArranque(){
        return arranque;
    }
    public void setArranque(int arranque){
        this.arranque = arranque;
    }
    public int getComportamento() {
        return comportamento;
    }
    public void setComportamento(int comportamento){
        this.comportamento = comportamento;
    }

    public String trocarPneus(){
        return "Levou 10 segundos para trocar os pneus!";
    }

    public String fazerCurva(){
        return "Levou 4 segundos para fazer a curva";
    }

}
