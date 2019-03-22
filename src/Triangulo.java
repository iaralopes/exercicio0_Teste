public class Triangulo {
    int lado1, lado2, lado3;


    public boolean saoValoresDeComprimentosValidos() {
        return lado1 > 0 && lado2 > 0 && lado3 > 0;
    }

    public boolean osComprimentosFormamUmTriangulo() {
        boolean osComprimentosFormamUmTriangulo = false;

        if (Math.abs(lado2 - lado3) < lado1 && lado1 < (lado2 + lado3) &&
                Math.abs(lado1 - lado3) < lado2 && lado2 < (lado1 + lado3) &&
                Math.abs(lado2 - lado1) < lado3 && lado3 < (lado2 + lado1)) {
            osComprimentosFormamUmTriangulo = true;
        }

        return osComprimentosFormamUmTriangulo;
    }

    public double obterAreaDoTriangulo() {
        if (osComprimentosFormamUmTriangulo()) {
            double area = 0.25 * Math.sqrt((this.lado1 + this.lado2 + this.lado3)
                    * (-this.lado1 + this.lado2 + this.lado3) *
                    (this.lado1 - this.lado2 + this.lado3) *
                    (this.lado1 + this.lado2 - this.lado3));
            return area;
        } else {
            return 0;
        }
    }

    public int obterPerimetroDoTriangulo() {
        if (osComprimentosFormamUmTriangulo()) {
            return lado1 + lado2 + lado3;
        } else {
            return 0;
        }
    }

    public boolean trianguloEquilatero() {
        boolean trianguloEquilatero = false;

        if (osComprimentosFormamUmTriangulo() &&
                lado1 == lado2 && lado2 == lado3) {
            trianguloEquilatero = true;
        }
        return trianguloEquilatero;
    }

    public boolean trianguloIsosceles() {
        boolean trianguloIsosceles = false;

        if (osComprimentosFormamUmTriangulo() &&
                (lado1 == lado2 && lado2 != lado3 ||
                        lado2 == lado3 && lado3 != lado1 ||
                        lado1 == lado3 && lado3 != lado2)) {
            trianguloIsosceles = true;
        }
        return trianguloIsosceles;
    }

    public boolean trianguloEscaleno() {
        boolean trianguloEscaleno = false;

        if (osComprimentosFormamUmTriangulo() &&
                lado1 != lado2 && lado2 != lado3
                && lado3 != lado1) {
            trianguloEscaleno = true;
        }
        return trianguloEscaleno;
    }

}
