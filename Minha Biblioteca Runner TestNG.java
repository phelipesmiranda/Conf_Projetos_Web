package executa;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

        // Mostrar o caminho das features
        features = "src/test/resources/features/",
        // Mostrar em qual package estão os testes
        glue = "testes",
        // Tags para apontar ou não, a execução dos cenários
        tags = "@Executa and not @nExecuta",
        // Para formatar do console de acordo com o Cucumber, e gerar um report em html
        plugin = {"pretty", "html:target/report.html"},
        // Monochrome deixa o console com uma melhor visualização, sem trazer caracteres especiais
        monochrome = true,
        // Deixa os metodos com padrão da linguagem Java
        snippets = SnippetType.CAMELCASE,
        // Não executa o teste ele, só valida o mapeamento se faltar terminar alguma coisa, padrão deixar false
        dryRun = false

)

public class Executar {



}
