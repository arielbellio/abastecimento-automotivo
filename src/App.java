public class App {
    public static void main(String[] args) throws Exception {

        Abastecimento abast = new Abastecimento("8X99GR4SKK2", "8099JL23HHJ", Combustivel.ALCOOL, 12, 5.69);
        System.out.printf("Custo bruto do abastecimento com %s: %.1f\n", Combustivel.ALCOOL, abast.custoBrutoAbastecimento());
        System.out.printf("Custo líquido do abastecimento com %s: %.1f\n", Combustivel.ALCOOL, abast.custoLiquidoAbastecimento());

        Abastecimento abast2 = new Abastecimento("8X99GR4SKK2", "8099JL23HHJ", Combustivel.GASOLINA_COMUM, 20, 7.22, 20.0);
        System.out.printf("Custo bruto do abastecimento com %s: %.1f\n", Combustivel.GASOLINA_COMUM, abast2.custoBrutoAbastecimento());
        System.out.printf("Custo líquido do abastecimento com %s: %.1f\n", Combustivel.GASOLINA_COMUM, abast2.custoLiquidoAbastecimento());
    }
}
