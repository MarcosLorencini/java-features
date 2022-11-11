package lambda.methodreference;

import java.util.function.Function;

public class MethodReference_CustomType {

    static class SuperHeroi {
        private Pessoa pessoa;

        public SuperHeroi(Pessoa pessoa) {
            this.pessoa = pessoa;
        }

        public static SuperHeroi crieSuperHeroi(Pessoa pessoa) {
            return new SuperHeroi(pessoa);
        }
    }

    static class Pessoa {

        public SuperHeroi vireSuperHeroi() {
            return new SuperHeroi(this);
        }
    }

    public static void main(String[] args) {
        // expressões lambda equivalentes utilizando chamada a método estático
        Function<Pessoa, SuperHeroi> transformaEmHeroiStatic1 = p -> SuperHeroi.crieSuperHeroi(p);
        Function<Pessoa, SuperHeroi> transformaEmHeroiStatic2 = SuperHeroi::crieSuperHeroi;

        // expressões lambda equivalentes utilizando construtor
        Function<Pessoa, SuperHeroi> transformaEmHeroiConstrutor1 = p -> new SuperHeroi(p);
       // Function<Pessoa, SuperHeroi> transformaEmHeroiConstrutor2 = p -> SuperHeroi::new;


    }
}
