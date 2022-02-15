package executa;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

        // Mostrar o caminho das features
        features = "src/test/resources/features/",
        // Mostrar em qual package est�o os testes
        glue = "testes",
        // Tags para apontar ou n�o, a execu��o dos cen�rios
        tags = "@Executa and not @nExecuta",
        // Para formatar do console de acordo com o Cucumber, e gerar um report em html
        plugin = {"pretty", "html:target/report.html"},
        // Monochrome deixa o console com uma melhor visualiza��o, sem trazer caracteres especiais
        monochrome = true,
        // Deixa os metodos com padr�o da linguagem Java
        snippets = SnippetType.CAMELCASE,
        // N�o executa o teste ele, s� valida o mapeamento se faltar terminar alguma coisa, padr�o deixar false
        dryRun = false

)

public class Executar {



}
