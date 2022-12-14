package lambda.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

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
        Function<Pessoa, SuperHeroi> transformaEmHeroiConstrutor2 = SuperHeroi::new;

        // expressões lambda equivalentes utilizando chamada de método comum,
        // mas referenciando o método da classe
        Function<Pessoa, SuperHeroi> transformaEmHeroiClasse1 = p -> p.vireSuperHeroi();
        Function<Pessoa, SuperHeroi> transformaEmHeroiClasse2 = Pessoa::vireSuperHeroi;

        // expressões lambda equivalentes utilizando chamada de método comum, mas
        //referenciando o método do objeto
        Pessoa pessoa = new Pessoa();
        Supplier<SuperHeroi> transformaEmHeroiInstancia1 = () -> pessoa.vireSuperHeroi();
        Supplier<SuperHeroi> transformaEmHeroiInstancia2 = pessoa::vireSuperHeroi;

        //Perceba a diferença entre as expressões lambda:
        //◦ Uma parte implementa a interface functional Function, pois recebem um argumento e
        //retornam um valor.
        //◦ A última implementa a interface functional Supplier, pois não recebe argumento, mas
        //retorna um valor.
        //Em caso de dúvidas, consulte novamente os tipos de interfaces funcionais nas outras seções
        //deste capítulo.






    }
}
