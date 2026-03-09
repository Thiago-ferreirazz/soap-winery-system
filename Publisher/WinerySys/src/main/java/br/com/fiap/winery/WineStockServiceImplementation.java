package br.com.fiap.winery;
import jakarta.jws.WebService;
@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    @Override
    public String getMenu() {
        return "=== Menu de Vinhos ===\n" +
               "Uva Cabernet Sauvignon: Vinho Tinto Seco - R$ 89,90\n" +
               "Uva Merlot: Vinho Tinto Suave - R$ 74,90\n" +
               "Uva Chardonnay: Vinho Branco Seco - R$ 69,90\n" +
               "Uva Pinot Noir: Vinho Tinto Encorpado - R$ 119,90\n" +
               "Uva Sauvignon Blanc: Vinho Branco Frutado - R$ 64,90\n" +
               "Uva Moscato: Vinho Branco Doce - R$ 54,90\n" +
               "Uva Syrah: Vinho Tinto Especiado - R$ 99,90\n" +
               "Uva Riesling: Vinho Branco Aromático - R$ 79,90";
    }
    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! Cliente: " + name + " | Quantidade: " + quantity;
    }
}
