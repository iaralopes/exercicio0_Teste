import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrianguloTest {
    Triangulo triangulo;

    @Before
    public void inicializador() {
        triangulo = new Triangulo();
    }

    //Teste 01 e 07
    @Test
    public void umComprimentoIgualZeroEhInvalido () {
        triangulo.lado1 = 3;
        triangulo.lado2 = 4;
        triangulo.lado3 = 0;

        assertFalse(triangulo.saoValoresDeComprimentosValidos());
    }

    //Teste 02
    @Test
    public void umComprimentoNegativoEhInvalido() {
        triangulo.lado1 = 3;
        triangulo.lado2 = -2;
        triangulo.lado3 = 4;

        assertFalse(triangulo.saoValoresDeComprimentosValidos());
    }

    //Teste 03 e 04
    @Test
    public void somaDoisLadosIgualAoComprimentoDoTerceiroEhTrianguloInvalido() {
        triangulo.lado1 = 3;
        triangulo.lado2 = 3;
        triangulo.lado3 = 6;

        assertFalse(triangulo.osComprimentosFormamUmTriangulo());
    }

    //Teste 05 e 06
    @Test
    public void somaDoisLadosMenorComprimentoDoTerceiroEhTrianguloInvalido() {
        triangulo.lado1 = 2;
        triangulo.lado2 = 4;
        triangulo.lado3 = 8;

        assertFalse(triangulo.osComprimentosFormamUmTriangulo());
    }

    //Teste 08
    @Test
    public void comprimentosNaoInteirosSaoInvalidos() {
        triangulo.lado1 = -1;
        triangulo.lado2 = 3;
        triangulo.lado3 = 5;

        assertFalse(triangulo.saoValoresDeComprimentosValidos());
    }

    //Teste 10
    @Test
    public void areaCalculadaCorretamenteQuandoTriangulo() {
        triangulo.lado1 = 3;
        triangulo.lado2 = 4;
        triangulo.lado3 = 5;

        assertEquals(6.0, triangulo.obterAreaDoTriangulo(), 0);
    }

    @Test
    public void perimetroCalculadoCorretamenteQuandoTriangulo() {
        triangulo.lado1 = 3;
        triangulo.lado2 = 4;
        triangulo.lado3 = 5;

        assertEquals(12, triangulo.obterPerimetroDoTriangulo());
    }

    //Teste 11
    @Test
    public void trianguloEscalenoQuandoTodosComprimentosDiferentes() {
        triangulo.lado1 = 5;
        triangulo.lado2 = 7;
        triangulo.lado3 = 8;

        assertTrue(triangulo.trianguloEscaleno());
    }

    //Teste 12
    @Test
    public void trianguloEquilateroQuandoTodosComprimentosIguais() {
        triangulo.lado1 = 4;
        triangulo.lado2 = 4;
        triangulo.lado3 = 4;

        assertTrue(triangulo.trianguloEquilatero());
    }

    //Teste 13 e 14
    @Test
    public void trianguloIsoscelesQuandoSomenteDoisComprimentosIguais() {
        triangulo.lado1 = 6;
        triangulo.lado2 = 5;
        triangulo.lado3 = 5;

        assertTrue(triangulo.trianguloIsosceles());
    }


}
