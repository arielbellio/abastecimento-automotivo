public class Abastecimento {
    private final String codigoPostoGasolina;
    private final String codigoBomba;
    private final Combustivel combustivel;
    private final int qtdAbastecimento;
    private final double precoLitro;
    private final double desconto;

    public Abastecimento(String codigoPostoGasolina, String codigoBomba, Combustivel combustivel, int qtdAbastecimento,
            double precoLitro, double desconto) {
        if (codigoPostoGasolina == null || codigoBomba == null || qtdAbastecimento == 0 || precoLitro == 0.0) {
            throw new IllegalArgumentException("Todas as informações do abastecimento, com exceção do desconto, são obrigatórias.");
        }
        this.codigoPostoGasolina = codigoPostoGasolina;
        this.codigoBomba = codigoBomba;
        this.combustivel = combustivel;
        this.qtdAbastecimento = qtdAbastecimento;
        this.precoLitro = precoLitro;
        this.desconto = desconto;
    }

    public Abastecimento(String codigoPostoGasolina, String codigoBomba, Combustivel combustivel, int qtdAbastecimento,
            double precoLitro) {
        if (codigoPostoGasolina == null || codigoBomba == null || qtdAbastecimento == 0 || precoLitro == 0.0) {
            throw new IllegalArgumentException("Todas as informações do abastecimento, com exceção do desconto, são obrigatórias.");
        }
        this.codigoPostoGasolina = codigoPostoGasolina;
        this.codigoBomba = codigoBomba;
        this.combustivel = combustivel;
        this.qtdAbastecimento = qtdAbastecimento;
        this.precoLitro = precoLitro;
        this.desconto = 0.0;
    }

    public String getCodigoPostoGasolina() {
        return codigoPostoGasolina;
    }

    public String getCodigoBomba() {
        return codigoBomba;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public int getQtdAbastecimento() {
        return qtdAbastecimento;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public double getDesconto() {
        return desconto;
    }

    public double custoBrutoAbastecimento(){
        return precoLitro*qtdAbastecimento;
    }

    public double custoLiquidoAbastecimento(){
        if (desconto != 0.0) {
            return custoBrutoAbastecimento()*(100-desconto)/100;
        }
        return custoBrutoAbastecimento();
    }
}
