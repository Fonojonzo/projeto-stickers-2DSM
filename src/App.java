import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        
      // fazer uma conexão HTTP e buscar os top 250 filmes do IMDB
      String url = "https://imdb-api.com/en/API/Top250Movies/k_55g4qyyu";

      URI endereco = URI.create(url);

      HttpClient client = HttpClient.newHttpClient();

      HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();

      HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

      String body = response.body(); 

      System.out.println(body);

      // extrair só os dados que interessam (titulo, poster, classificação)

      // exibir e manipular os dados

    }
}
